package net.maciekmm.uonet.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class SprawdzianyRequest extends UczenAwareRequestBase<Sprawdziany> {

    @JsonProperty("DataPoczatkowa")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataPoczatkowa;
    @JsonProperty("DataKoncowa")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataKoncowa;

    public SprawdzianyRequest(Date dataPoczatkowa, Date dataKoncowa) {
        this.dataPoczatkowa = dataPoczatkowa;
        this.dataKoncowa = dataKoncowa;
    }

    @Override
    public String getPath() {
        return "Sprawdziany";
    }

    public Date getDataPoczatkowa() {
        return this.dataPoczatkowa;
    }

    public void setDataPoczatkowa(Date dataPoczatkowa) {
        this.dataPoczatkowa = dataPoczatkowa;
    }

    public Date getDataKoncowa() {
        return this.dataKoncowa;
    }

    public void setDataKoncowa(Date dataKoncowa) {
        this.dataKoncowa = dataKoncowa;
    }
}
