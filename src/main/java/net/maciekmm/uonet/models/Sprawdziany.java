package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Sprawdziany extends ResponseBase<List<Sprawdziany.Sprawdzian>> {
    public static class Sprawdzian {
        @JsonProperty("Id")
        private Integer id;
        @JsonProperty("IdPrzedmiot")
        private Integer idPrzedmiot;
        @JsonProperty("IdPracownik")
        private Integer idPracownik;
        @JsonProperty("IdOddzial")
        private Integer idOddzial;
        @JsonProperty("IdPodzial")
        private Integer idPodzial;
        @JsonProperty("PodzialNazwa")
        private String podzialNazwa;
        @JsonProperty("PodzialSkrot")
        private String podzialSkrot;
        @JsonProperty("Rodzaj")
        private Boolean rodzaj;
        @JsonProperty("Opis")
        private String opis;
        @JsonProperty("Data")
        private Integer data;
        @JsonProperty("DataTekst")
        private String dataTekst;

        public Integer getId() {
            return this.id;
        }

        public Integer getIdPrzedmiot() {
            return this.idPrzedmiot;
        }

        public Integer getIdPracownik() {
            return this.idPracownik;
        }

        public Integer getIdOddzial() {
            return this.idOddzial;
        }

        public Integer getIdPodzial() {
            return this.idPodzial;
        }

        public String getPodzialNazwa() {
            return this.podzialNazwa;
        }

        public String getPodzialSkrot() {
            return this.podzialSkrot;
        }

        public Boolean getRodzaj() {
            return this.rodzaj;
        }

        public String getOpis() {
            return this.opis;
        }

        public Integer getData() {
            return this.data;
        }

        public String getDataTekst() {
            return this.dataTekst;
        }
    }
}
