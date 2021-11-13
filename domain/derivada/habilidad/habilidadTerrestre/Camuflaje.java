package domain.derivada.habilidad.habilidadTerrestre;

import domain.base.Habilidad;

public class Camuflaje extends Habilidad {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Camuflaje(String id) {
        this.id = id;
        nombre = "Camuflaje";
        tipo = "Habilidad";
        efecto = "Si tienes una Iguana en juego, esta se vuelve indestructible.";
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
