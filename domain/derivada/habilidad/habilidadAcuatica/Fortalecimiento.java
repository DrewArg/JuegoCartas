package domain.derivada.habilidad.habilidadAcuatica;

import domain.base.Habilidad;

public class Fortalecimiento extends Habilidad {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Fortalecimiento(String id) {
        this.id = id;
        nombre = "Enamoramiento";
        tipo = "Habilidad";
        efecto = "Si tienes un Tiburón Blanco en juego, este gana +3 de daño. Si tienes un Tiburón Blanco en tu cementerio, puedes revivirlo sin pagar su coste.";
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
