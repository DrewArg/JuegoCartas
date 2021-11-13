package domain.derivada.animal.animalTerrestre;

import domain.base.Animal;

public class MantisOrquidea extends Animal {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    public MantisOrquidea(String id) {
        this.id = id;
        nombre = "Mantis Orquídea";
        tipo = "Animal";
        efecto = "Puedes pagar 1 alimento para tomar una carta de tu cementerio y ponerla en tu mano.";
        coste = 5;
        dano = 4;

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

    @Override
    public void atacar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub

    }
}
