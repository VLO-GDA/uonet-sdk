package net.maciekmm.uonet.models;

public class UczniowieRequest extends RequestBase<Uczniowie> {
    @Override
    public String getPath() {
        return "ListaUczniow";
    }
}
