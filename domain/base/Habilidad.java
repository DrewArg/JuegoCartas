package domain.base;

public abstract class Habilidad implements Carta {

    public abstract String getNombre();

    public abstract String getTipo();

    public abstract int getId();

    public abstract String getEfecto();

    public abstract int getCoste();

    public abstract void activarEfecto();

    public abstract boolean isEnCementerio();

    public abstract void setEnCementerio(boolean enCementerio);

}
