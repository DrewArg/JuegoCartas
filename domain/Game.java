package domain;

import javax.swing.JOptionPane;

import domain.derivada.Jugador;
import service.JugadorService;

public class Game {
    private JugadorService jugadorService;
    private Jugador jugador1;
    private Jugador jugador2;

    public Game() {
        jugadorService = new JugadorService();
    }

    public void iniciar() {
        mostrarMenuLogin();
    }

    private void mostrarMenuLogin() {
        String[] menuLogin = { "Ingresar 2", "Registrar 2", "Ingresar 1 y Registrar 1", "Salir" };
        int opcionElegida = JOptionPane.showOptionDialog(null,
                "Bienvenidos a la Batalla del Reino Animal, seleccionen la opción correcta.", "Usuarios para Jugar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menuLogin, 0);

        while (opcionElegida != 3) {
            if (opcionElegida == 0) {
                String nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                        "Jugador 1, ingresa tu nombre de usuario.", "Ingresa tu nombre de usuario.");
                String contrasenaJugador1 = JOptionPane.showInputDialog(null, "Jugador 1, ingresa tu contraseña",
                        "Ingresa tu contraseña.");

                if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador1, contrasenaJugador1)) {

                    jugador1 = jugadorService.tomarJugador(nombreUsuarioJugador1, contrasenaJugador1);

                    String nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                            "Jugador 2, ingresa tu nombre de usuario.", "Ingresa tu nombre de usuario.");
                    String contrasenaJugador2 = JOptionPane.showInputDialog(null, "Jugador 2, ingresa tu contraseña",
                            "Ingresa tu contraseña.");

                    if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2, contrasenaJugador2)) {
                        jugador2 = jugadorService.tomarJugador(nombreUsuarioJugador2, contrasenaJugador2);

                        // ACÁ DEBERIA ARRANCAR EL TURNO 1 PASANDOLE EL JUGADOR 1 Y JUGADOR 2

                    } else {

                        while (!jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2, contrasenaJugador2)) {

                            JOptionPane.showMessageDialog(null, "El usuario y/o contrseña son incorrectos",
                                    "Usuario y/o contraseña incorrectos", JOptionPane.ERROR_MESSAGE, null);

                            nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                    "Jugador 2, ingresa tu nombre de usuario.", "Ingresa tu nombre de usuario.");
                            contrasenaJugador2 = JOptionPane.showInputDialog(null, "Jugador 2, ingresa tu contraseña",
                                    "Ingresa tu contraseña.");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario y/o contrseña son incorrectos",
                            "Usuario y/o contraseña incorrectos", JOptionPane.ERROR_MESSAGE, null);
                }

            } else if (opcionElegida == 1) {
                String nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                        "Jugador 1, ingrese su nombre de usuario.", "Ingresa tu nombre de usuario.");
                String contrasenaJugador1 = JOptionPane.showInputDialog(null, "Jugador 1, ingrese su contraseña.",
                        "Ingresa tu contraseña.");

                if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador1, contrasenaJugador1)) {
                    JOptionPane.showMessageDialog(null, "Usuario ya existente", "Registrar Usuario",
                            JOptionPane.WARNING_MESSAGE);

                    while (jugadorService.validarNombreUsuario(nombreUsuarioJugador1)) {

                        nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                                "Jugador 1, ingrese su nombre de usuario.", "Ingresa tu nombre de usuario.");
                        contrasenaJugador1 = JOptionPane.showInputDialog(null, "Jugador 1, ingrese su contraseña.",
                                "Ingresa tu contraseña.");
                    }

                } else {

                    jugador1 = new Jugador(nombreUsuarioJugador1, contrasenaJugador1);
                    String nombreUsuario1 = jugadorService.registrarUsuario(jugador1);

                    JOptionPane.showMessageDialog(null, nombreUsuario1 + " ha sido registrado correctamente.");

                    String nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                            "Jugador 2, ingrese su nombre de usuario.", "Ingresa tu nombre de usuario.");
                    String contrasenaJugador2 = JOptionPane.showInputDialog(null, "Jugador 2, ingrese su contraseña.",
                            "Ingresa tu contraseña.");

                    if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2, contrasenaJugador2)) {
                        JOptionPane.showMessageDialog(null, "Usuario ya existente", "Registrar Usuario",
                                JOptionPane.WARNING_MESSAGE);

                        while (jugadorService.validarNombreUsuario(nombreUsuarioJugador2)) {

                            nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                    "Jugador 2, ingrese su nombre de usuario.", "Ingresa tu nombre de usuario.");
                            contrasenaJugador2 = JOptionPane.showInputDialog(null, "Jugador 2, ingrese su contraseña.",
                                    "Ingresa tu contraseña.");
                        }

                    } else {
                        jugador2 = new Jugador(nombreUsuarioJugador2, contrasenaJugador2);
                        String nombreUsuario2 = jugadorService.registrarUsuario(jugador2);

                        JOptionPane.showMessageDialog(null, nombreUsuario2 + " ha sido registrado correctamente.");

                        // ACÁ DEBERIA ARRANCAR EL TURNO 1 PASANDOLE EL JUGADOR 1 Y JUGADOR 2
                    }

                }

            }

            opcionElegida = JOptionPane.showOptionDialog(null, "Bienvenidos a la Batalla del Reino Animal.",
                    "Batalla del Reino Animal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    menuLogin, 0);
        }
    }

    private void registrarUsuario(int opcionElegida) {

    }

    private void contarTurnos() {

    }
}
