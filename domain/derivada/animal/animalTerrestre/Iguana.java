package domain.derivada.animal.animalTerrestre;

import domain.base.Animal;

public class Iguana extends Animal {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    public Iguana(String id) {
        this.id = id;
        tipo = "Animal";
        nombre = "Iguana";
        efecto = "Puede copiar el ataque de un enemigo y sumarlo al suyo hasta el final del turno.";
        coste = 3;
        dano = 1;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCoste() {
        return coste;
    }

    public int getDano() {
        return dano;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void activarEfecto() {

    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub

    }

}
