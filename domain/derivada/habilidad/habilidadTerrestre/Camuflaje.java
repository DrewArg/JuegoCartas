package domain.derivada.habilidad.habilidadTerrestre;

import javax.swing.JOptionPane;

import domain.base.Habilidad;

public class Camuflaje extends Habilidad {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;
    private boolean enCementerio;

    public Camuflaje(int id) {
        this.id = id;
        nombre = "Camuflaje";
        tipo = "Habilidad";
        efecto = "Si tienes una Iguana en juego, esta se vuelve indestructible.";
        coste = 3;

        sePuedeBajarAlTablero = false;
        enCementerio =false;
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

    public void setEnCementerio(boolean enCementerio){
        this.enCementerio=enCementerio;
    }

    public boolean isEnCementerio(){
        return enCementerio;
    }
}
