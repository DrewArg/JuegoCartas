import domain.derivada.Jugador;

public class App {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Andy", "contrasena");
        Jugador jugador2 = new Jugador("Meri", "contrasena");

        jugador1.robarMultiplesCartas(5);

        jugador2.robarMultiplesCartas(5);
    }
}
