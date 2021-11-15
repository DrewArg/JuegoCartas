package domain.base;

public abstract class Animal implements Carta {

    protected abstract void atacar();

    protected abstract void defender();

    public abstract String getNombre();

    public abstract String getTipo();

    public abstract int getId();

    public abstract String getEfecto();

    public abstract int getCoste();

    public abstract int getDano();

    public abstract boolean isEnLineaDeReposo();

    public abstract void setEnLineaDeReposo(boolean enLineaDeReposo);

    public abstract boolean isEnLineaDeBatalla();

    public abstract void setEnLineaDeBatalla(boolean enLineaDeBatalla);

    public abstract boolean isEnCementerio();

    public abstract void setEnCementerio(boolean enCementerio);

}
