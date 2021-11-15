package domain.derivada;

import java.util.List;

import javax.swing.JOptionPane;

import domain.base.Carta;
import service.CartaService;

public class Jugador {
    private CartaService cartaService;
    private String nombreUsuario;
    private String contrasena;
    private int mazoSeleccionado;
    private int turno = 1;
    private int alimentosBajadosAlTablero;

    public Jugador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        alimentosBajadosAlTablero = 0;
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

    public int getAlimentosBajadosAlTablero() {
        return alimentosBajadosAlTablero;
    }

    public List<Carta> getCartasTablero() {
        return cartaService.getCartasTablero();
    }

    public void setAlimentosBajadosAlTablero(int alimentosBajadosAlTablero) {
        this.alimentosBajadosAlTablero = alimentosBajadosAlTablero;
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

    public int bajarCartaAlTablero(int alimentosBajadosAlTablero) {
        return cartaService.bajarCartaAlTablero(alimentosBajadosAlTablero);
    }

    private void seleccionarTipoMazo() {
        String[] tiposMazo = { "Reino Terrestre", "Reino Acuático" };
        mazoSeleccionado = JOptionPane.showOptionDialog(null, nombreUsuario + " selecciona el tipo de mazo para jugar.",
                "Tipo de Mazo - " + nombreUsuario, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                tiposMazo, null);

        cartaService.llenarMazoCartas(mazoSeleccionado);

    }

    public void verAnimalesBatalla() {
        cartaService.verCantidadAnimalesBatalla();
    }

    public void verAnimalesReposo() {
        cartaService.verCantidadAnimalesReposo();
    }

    public void verAlimentosConsumidos() {
        cartaService.verCantidadAlimentosConsumidos();
    }

    public void verAlimentosDisponibles() {
        cartaService.verCantidadAlimentosDisponibles();
    }

    public void regresarTodasLasCartasAlMazoYBarajar() {
        setTurno(1);
        cartaService.regresarTodasLasCartasAlMazoYBarajar();
    }

    public void inspeccionarZonaJuego(Jugador jugadorActual, String zonaEscogida) {
        cartaService.inspeccionarZonaJuego(jugadorActual, zonaEscogida);
    }

    public void inspeccionarTableroEnemigo(Jugador jugadorEnemigo, String zonaEscogida) {
        cartaService.inspeccionarTableroEnemigo(jugadorEnemigo, zonaEscogida);
    }

}