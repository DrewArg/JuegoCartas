import domain.derivada.Jugador;

public class App {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Andy", "contrasena");
        // Jugador jugador2 = new Jugador("Meri", "contrasena");

        jugador1.robarMultiplesCartas(5);
        System.out.println("0");

        jugador1.bajarCartaAlTablero();
        System.out.println("1");

        jugador1.bajarCartaAlTablero();
        System.out.println("2");
        
        jugador1.bajarCartaAlTablero();
    }
}
