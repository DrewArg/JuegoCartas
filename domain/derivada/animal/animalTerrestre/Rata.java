package domain.derivada.animal.animalTerrestre;

import domain.base.Animal;

public class Rata extends Animal {

    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    private boolean sePuedeBajarAlTablero;
    private boolean enLineaDefensiva;

    public Rata(int id) {
        this.id = id;
        nombre = "Rata";
        tipo = "Animal";
        efecto = "Sin efecto.";
        coste = 1;
        dano = 1;

        sePuedeBajarAlTablero = false;
        enLineaDefensiva = false;
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

    @Override
    public void atacar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub

    }

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }

    public boolean isEnLineaDefensiva() {
        return enLineaDefensiva;
    };

    public void setEnLineaDefensiva(boolean enLineaDefensiva) {
        this.enLineaDefensiva = enLineaDefensiva;
    };

}
