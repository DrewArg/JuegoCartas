package domain.derivada.habilidad.habilidadTerrestre;

import javax.swing.JOptionPane;

import domain.base.Habilidad;

public class Aullido extends Habilidad {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;

    public Aullido(int id) {
        this.id = id;
        nombre = "Aullido";
        tipo = "Habilidad";
        efecto = "Si tienes un Lobo Gris en juego, puedes jugar a otro desde tu mazo o mano sin pagar su coste.";
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
