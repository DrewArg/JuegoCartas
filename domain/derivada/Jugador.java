package domain.derivada;

import javax.swing.JOptionPane;

import domain.base.Animal;
import domain.base.Carta;
import service.CartaService;

public class Jugador {
    private CartaService cartaService;
    private String nombreUsuario;
    private String contrasena;
    private int mazoSeleccionado;
    private int turno = 1;

    public Jugador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        cartaService = new CartaService();

        seleccionarTipoMazo();

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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getCantidadCartasMazo() {
        return cartaService.getCantidadCartasMazo();
    }

    public void atacar() {

    }

    public void robarCarta() {
        JOptionPane.showMessageDialog(null, nombreUsuario + " has robado una carta del mazo.", nombreUsuario, 1);
        cartaService.robarCarta();

    }

    public int calcularDañoCombate(Carta cartaAtacante, Carta cartaDefensora) {
        return cartaService.calcularDañoCombate(cartaAtacante, cartaDefensora);
    }

    public Carta seleccionarAnimalDefensor() {
        return cartaService.seleccionarAnimalDefensorEnReposo();
    }

    public Carta seleccionarAnimalAtacante() {
        return cartaService.seleccionarAnimalAtacanteEnReposo();
    }

    public void reagruparAlimentos() {
        cartaService.reagruparAlimentos();
    }

    public void reagruparAnimalesEnZonaBatalla() {
        cartaService.reagruparAnimalesEnZonaBatalla();
    }

    public int verCantidadAnimalesEnReposo() {
        return cartaService.devolverCantidadAnimalesEnReposo();
    }

    public int botarCartasMazo(Carta cartaAtacante) {
        return cartaService.botarCartasMazo(cartaAtacante);
    }

    public void botarCartasMazo(int dañoRecibido) {
        cartaService.botarCartasMazo(dañoRecibido);
    }

    public void robarMultiplesCartas(int cantidadCartasARobar) {
        JOptionPane.showMessageDialog(null,
                nombreUsuario + " has robado una " + cantidadCartasARobar + " cartas del mazo.", nombreUsuario, 1);
        cartaService.robarMultiplesCartas(cantidadCartasARobar);
    }

    public void robarManoInicialCartas() {
        cartaService.robarManoInicialCartas();
    }

    public void bajarCartaAlTablero() {
        cartaService.bajarCartaAlTablero();
    }

    private void seleccionarTipoMazo() {
        String[] tiposMazo = { "Reino Terrestre", "Reino Acuático" };
        mazoSeleccionado = JOptionPane.showOptionDialog(null, nombreUsuario + " selecciona el tipo de mazo para jugar.",
                "Tipo de Mazo - " + nombreUsuario, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                tiposMazo, null);

        cartaService.llenarMazoCartas(mazoSeleccionado);

    }

    public void verAnimalesBatalla() {
        cartaService.verAnimalesBatalla();
    }

    public void verAnimalesReposo() {
        cartaService.verAnimalesReposo();
    }

    public void verAlimentosConsumidos() {
        cartaService.verAlimentosConsumidos();
    }

    public void verAlimentosDisponibles() {
        cartaService.verAlimentosDisponibles();
    }

}