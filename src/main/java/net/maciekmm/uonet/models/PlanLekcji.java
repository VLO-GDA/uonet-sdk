package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PlanLekcji extends ResponseBase<List<PlanLekcji.Lekcja>> {
    public static class Lekcja {
        @JsonProperty("Dzien")
        private Integer dzien;
        @JsonProperty("DzienTekst")
        private String dzienTekst;
        @JsonProperty("NumerLekcji")
        private Integer numerLekcji;
        @JsonProperty("IdPoraLekcji")
        private Integer idPoraLekcji;
        @JsonProperty("IdPrzedmiot")
        private Integer idPrzedmiot;
        @JsonProperty("PrzedmiotNazwa")
        private String przedmiotNazwa;
        @JsonProperty("PodzialSkrot")
        private String podzialSkrot;
        @JsonProperty("Sala")
        private String sala;
        @JsonProperty("IdPracownik")
        private Integer idPracownik;
        @JsonProperty("IdPracownikWspomagajacy")
        private Integer idPracownikWspomagajacy;
        @JsonProperty("IdPracownikOld")
        private Integer idPracownikOld;
        @JsonProperty("IdPracownikWspomagajacyOld")
        private Integer idPracownikWspomagajacyOld;
        @JsonProperty("IdPlanLekcji")
        private Integer idPlanLekcji;
        @JsonProperty("AdnotacjaOZmianie")
        private String adnotacjaOZmianie;
        @JsonProperty("PrzekreslonaNazwa")
        private boolean przekreslonaNazwa;
        @JsonProperty("PogrubionaNazwa")
        private boolean pogrubionaNazwa;
        @JsonProperty("PlanUcznia")
        private boolean planUcznia;

        public Integer getDzien() {
            return this.dzien;
        }

        public String getDzienTekst() {
            return this.dzienTekst;
        }

        public Integer getNumerLekcji() {
            return this.numerLekcji;
        }

        public Integer getIdPoraLekcji() {
            return this.idPoraLekcji;
        }

        public Integer getIdPrzedmiot() {
            return this.idPrzedmiot;
        }

        public String getPrzedmiotNazwa() {
            return this.przedmiotNazwa;
        }

        public String getPodzialSkrot() {
            return this.podzialSkrot;
        }

        public String getSala() {
            return this.sala;
        }

        public Integer getIdPracownik() {
            return this.idPracownik;
        }

        public Integer getIdPracownikWspomagajacy() {
            return this.idPracownikWspomagajacy;
        }

        public Integer getIdPracownikOld() {
            return this.idPracownikOld;
        }

        public Integer getIdPracownikWspomagajacyOld() {
            return this.idPracownikWspomagajacyOld;
        }

        public Integer getIdPlanLekcji() {
            return this.idPlanLekcji;
        }

        public String getAdnotacjaOZmianie() {
            return this.adnotacjaOZmianie;
        }

        public Boolean getPrzekreslonaNazwa() {
            return this.przekreslonaNazwa;
        }

        public Boolean getPogrubionaNazwa() {
            return this.pogrubionaNazwa;
        }

        public Boolean getPlanUcznia() {
            return this.planUcznia;
        }

        @Override
        public String toString() {
            return "Lekcja{" +
                    "dzien=" + dzien +
                    ", dzienTekst='" + dzienTekst + '\'' +
                    ", numerLekcji=" + numerLekcji +
                    ", idPoraLekcji=" + idPoraLekcji +
                    ", idPrzedmiot=" + idPrzedmiot +
                    ", przedmiotNazwa='" + przedmiotNazwa + '\'' +
                    ", podzialSkrot='" + podzialSkrot + '\'' +
                    ", sala='" + sala + '\'' +
                    ", idPracownik=" + idPracownik +
                    ", idPracownikWspomagajacy=" + idPracownikWspomagajacy +
                    ", idPracownikOld=" + idPracownikOld +
                    ", idPracownikWspomagajacyOld=" + idPracownikWspomagajacyOld +
                    ", idPlanLekcji=" + idPlanLekcji +
                    ", adnotacjaOZmianie='" + adnotacjaOZmianie + '\'' +
                    ", przekreslonaNazwa=" + przekreslonaNazwa +
                    ", pogrubionaNazwa=" + pogrubionaNazwa +
                    ", planUcznia=" + planUcznia +
                    '}';
        }
    }
}