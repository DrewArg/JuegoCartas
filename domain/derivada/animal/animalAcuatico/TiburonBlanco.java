package domain.derivada.animal.animalAcuatico;

import domain.base.Animal;

public class TiburonBlanco extends Animal {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    public TiburonBlanco(String id) {
        this.id = id;
        tipo = "Animal";
        nombre = "Tiburón Blanco";
        efecto = "Puede devorar a un aliado para devorar a un enemigo de coste 3 o menos y adicionar su fuerza a la suya hasta el final del turno.";
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
