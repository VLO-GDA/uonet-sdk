package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by maciekmm on 9/12/16.
 */
public class Uczniowie extends ResponseBase<List<Uczniowie.Uczen>> {
    public static class Uczen {
        @JsonProperty("IdOkresKlasyfikacyjny")
        private Integer idOkresKlasyfikacyjny;
        @JsonProperty("OkresPoziom")
        private Integer okresPoziom;
        @JsonProperty("OkresNumer")
        private Integer okresNumer;
        @JsonProperty("OkresDataOd")
        private Integer okresDataOd;
        @JsonProperty("OkresDataDo")
        private Integer okresDataDo;
        @JsonProperty("OkresDataOdTekst")
        private String okresDataOdTekst;
        @JsonProperty("OkresDataDoTekst")
        private String okresDataDoTekst;
        @JsonProperty("IdJednostkaSprawozdawcza")
        private Integer idJednostkaSprawozdawcza;
        @JsonProperty("JednostkaSprawozdawczaSkrot")
        private String jednostkaSprawozdawczaSkrot;
        @JsonProperty("JednostkaSprawozdawczaNazwa")
        private String jednostkaSprawozdawczaNazwa;
        @JsonProperty("JednostkaSprawozdawczaSymbol")
        private String jednostkaSprawozdawczaSymbol;
        @JsonProperty("IdJednostka")
        private Integer idJednostka;
        @JsonProperty("JednostkaNazwa")
        private String jednostkaNazwa;
        @JsonProperty("JednostkaSkrot")
        private String jednostkaSkrot;
        @JsonProperty("OddzialSymbol")
        private String oddzialSymbol;
        @JsonProperty("OddzialKod")
        private String oddzialKod;
        @JsonProperty("UzytkownikRola")
        private String uzytkownikRola;
        @JsonProperty("UzytkownikLogin")
        private String uzytkownikLogin;
        @JsonProperty("UzytkownikLoginId")
        private Integer uzytkownikLoginId;
        @JsonProperty("UzytkownikNazwa")
        private String uzytkownikNazwa;
        @JsonProperty("Id")
        private Integer id;
        @JsonProperty("IdOddzial")
        private Integer idOddzial;
        @JsonProperty("Imie")
        private String imie;
        @JsonProperty("Imie2")
        private String imie2;
        @JsonProperty("Nazwisko")
        private String nazwisko;
        @JsonProperty("Pseudonim")
        private Object pseudonim;
        @JsonProperty("UczenPlec")
        private Integer uczenPlec;
        @JsonProperty("Pozycja")
        private Integer pozycja;

        public Integer getIdOkresKlasyfikacyjny() {
            return this.idOkresKlasyfikacyjny;
        }

        public void setIdOkresKlasyfikacyjny(Integer idOkresKlasyfikacyjny) {
            this.idOkresKlasyfikacyjny = idOkresKlasyfikacyjny;
        }

        public Integer getOkresPoziom() {
            return this.okresPoziom;
        }

        public void setOkresPoziom(Integer okresPoziom) {
            this.okresPoziom = okresPoziom;
        }

        public Integer getOkresNumer() {
            return this.okresNumer;
        }

        public void setOkresNumer(Integer okresNumer) {
            this.okresNumer = okresNumer;
        }

        public Integer getOkresDataOd() {
            return this.okresDataOd;
        }

        public void setOkresDataOd(Integer okresDataOd) {
            this.okresDataOd = okresDataOd;
        }

        public Integer getOkresDataDo() {
            return this.okresDataDo;
        }

        public void setOkresDataDo(Integer okresDataDo) {
            this.okresDataDo = okresDataDo;
        }

        public String getOkresDataOdTekst() {
            return this.okresDataOdTekst;
        }

        public void setOkresDataOdTekst(String okresDataOdTekst) {
            this.okresDataOdTekst = okresDataOdTekst;
        }

        public String getOkresDataDoTekst() {
            return this.okresDataDoTekst;
        }

        public void setOkresDataDoTekst(String okresDataDoTekst) {
            this.okresDataDoTekst = okresDataDoTekst;
        }

        public Integer getIdJednostkaSprawozdawcza() {
            return this.idJednostkaSprawozdawcza;
        }

        public void setIdJednostkaSprawozdawcza(Integer idJednostkaSprawozdawcza) {
            this.idJednostkaSprawozdawcza = idJednostkaSprawozdawcza;
        }

        public String getJednostkaSprawozdawczaSkrot() {
            return this.jednostkaSprawozdawczaSkrot;
        }

        public void setJednostkaSprawozdawczaSkrot(String jednostkaSprawozdawczaSkrot) {
            this.jednostkaSprawozdawczaSkrot = jednostkaSprawozdawczaSkrot;
        }

        public String getJednostkaSprawozdawczaNazwa() {
            return this.jednostkaSprawozdawczaNazwa;
        }

        public void setJednostkaSprawozdawczaNazwa(String jednostkaSprawozdawczaNazwa) {
            this.jednostkaSprawozdawczaNazwa = jednostkaSprawozdawczaNazwa;
        }

        public String getJednostkaSprawozdawczaSymbol() {
            return this.jednostkaSprawozdawczaSymbol;
        }

        public void setJednostkaSprawozdawczaSymbol(String jednostkaSprawozdawczaSymbol) {
            this.jednostkaSprawozdawczaSymbol = jednostkaSprawozdawczaSymbol;
        }

        public Integer getIdJednostka() {
            return this.idJednostka;
        }

        public void setIdJednostka(Integer idJednostka) {
            this.idJednostka = idJednostka;
        }

        public String getJednostkaNazwa() {
            return this.jednostkaNazwa;
        }

        public void setJednostkaNazwa(String jednostkaNazwa) {
            this.jednostkaNazwa = jednostkaNazwa;
        }

        public String getJednostkaSkrot() {
            return this.jednostkaSkrot;
        }

        public void setJednostkaSkrot(String jednostkaSkrot) {
            this.jednostkaSkrot = jednostkaSkrot;
        }

        public String getOddzialSymbol() {
            return this.oddzialSymbol;
        }

        public void setOddzialSymbol(String oddzialSymbol) {
            this.oddzialSymbol = oddzialSymbol;
        }

        public String getOddzialKod() {
            return this.oddzialKod;
        }

        public void setOddzialKod(String oddzialKod) {
            this.oddzialKod = oddzialKod;
        }

        public String getUzytkownikRola() {
            return this.uzytkownikRola;
        }

        public void setUzytkownikRola(String uzytkownikRola) {
            this.uzytkownikRola = uzytkownikRola;
        }

        public String getUzytkownikLogin() {
            return this.uzytkownikLogin;
        }

        public void setUzytkownikLogin(String uzytkownikLogin) {
            this.uzytkownikLogin = uzytkownikLogin;
        }

        public Integer getUzytkownikLoginId() {
            return this.uzytkownikLoginId;
        }

        public void setUzytkownikLoginId(Integer uzytkownikLoginId) {
            this.uzytkownikLoginId = uzytkownikLoginId;
        }

        public String getUzytkownikNazwa() {
            return this.uzytkownikNazwa;
        }

        public void setUzytkownikNazwa(String uzytkownikNazwa) {
            this.uzytkownikNazwa = uzytkownikNazwa;
        }

        public Integer getId() {
            return this.id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getIdOddzial() {
            return this.idOddzial;
        }

        public void setIdOddzial(Integer idOddzial) {
            this.idOddzial = idOddzial;
        }

        public String getImie() {
            return this.imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getImie2() {
            return this.imie2;
        }

        public void setImie2(String imie2) {
            this.imie2 = imie2;
        }

        public String getNazwisko() {
            return this.nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public Object getPseudonim() {
            return this.pseudonim;
        }

        public void setPseudonim(Object pseudonim) {
            this.pseudonim = pseudonim;
        }

        public Integer getUczenPlec() {
            return this.uczenPlec;
        }

        public void setUczenPlec(Integer uczenPlec) {
            this.uczenPlec = uczenPlec;
        }

        public Integer getPozycja() {
            return this.pozycja;
        }

        public void setPozycja(Integer pozycja) {
            this.pozycja = pozycja;
        }

        @Override
        public String toString() {
            return "Uczen{" +
                    "idOkresKlasyfikacyjny=" + idOkresKlasyfikacyjny +
                    ", okresPoziom=" + okresPoziom +
                    ", okresNumer=" + okresNumer +
                    ", okresDataOd=" + okresDataOd +
                    ", okresDataDo=" + okresDataDo +
                    ", okresDataOdTekst='" + okresDataOdTekst + '\'' +
                    ", okresDataDoTekst='" + okresDataDoTekst + '\'' +
                    ", idJednostkaSprawozdawcza=" + idJednostkaSprawozdawcza +
                    ", jednostkaSprawozdawczaSkrot='" + jednostkaSprawozdawczaSkrot + '\'' +
                    ", jednostkaSprawozdawczaNazwa='" + jednostkaSprawozdawczaNazwa + '\'' +
                    ", jednostkaSprawozdawczaSymbol='" + jednostkaSprawozdawczaSymbol + '\'' +
                    ", idJednostka=" + idJednostka +
                    ", jednostkaNazwa='" + jednostkaNazwa + '\'' +
                    ", jednostkaSkrot='" + jednostkaSkrot + '\'' +
                    ", oddzialSymbol='" + oddzialSymbol + '\'' +
                    ", oddzialKod='" + oddzialKod + '\'' +
                    ", uzytkownikRola='" + uzytkownikRola + '\'' +
                    ", uzytkownikLogin='" + uzytkownikLogin + '\'' +
                    ", uzytkownikLoginId=" + uzytkownikLoginId +
                    ", uzytkownikNazwa='" + uzytkownikNazwa + '\'' +
                    ", id=" + id +
                    ", idOddzial=" + idOddzial +
                    ", imie='" + imie + '\'' +
                    ", imie2='" + imie2 + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", pseudonim=" + pseudonim +
                    ", uczenPlec=" + uczenPlec +
                    ", pozycja=" + pozycja +
                    '}';
        }
    }
}
