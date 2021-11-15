package domain.derivada.animal.animalAcuatico;

import javax.swing.JOptionPane;

import domain.base.Animal;
import domain.derivada.Jugador;

public class Pulpo extends Animal {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;
    private int dano;

    private boolean sePuedeBajarAlTablero;
    private boolean enLineaDeReposo;
    private boolean enLineaDeBatalla;
    private boolean enCementerio;

    public Pulpo(int id) {
        this.id = id;
        tipo = "Animal";
        nombre = "Pulpo";
        efecto = "Puede perder X puntos de daño permanentemente para devolver X cartas del cementerio al mazo.";
        coste = 4;
        dano = 3;

        sePuedeBajarAlTablero = false;
        enLineaDeReposo = false;
        enLineaDeBatalla = false;
        enCementerio = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCoste() {
        return coste;
    }

    public int getDano() {
        return dano;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void activarEfecto(Jugador jugadorActual) {
        int puntosPerdidos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "¿Cuántos puntos de daño quieres que el animal pierda?", nombre, JOptionPane.QUESTION_MESSAGE));

        if (puntosPerdidos > getDano()) {
            JOptionPane.showMessageDialog(null,
                    nombre + " no puede perder más puntos de daño de los que tiene actualmente.");
            activarEfecto(jugadorActual);
        } else {
            int cartasRecuperadas = jugadorActual.pasarCartasCementerioMazo(puntosPerdidos);

            JOptionPane.showMessageDialog(null,
                    nombre + " ha perdido " + puntosPerdidos + " puntos de daño permanentemente.\nHas recuperado "
                            + cartasRecuperadas + " cartas de tu cementerio y las has puesto en tu mazo.");

            setDano(getDano() - puntosPerdidos);
        }

    }

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }

    public boolean isEnLineaDeReposo() {
        return enLineaDeReposo;
    }

    public void setEnLineaDeReposo(boolean enLineaDeReposo) {
        this.enLineaDeReposo = enLineaDeReposo;
    }

    public boolean isEnLineaDeBatalla() {
        return enLineaDeBatalla;
    }

    public void setEnLineaDeBatalla(boolean enLineaDeBatalla) {
        this.enLineaDeBatalla = enLineaDeBatalla;
    }

    public boolean isEnCementerio() {
        return enCementerio;
    }

    public void setEnCementerio(boolean enCementerio) {
        this.enCementerio = enCementerio;
    }
}
