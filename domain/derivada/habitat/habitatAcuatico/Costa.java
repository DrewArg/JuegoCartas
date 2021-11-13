package domain.derivada.habitat.habitatAcuatico;

import domain.base.Habitat;

public class Costa extends Habitat {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Costa(String id) {
        this.id = id;
        nombre = "Costa";
        tipo = "Habitat";
        efecto = "Si tienes un Tiburón Blanco en juego, este gana +1 de daño por cada animal devorado hasta ser destruido.";
        coste = 6;
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
