# UONET+ Java SDK

**Biblioteka jest wątpliwej jakości.**

Libka implementuje niewielki subset mobilnego API dziennika elektronicznego Vulcan UONET+. Słuzyła do wyciągania informacji na temat zastępstw/sprawdzianóœ i updatowania postu na grupie facebookowej.

## Building

```bash
mvn clean install
```

## Przykładowe użycie

```java
public static void main(String... args) throws UONETException {
    Certyfikat.TokenCertificate cert = new Certyfikat.TokenCertificate();
    cert.setCertyfikatKlucz("klucz");
    cert.setCertyfikatPfx("pfx");
    cert.setAdresBazowyRestApi("https://uonetplus-komunikacja.edu.gdansk.pl/gdansk");
    UONETClient client = new UONETClient(cert);
    Uczniowie uczniowie = client.doRequest(new UczniowieRequest());
    Uczniowie.Uczen pupil = uczniowie.getData().get(0);

    Slowniki.Slownik dict = client.doRequest(pupil, new SlownikiRequest()).getData();

    Date now = new Date();
    Date from = (Date) now.clone();
    //  3hours                   second min hour 3 hours
    from.setTime(now.getTime() - 1000 * 60 * 60 * 24);
    Date to = (Date) now.clone();

    to.setTime(now.getTime() + 1000 * 60 * 60 * 24 * 10);

    List<PlanLekcji.Lekcja> tt = client.doRequest(pupil, new PlanLekcjiRequest(from, to, true)).getData();
    StringBuilder template = new StringBuilder("♠ Zmiany w planie ♠");
    tt.sort((o1, o2) -> {
        if (o1.getDzien().equals(o2.getDzien())) {
            return o1.getNumerLekcji() - o2.getNumerLekcji();
        }
        return o1.getDzien() - o2.getDzien();
    });

    int size = 0;
    for (PlanLekcji.Lekcja tc : tt) {
        Slowniki.Pracownik emp = dict.getPracownik(tc.getIdPracownikOld() != null ? tc.getIdPracownikOld() : tc.getIdPracownik());
        if (tc.getAdnotacjaOZmianie() != null && !tc.getAdnotacjaOZmianie().isEmpty()) {
            size++;
            template.append(String.format("\n⚪[%s] %d.%s (oryg. %s %s): %s", tc.getDzienTekst(), tc.getNumerLekcji(), tc.getPrzedmiotNazwa(), emp.getImie(), emp.getNazwisko(), tc.getAdnotacjaOZmianie()));
        }
    }
    if (size == 0) {
        template.append("\nBrak");
    }

    to.setTime(now.getTime() + 1000 * 60 * 60 * 24 * 6 * 30);
    Sprawdziany exams = client.doRequest(pupil, new SprawdzianyRequest(from, to));

    template.append("\n\n♠ Sprawdziany ♠");

    exams.getData().sort(Comparator.comparingInt(Sprawdziany.Sprawdzian::getData));
    for (Sprawdziany.Sprawdzian exam : exams.getData()) {
        Slowniki.Pracownik emp = dict.getPracownik(exam.getIdPracownik());
        Slowniki.Przedmiot subj = dict.getPrzedmiot(exam.getIdPrzedmiot());
        template.append(String.format("\n⚪[%s] %s(%s %s): %s", exam.getDataTekst(), subj.getNazwa(), emp.getImie(), emp.getNazwisko(), exam.getOpis()));
    }

    template.append("\n\nWygenerowano: " + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(now));
    System.out.println(template.toString());

}

```