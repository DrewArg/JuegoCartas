package domain.derivada.animal.animalAcuatico;

import domain.base.Animal;

public class TortugaMarina extends Animal {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    public TortugaMarina(String id) {
        this.id = id;
        tipo = "Animal";
        nombre = "Tortuga Marina";
        efecto = "Puede sacrificarse para evitar que el enemigo siga atacando este turno.";
        coste = 3;
        dano = 2;

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
