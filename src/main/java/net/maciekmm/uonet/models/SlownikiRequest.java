package net.maciekmm.uonet.models;

public class SlownikiRequest extends UczenAwareRequestBase<Slowniki> {
    @Override
    public String getPath() {
        return "Slowniki";
    }
}
