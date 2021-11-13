package domain.base;

public class Alimento implements Carta {
    private int id;
    private String tipo = "Alimento";

    private boolean sePuedeBajarAlTablero;
    private boolean enReservaDeAlimentos;
    private boolean alimentoConsumido;

    public Alimento(int id) {
        this.id = id;
        sePuedeBajarAlTablero = false;
        enReservaDeAlimentos = false;
        alimentoConsumido = false;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }

    public boolean isEnReservaDeAlimentos() {
        return enReservaDeAlimentos;
    }

    public void setEnReservaDeAlimentos(boolean enReservaDeAlimentos) {
        this.enReservaDeAlimentos = enReservaDeAlimentos;
    }

    public boolean isAlimentoConsumido() {
        return alimentoConsumido;
    }

    public void setAlimentoConsumido(boolean alimentoConsumido) {
        this.alimentoConsumido = alimentoConsumido;
    }
}
