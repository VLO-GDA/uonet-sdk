package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class UczenAwareRequestBase<T> extends RequestBase<T> {
    @JsonProperty("IdUczen")
    private Integer idUczen;
    @JsonProperty("IdOkresKlasyfikacyjny")
    private Integer idOkresKlasyfikacyjny;
    @JsonProperty("IdOddzial")
    private Integer idOddzial;

    public Integer getIdUczen() {
        return this.idUczen;
    }

    public void setIdUczen(Integer idUczen) {
        this.idUczen = idUczen;
    }

    public Integer getIdOkresKlasyfikacyjny() {
        return this.idOkresKlasyfikacyjny;
    }

    public void setIdOkresKlasyfikacyjny(Integer idOkresKlasyfikacyjny) {
        this.idOkresKlasyfikacyjny = idOkresKlasyfikacyjny;
    }

    public Integer getIdOddzial() {
        return this.idOddzial;
    }

    public void setIdOddzial(Integer idOddzial) {
        this.idOddzial = idOddzial;
    }
}
