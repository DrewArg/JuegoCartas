package domain.derivada.habilidad.habilidadTerrestre;

import domain.base.Habilidad;

public class Enamoramiento extends Habilidad {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Enamoramiento(String id) {
        this.id = id;
        nombre = "Enamoramiento";
        tipo = "Habilidad";
        efecto = "Toma el control de un animal enemigo hasta el fin de este turno.";
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
