package domain.derivada.habilidad.habilidadAcuatica;

import javax.swing.JOptionPane;

import domain.base.Habilidad;

public class Captura extends Habilidad {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;

    public Captura(int id) {
        this.id = id;
        nombre = "Captura";
        tipo = "Habilidad";
        efecto = "Evita que un enemigo pueda atacar o defender por 2 turnos.";
        coste = 3;

        sePuedeBajarAlTablero = false;
      
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
    public int getId() {
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
     JOptionPane.showMessageDialog(null, "Has activado esta habilidad pero aun no está codeada", "Habilidad activa", 2);

    }

    @Override
    public int getCoste() {
        // TODO Auto-generated method stub
        return coste;
    }

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }
}
