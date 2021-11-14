package service;

import java.util.ArrayList;
import java.util.List;

import domain.derivada.Jugador;

public class JugadorService {
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    public String registrarUsuario(Jugador jugador) {
        jugadores.add(jugador);

        return jugador.getnombreUsuario();
    }

    public void eliminarUsuario() {

    }

    public boolean validarUsuarioYContrasena(String nombreUsuario, String contrasena) {
        for (Jugador jugador : jugadores) {
            if (jugador.getnombreUsuario().equalsIgnoreCase(nombreUsuario)
                    && jugador.getContrasena().equalsIgnoreCase(contrasena)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarNombreUsuario(String nombreUsuario) {
        for (Jugador jugador : jugadores) {
            if (jugador.getnombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    public Jugador tomarJugador(String nombreUsuario, String contrasena) {
        for (Jugador jugador : jugadores) {
            if (jugador.getnombreUsuario().equalsIgnoreCase(nombreUsuario)
                    && jugador.getContrasena().equalsIgnoreCase(contrasena)) {
                return jugador;
            }
        }
        return null;
    }
}
