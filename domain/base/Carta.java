package domain.base;

public interface Carta {
    public boolean isSePuedeBajarAlTablero();

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero);

    public boolean isEnCementerio();

    public void setEnCementerio(boolean enCementerio);

    public int getId();
}