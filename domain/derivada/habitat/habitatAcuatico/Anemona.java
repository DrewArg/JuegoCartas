package domain.derivada.habitat.habitatAcuatico;

import domain.base.Habitat;

public class Anemona extends Habitat {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Anemona(String id) {
        this.id = id;
        nombre = "Anemona";
        tipo = "Habitat";
        efecto = "Puedes duplicar un Pez Payaso en juego pagando su coste.";
        coste = 3;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return nombre;
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return tipo;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getEfecto() {
        // TODO Auto-generated method stub
        return efecto;
    }

    @Override
    public void activarEfecto() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getCoste() {
        // TODO Auto-generated method stub
        return coste;
    }
}
