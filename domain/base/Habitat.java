package domain.base;

public abstract class Habitat implements Carta {
    public abstract String getNombre();

    public abstract String getTipo();

    public abstract String getId();

    public abstract String getEfecto();

    public abstract int getCoste();

    public abstract void activarEfecto();

}
