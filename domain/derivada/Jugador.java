package domain.derivada;

import javax.swing.JOptionPane;

import service.CartaService;

public class Jugador {
    private CartaService cartaService;
    private String nombreUsuario;
    private String contrasena;
    private int mazoSeleccionado;

    public Jugador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        cartaService = new CartaService();

    }

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getMazoSeleccionado() {
        return mazoSeleccionado;
    }

    public void robarCarta() {
        JOptionPane.showMessageDialog(null, nombreUsuario + " has robado una carta del mazo.", nombreUsuario, 1);
        cartaService.robarCarta();

    }

    public void robarMultiplesCartas(int cantidadCartasARobar) {
        JOptionPane.showMessageDialog(null,
                nombreUsuario + " has robado una " + cantidadCartasARobar + " cartas del mazo.", nombreUsuario, 1);
        cartaService.robarMultiplesCartas(cantidadCartasARobar);
    }

    public void bajarCartaAlTablero() {
        cartaService.bajarCartaAlTablero();
    }

    public void seleccionarTipoMazo() {
        String[] tiposMazo = { "Reino Terrestre", "Reino Acuático" };
        mazoSeleccionado = JOptionPane.showOptionDialog(null, nombreUsuario + " selecciona el tipo de mazo para jugar.",
                "Tipo de Mazo - " + nombreUsuario, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                tiposMazo, null);

        cartaService.llenarMazoCartas(mazoSeleccionado);

    }
}