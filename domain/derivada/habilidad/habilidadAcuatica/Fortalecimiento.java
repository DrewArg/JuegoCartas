package domain.derivada.habilidad.habilidadAcuatica;

import javax.swing.JOptionPane;

import domain.base.Habilidad;

public class Fortalecimiento extends Habilidad {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;
    private boolean enCementerio;

    public Fortalecimiento(int id) {
        this.id = id;
        nombre = "Enamoramiento";
        tipo = "Habilidad";
        efecto = "Si tienes un Tiburón Blanco en juego, este gana +3 de daño. Si tienes un Tiburón Blanco en tu cementerio, puedes revivirlo sin pagar su coste.";
        coste = 6;

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
