package domain.derivada.animal.animalTerrestre;

import domain.base.Animal;

public class LoboGris extends Animal {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    private boolean sePuedeBajarAlTablero;
    private boolean enLineaDeReposo;
    private boolean enLineaDeBatalla;
    private boolean enCementerio;

    public LoboGris(int id) {
        this.id = id;
        nombre = "Lobo Gris";
        tipo = "Animal";
        efecto = "Gana +1 de daño por cada Lobo Gris en Juego";
        coste = 3;
        dano = 2;

        sePuedeBajarAlTablero = false;
        enLineaDeReposo = false;
        enLineaDeBatalla = false;
        enCementerio = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getCoste() {
        return coste;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void activarEfecto() {

    }

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }

    public boolean isEnLineaDeReposo() {
        return enLineaDeReposo;
    }

    public void setEnLineaDeReposo(boolean enLineaDeReposo) {
        this.enLineaDeReposo = enLineaDeReposo;
    }

    public boolean isEnLineaDeBatalla() {
        return enLineaDeBatalla;
    }

    public void setEnLineaDeBatalla(boolean enLineaDeBatalla) {
        this.enLineaDeBatalla = enLineaDeBatalla;
    }

    public boolean isEnCementerio() {
        return enCementerio;
    }

    public void setEnCementerio(boolean enCementerio) {
        this.enCementerio = enCementerio;
    }

}
