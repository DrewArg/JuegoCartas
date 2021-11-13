package domain.derivada.habilidad.habilidadAcuatica;

import domain.base.Habilidad;

public class Coraza extends Habilidad{
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Coraza(String id) {
        this.id = id;
        nombre = "Coraza";
        tipo = "Habilidad";
        efecto = "Evita que un animal aliado muera este turno.";
        coste = 2;
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
