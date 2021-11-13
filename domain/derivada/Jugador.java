package domain.derivada;

import javax.swing.JOptionPane;

import service.CartaService;

public class Jugador {
    private CartaService cartaService;
    private String usuario;
    private String contrasena;

    public Jugador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        cartaService = new CartaService();

        seleccionarTipoMazo();

    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    private void seleccionarTipoMazo() {
        String[] tiposMazo = { "Reino Terrestre", "Reino Acuático" };
        int mazoSeleccionado = JOptionPane.showOptionDialog(null, usuario + " selecciona el tipo de mazo para jugar.",
                "Tipo de Mazo - " + usuario, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposMazo,
                null);

        cartaService.llenarMazoCartas(mazoSeleccionado);

    }

    public void robarCarta() {
        JOptionPane.showMessageDialog(null, usuario + " has robado una carta del mazo.", usuario, 1);
        cartaService.robarCarta();

    }

    public void robarMultiplesCartas(int cantidadCartasARobar) {
        JOptionPane.showMessageDialog(null, usuario + " has robado una " + cantidadCartasARobar + " cartas del mazo.",
                usuario, 1);
        cartaService.robarMultiplesCartas(cantidadCartasARobar);
    }

    public void bajarCartaAlTablero() {
        cartaService.bajarCartaAlTablero();
    }
}