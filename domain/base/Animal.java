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

    public abstract boolean isEnLineaDefensiva();

    public abstract void setEnLineaDefensiva(boolean enLineaDefensiva);

}
