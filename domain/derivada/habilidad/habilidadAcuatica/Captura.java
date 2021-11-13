package domain.derivada.habilidad.habilidadAcuatica;

import domain.base.Habilidad;

public class Captura extends Habilidad {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Captura(String id) {
        this.id = id;
        nombre = "Captura";
        tipo = "Habilidad";
        efecto = "Evita que un enemigo pueda atacar o defender por 2 turnos.";
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
