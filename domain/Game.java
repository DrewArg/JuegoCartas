package domain;

import javax.swing.JOptionPane;

import domain.base.Carta;
import domain.derivada.Jugador;
import service.JugadorService;
import utilidades.Inspector;

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
                                "Bienvenidos a la Batalla del Reino Animal, seleccionen la opción correcta.",
                                "Usuarios para Jugar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, menuLogin, 0);

                while (opcionElegida != 3) {
                        if (opcionElegida == 0) {
                                String nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                                                "Jugador 1, ingresa tu nombre de usuario.",
                                                "Ingresa tu nombre de usuario.");
                                String contrasenaJugador1 = JOptionPane.showInputDialog(null,
                                                "Jugador 1, ingresa tu contraseña", "Ingresa tu contraseña.");

                                if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador1,
                                                contrasenaJugador1)) {

                                        jugador1 = jugadorService.tomarJugador(nombreUsuarioJugador1,
                                                        contrasenaJugador1);

                                        String nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                                        "Jugador 2, ingresa tu nombre de usuario.",
                                                        "Ingresa tu nombre de usuario.");
                                        String contrasenaJugador2 = JOptionPane.showInputDialog(null,
                                                        "Jugador 2, ingresa tu contraseña", "Ingresa tu contraseña.");

                                        if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2,
                                                        contrasenaJugador2)) {
                                                jugador2 = jugadorService.tomarJugador(nombreUsuarioJugador2,
                                                                contrasenaJugador2);

                                                iniciarPartida(jugador1, jugador2);

                                        } else {

                                                while (!jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2,
                                                                contrasenaJugador2)) {

                                                        JOptionPane.showMessageDialog(null,
                                                                        "El usuario y/o contraseña son incorrectos",
                                                                        "Usuario y/o contraseña incorrectos",
                                                                        JOptionPane.ERROR_MESSAGE, null);

                                                        nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                                                        "Jugador 2, ingresa tu nombre de usuario.",
                                                                        "Ingresa tu nombre de usuario.");
                                                        contrasenaJugador2 = JOptionPane.showInputDialog(null,
                                                                        "Jugador 2, ingresa tu contraseña",
                                                                        "Ingresa tu contraseña.");
                                                }
                                        }

                                } else {
                                        JOptionPane.showMessageDialog(null, "El usuario y/o contraseña son incorrectos",
                                                        "Usuario y/o contraseña incorrectos", JOptionPane.ERROR_MESSAGE,
                                                        null);
                                }

                        } else if (opcionElegida == 1) {
                                String nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                                                "Jugador 1, ingrese su nombre de usuario.",
                                                "Ingresa tu nombre de usuario.");
                                String contrasenaJugador1 = JOptionPane.showInputDialog(null,
                                                "Jugador 1, ingrese su contraseña.", "Ingresa tu contraseña.");

                                if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador1,
                                                contrasenaJugador1)) {
                                        JOptionPane.showMessageDialog(null, "Usuario ya existente", "Registrar Usuario",
                                                        JOptionPane.WARNING_MESSAGE);

                                        while (jugadorService.validarNombreUsuario(nombreUsuarioJugador1)) {

                                                nombreUsuarioJugador1 = JOptionPane.showInputDialog(null,
                                                                "Jugador 1, ingrese su nombre de usuario.",
                                                                "Ingresa tu nombre de usuario.");
                                                contrasenaJugador1 = JOptionPane.showInputDialog(null,
                                                                "Jugador 1, ingrese su contraseña.",
                                                                "Ingresa tu contraseña.");
                                        }

                                } else {

                                        jugador1 = new Jugador(nombreUsuarioJugador1, contrasenaJugador1);
                                        String nombreUsuario1 = jugadorService.registrarUsuario(jugador1);

                                        JOptionPane.showMessageDialog(null,
                                                        nombreUsuario1 + " ha sido registrado correctamente.");

                                        String nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                                        "Jugador 2, ingrese su nombre de usuario.",
                                                        "Ingresa tu nombre de usuario.");
                                        String contrasenaJugador2 = JOptionPane.showInputDialog(null,
                                                        "Jugador 2, ingrese su contraseña.", "Ingresa tu contraseña.");

                                        if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugador2,
                                                        contrasenaJugador2)) {
                                                JOptionPane.showMessageDialog(null, "Usuario ya existente",
                                                                "Registrar Usuario", JOptionPane.WARNING_MESSAGE);

                                                while (jugadorService.validarNombreUsuario(nombreUsuarioJugador2)) {

                                                        nombreUsuarioJugador2 = JOptionPane.showInputDialog(null,
                                                                        "Jugador 2, ingrese su nombre de usuario.",
                                                                        "Ingresa tu nombre de usuario.");
                                                        contrasenaJugador2 = JOptionPane.showInputDialog(null,
                                                                        "Jugador 2, ingrese su contraseña.",
                                                                        "Ingresa tu contraseña.");
                                                }

                                        } else {
                                                jugador2 = new Jugador(nombreUsuarioJugador2, contrasenaJugador2);
                                                String nombreUsuario2 = jugadorService.registrarUsuario(jugador2);

                                                JOptionPane.showMessageDialog(null,
                                                                nombreUsuario2 + " ha sido registrado correctamente.");

                                                iniciarPartida(jugador1, jugador2);
                                        }

                                }

                        } else if (opcionElegida == 2) {
                                String nombreUsuarioJugadorRegistrado = JOptionPane.showInputDialog(null,
                                                "Jugador ya registrado, ingresa tu nombre de usuario.",
                                                "Ingresa tu nombre de usuario.");
                                String contrasenaJugadorRegistrado = JOptionPane.showInputDialog(null,
                                                "Jugador ya registrado, ingresa tu contraseña.");

                                if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugadorRegistrado,
                                                contrasenaJugadorRegistrado)) {

                                        jugador1 = jugadorService.tomarJugador(nombreUsuarioJugadorRegistrado,
                                                        contrasenaJugadorRegistrado);

                                        String nombreUsuarioJugadorNuevo = JOptionPane.showInputDialog(null,
                                                        "Jugador nuevo, ingresa tu nombre de usuario.",
                                                        "Ingresa tu nombre de usuario.");
                                        String contrasenaJugadorNuevo = JOptionPane.showInputDialog(null,
                                                        "Jugador nuevo, ingresa tu contraseña",
                                                        "Ingresa tu contraseña.");

                                        if (jugadorService.validarUsuarioYContrasena(nombreUsuarioJugadorNuevo,
                                                        contrasenaJugadorNuevo)) {
                                                JOptionPane.showMessageDialog(null, "Usuario ya existente",
                                                                "Registrar Usuario", JOptionPane.WARNING_MESSAGE);

                                                while (jugadorService.validarNombreUsuario(nombreUsuarioJugadorNuevo)) {

                                                        nombreUsuarioJugadorNuevo = JOptionPane.showInputDialog(null,
                                                                        "Jugador nuevo, ingrese su nombre de usuario.",
                                                                        "Ingresa tu nombre de usuario.");
                                                        contrasenaJugadorNuevo = JOptionPane.showInputDialog(null,
                                                                        "Jugador nuevo, ingrese su contraseña.",
                                                                        "Ingresa tu contraseña.");
                                                }

                                        } else {

                                                jugador2 = new Jugador(nombreUsuarioJugadorNuevo,
                                                                contrasenaJugadorNuevo);
                                                String nombreUsuario2 = jugadorService.registrarUsuario(jugador2);

                                                JOptionPane.showMessageDialog(null,
                                                                nombreUsuario2 + " ha sido registrado correctamente.");

                                                iniciarPartida(jugador1, jugador2);
                                        }
                                } else {
                                        JOptionPane.showMessageDialog(null, "El usuario y/o contraseña son incorrectos",
                                                        "Usuario y/o contraseña incorrectos", JOptionPane.ERROR_MESSAGE,
                                                        null);
                                }

                        }

                        opcionElegida = JOptionPane.showOptionDialog(null, "Bienvenidos a la Batalla del Reino Animal.",
                                        "Batalla del Reino Animal", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.INFORMATION_MESSAGE, null, menuLogin, 0);
                }
        }

        private void iniciarPartida(Jugador jugador1, Jugador jugador2) {
                resetearValores();

                JOptionPane.showMessageDialog(null,
                                "Ambos jugadores arracan con 25 cartas en su mazo, el jugador/a que se quede sin cartas en su mazo, perderá.",
                                "IMPORTANTE", JOptionPane.WARNING_MESSAGE);

                while (jugador1.getCantidadCartasMazo() > 0 && jugador2.getCantidadCartasMazo() > 0) {
                        iniciarTurno(jugador1, jugador2);
                        if (jugador2.getCantidadCartasMazo() <= 0) {

                        } else {
                                iniciarTurno(jugador2, jugador1);
                        }

                }

                if (jugador1.getCantidadCartasMazo() <= 0) {
                        JOptionPane.showMessageDialog(null,
                                        "El jugador " + jugador1.getnombreUsuario() + " se ha quedado sin cartas.");
                        JOptionPane.showMessageDialog(null,
                                        "¡Felicitaciones " + jugador2.getnombreUsuario() + " has ganado esta partida!");

                } else if (jugador2.getCantidadCartasMazo() <= 0) {
                        JOptionPane.showMessageDialog(null,
                                        "El jugador " + jugador2.getnombreUsuario() + " se ha quedado sin cartas.");
                        JOptionPane.showMessageDialog(null,
                                        "¡Felicitaciones " + jugador1.getnombreUsuario() + " has ganado esta partida!");

                }

                JOptionPane.showMessageDialog(null,
                                "Si quieren jugar otra partida los 2, logueense. Sino pueden registrar a uno o más jugadores nuevos o Salir.");

        }

        private void iniciarTurno(Jugador jugadorActual, Jugador jugadorEnemigo) {

                if (jugadorActual.getTurno() == 1) {
                        JOptionPane.showMessageDialog(null, "Primer turno de " + jugadorActual.getnombreUsuario(),
                                        "Comienzo de partida", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null,
                                        jugadorActual.getnombreUsuario() + " has robado tu mano inicial.",
                                        "Mano Inicial", 1);

                        jugadorActual.robarManoInicialCartas();

                } else if (jugadorActual.getTurno() == 2) {

                        String[] opcionesTurno = { "Bajar una carta", "Activar un efecto", "Pasar" };
                        int opcionElegida = JOptionPane.showOptionDialog(null,
                                        "Turno " + jugadorActual.getTurno() + ". ¿" + jugadorActual.getnombreUsuario()
                                                        + " que deseas hacer?",
                                        "Turno: " + jugadorActual.getTurno(), JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, opcionesTurno, 2);

                        while (opcionElegida != 2) {
                                if (opcionElegida == 0) {
                                        jugadorActual.setAlimentosBajadosAlTablero(jugadorActual.bajarCartaAlTablero(
                                                        jugadorActual.getAlimentosBajadosAlTablero()));

                                } else if (opcionElegida == 1) {
                                        JOptionPane.showMessageDialog(null, "Aún no codeado", "Aun no codeado",
                                                        JOptionPane.ERROR_MESSAGE);
                                }

                                opcionElegida = JOptionPane.showOptionDialog(null, "Turno " + jugadorActual.getTurno()
                                                + ". ¿" + jugadorActual.getnombreUsuario() + " que deseas hacer?",
                                                "Turno: " + jugadorActual.getTurno(), JOptionPane.DEFAULT_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, opcionesTurno, 2);
                        }

                        jugadorActual.robarCarta();
                        JOptionPane.showMessageDialog(null, jugadorActual.getnombreUsuario() + " te quedan: "
                                        + jugadorActual.getCantidadCartasMazo() + " cartas en tu mazo.");
                        JOptionPane.showMessageDialog(null, "Fin de turno " + jugadorActual.getTurno(), "Fin Turno",
                                        JOptionPane.INFORMATION_MESSAGE, null);
                } else {

                        jugadorActual.reagruparAlimentos();
                        jugadorActual.reagruparAnimalesEnZonaBatalla();
                        jugadorActual.setAlimentosBajadosAlTablero(0);

                        String[] opcionesTurno = { "Bajar una carta", "Atacar", "Activar un efecto", "Pasar" };
                        int opcionElegida = JOptionPane.showOptionDialog(null,
                                        "Turno " + jugadorActual.getTurno() + ". ¿" + jugadorActual.getnombreUsuario()
                                                        + " que deseas hacer?",
                                        "Turno: " + jugadorActual.getTurno(), JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, opcionesTurno, 2);

                        while (opcionElegida != 3) {
                                if (opcionElegida == 0) {
                                        jugadorActual.setAlimentosBajadosAlTablero(jugadorActual.bajarCartaAlTablero(
                                                        jugadorActual.getAlimentosBajadosAlTablero()));

                                } else if (opcionElegida == 1) {

                                        int animalesReposoAtacante = jugadorActual.verCantidadAnimalesEnReposo();

                                        if (animalesReposoAtacante <= 0) {
                                                JOptionPane.showMessageDialog(null, jugadorActual.getnombreUsuario()
                                                                + " actualmente no tienes animales disponibles para atacar",
                                                                "Sin animales reposando", JOptionPane.WARNING_MESSAGE);
                                        } else {

                                                Carta cartaAtacante = jugadorActual.seleccionarAnimalAtacante();

                                                JOptionPane.showMessageDialog(null, jugadorEnemigo.getnombreUsuario()
                                                                + ", el jugador " + jugadorActual.getnombreUsuario()
                                                                + " ha decidido atacar con el siguiente animal.",
                                                                "¡Te atacan!", JOptionPane.WARNING_MESSAGE);

                                                Inspector.inspeccionarCarta(cartaAtacante);

                                                String[] opcionesDefensa = { "Defender", "Activar efecto",
                                                                "Dejar pasar daño" };

                                                int decisionDefensa = JOptionPane.showOptionDialog(null,
                                                                "¿Vas a defender el ataque del atacante?",
                                                                "Ataque entrante", JOptionPane.DEFAULT_OPTION,
                                                                JOptionPane.WARNING_MESSAGE, null, opcionesDefensa, 0);

                                                if (decisionDefensa == 0) {

                                                        int cantidadAnimalesEnReposoDefensa = jugadorEnemigo
                                                                        .verCantidadAnimalesEnReposo();

                                                        if (cantidadAnimalesEnReposoDefensa <= 0) {
                                                                JOptionPane.showMessageDialog(null, jugadorEnemigo
                                                                                .getnombreUsuario()
                                                                                + " actualmente no tienes animales disponibles para defender",
                                                                                "Sin animales reposando",
                                                                                JOptionPane.WARNING_MESSAGE);

                                                                int dañoRecibido = jugadorEnemigo
                                                                                .botarCartasMazo(cartaAtacante);

                                                                JOptionPane.showMessageDialog(null, jugadorEnemigo
                                                                                .getnombreUsuario() + " ha botado "
                                                                                + dañoRecibido
                                                                                + " cartas de su mazo.\nLe quedan: "
                                                                                + jugadorEnemigo.getCantidadCartasMazo()
                                                                                + " cartas en su mazo.",
                                                                                "Daño recibido",
                                                                                JOptionPane.WARNING_MESSAGE);

                                                        } else {

                                                                Carta cartaDefensora = jugadorEnemigo
                                                                                .seleccionarAnimalDefensor();

                                                                int dañoRecibido = jugadorActual.calcularDañoCombate(
                                                                                cartaAtacante, cartaDefensora);

                                                                if (dañoRecibido < 0) {
                                                                        jugadorActual.botarCartasMazo(dañoRecibido);
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        jugadorActual.getnombreUsuario()
                                                                                                        + " ha botado "
                                                                                                        + dañoRecibido
                                                                                                        + " cartas de su mazo.\nLe quedan: "
                                                                                                        + jugadorActual.getCantidadCartasMazo()
                                                                                                        + " cartas en su mazo.",
                                                                                        "Daño recibido",
                                                                                        JOptionPane.WARNING_MESSAGE);

                                                                } else if (dañoRecibido == 0) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "El calculo de daño ha dado "
                                                                                                        + dañoRecibido
                                                                                                        + " y por esta razón ninguno de los jugadores ha botado cartas de su mazo",
                                                                                        "Daño igualado",
                                                                                        JOptionPane.INFORMATION_MESSAGE);

                                                                } else if (dañoRecibido > 0) {
                                                                        jugadorEnemigo.botarCartasMazo(dañoRecibido);
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        jugadorEnemigo.getnombreUsuario()
                                                                                                        + " ha botado "
                                                                                                        + dañoRecibido
                                                                                                        + " cartas de su mazo.\n Le quedan: "
                                                                                                        + jugadorEnemigo.getCantidadCartasMazo()
                                                                                                        + " cartas en su mazo.",
                                                                                        "Daño recibido",
                                                                                        JOptionPane.WARNING_MESSAGE);

                                                                }

                                                        }

                                                } else if (decisionDefensa == 1) {
                                                        JOptionPane.showMessageDialog(null, "Aún no codeado",
                                                                        "Aun no codeado", JOptionPane.ERROR_MESSAGE);
                                                } else if (decisionDefensa == 2) {
                                                        int dañoRecibido = jugadorEnemigo
                                                                        .botarCartasMazo(cartaAtacante);
                                                        JOptionPane.showMessageDialog(null, jugadorEnemigo
                                                                        .getnombreUsuario() + " ha botado "
                                                                        + dañoRecibido
                                                                        + " cartas de su mazo.\nLe quedan: "
                                                                        + jugadorEnemigo.getCantidadCartasMazo()
                                                                        + " cartas en su mazo.", "Daño recibido",
                                                                        JOptionPane.WARNING_MESSAGE);
                                                }

                                        }

                                } else if (opcionElegida == 2) {
                                        JOptionPane.showMessageDialog(null, "Aún no codeado", "Aun no codeado",
                                                        JOptionPane.ERROR_MESSAGE);

                                }

                                opcionElegida = JOptionPane.showOptionDialog(null, "Turno " + jugadorActual.getTurno()
                                                + ". ¿" + jugadorActual.getnombreUsuario() + " que deseas hacer?",
                                                "Turno: " + jugadorActual.getTurno(), JOptionPane.DEFAULT_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, opcionesTurno, 2);
                        }

                        jugadorActual.robarCarta();
                        JOptionPane.showMessageDialog(null, jugadorActual.getnombreUsuario() + " te quedan: "
                                        + jugadorActual.getCantidadCartasMazo() + " cartas en tu mazo.");
                        JOptionPane.showMessageDialog(null, "Fin de turno " + jugadorActual.getTurno(), "Fin Turno",
                                        JOptionPane.INFORMATION_MESSAGE, null);

                }

                jugadorActual.setTurno(jugadorActual.getTurno() + 1);
        }

        private void resetearValores(){
                
        }
}
