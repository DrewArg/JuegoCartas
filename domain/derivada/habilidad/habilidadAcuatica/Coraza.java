package domain.derivada.habilidad.habilidadAcuatica;

import javax.swing.JOptionPane;

import domain.base.Habilidad;

public class Coraza extends Habilidad{
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;

    public Coraza(int id) {
        this.id = id;
        nombre = "Coraza";
        tipo = "Habilidad";
        efecto = "Evita que un animal aliado muera este turno.";
        coste = 2;

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
