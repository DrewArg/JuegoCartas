package domain.derivada;

import javax.swing.JOptionPane;

import service.CartaService;

public class Jugador {
    private CartaService cartaService;
    private String nombre;
    private String contrasena;

    public Jugador(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        cartaService = new CartaService();

        seleccionarTipoMazo();

    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    private void seleccionarTipoMazo() {
        String[] tiposMazo = { "Reino Terrestre", "Reino Acuático" };
        int mazoSeleccionado = JOptionPane.showOptionDialog(null, nombre + " selecciona el tipo de mazo para jugar.",
                "Tipo de Mazo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposMazo, null);

        cartaService.llenarMazoCartas(mazoSeleccionado);

    }

    public void robarCarta() {
        cartaService.robarCarta(this);
    }

    public void robarMultiplesCartas(int cantidadCartasARobar) {
        cartaService.robarMultiplesCartas(this, cantidadCartasARobar);
    }
}