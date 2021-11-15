package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import domain.base.Alimento;
import domain.base.Animal;
import domain.base.Carta;
import domain.base.Habilidad;
import domain.base.Habitat;
import domain.derivada.animal.animalAcuatico.PezPayaso;
import domain.derivada.animal.animalAcuatico.Pulpo;
import domain.derivada.animal.animalAcuatico.TiburonBlanco;
import domain.derivada.animal.animalAcuatico.TortugaMarina;
import domain.derivada.animal.animalTerrestre.Iguana;
import domain.derivada.animal.animalTerrestre.LoboGris;
import domain.derivada.animal.animalTerrestre.MantisOrquidea;
import domain.derivada.animal.animalTerrestre.Rata;
import domain.derivada.habilidad.habilidadAcuatica.Captura;
import domain.derivada.habilidad.habilidadAcuatica.Coraza;
import domain.derivada.habilidad.habilidadAcuatica.Fortalecimiento;
import domain.derivada.habilidad.habilidadTerrestre.Aullido;
import domain.derivada.habilidad.habilidadTerrestre.Camuflaje;
import domain.derivada.habilidad.habilidadTerrestre.Enamoramiento;
import domain.derivada.habitat.habitatAcuatico.Anemona;
import domain.derivada.habitat.habitatAcuatico.Costa;
import domain.derivada.habitat.habitatTerrestre.Alcantarilla;
import domain.derivada.habitat.habitatTerrestre.Orquidea;
import utilidades.AsignadorCaracteristica;
import utilidades.Inspector;

public class CartaService {
    private List<Carta> cartasMazo = new ArrayList<Carta>();
    private List<Carta> cartasEnMano = new ArrayList<Carta>();
    private List<Carta> cartasTablero = new ArrayList<Carta>();

    public int getCantidadCartasMazo() {
        return cartasMazo.size();
    }

    public void llenarMazoCartas(int mazoSeleccionado) {

        int contadorId = 0;

        if (mazoSeleccionado == 0) {
            contadorId = 100;

        } else if (mazoSeleccionado == 1) {
            contadorId = 200;
        }

        int limiteDeCartas = 25;
        int cantidadCartasMazo = 0;

        int contadorAlimentos = 0;
        int limiteAlimentos = 9;

        int contadorAnimales = 0;
        int limiteAnimales = 9;

        int contadorHabilidades = 0;
        int limiteHabilidades = 4;

        int contadorHabitats = 0;
        int limiteHabitat = 3;

        while (cantidadCartasMazo < limiteDeCartas) {
            int id = AsignadorCaracteristica.asignarId(contadorId, mazoSeleccionado);
            if (contadorAlimentos < limiteAlimentos) {
                cartasMazo.add(new Alimento(id));
                contadorAlimentos++;

            } else if (contadorAnimales < limiteAnimales) {
                if (mazoSeleccionado == 0) {
                    switch (contadorAnimales) {
                    case 0:
                        cartasMazo.add(new Rata(id));
                        break;
                    case 1:
                        cartasMazo.add(new Rata(id));
                        break;
                    case 2:
                        cartasMazo.add(new Rata(id));
                        break;
                    case 3:
                        cartasMazo.add(new LoboGris(id));
                        break;
                    case 4:
                        cartasMazo.add(new LoboGris(id));
                        break;
                    case 5:
                        cartasMazo.add(new LoboGris(id));
                        break;
                    case 6:
                        cartasMazo.add(new Iguana(id));
                        break;
                    case 7:
                        cartasMazo.add(new Iguana(id));
                        break;
                    case 8:
                        cartasMazo.add(new MantisOrquidea(id));
                        break;

                    default:
                        break;

                    }
                } else if (mazoSeleccionado == 1) {
                    switch (contadorAnimales) {
                    case 0:
                        cartasMazo.add(new PezPayaso(id));
                        break;
                    case 1:
                        cartasMazo.add(new PezPayaso(id));
                        break;
                    case 2:
                        cartasMazo.add(new PezPayaso(id));
                        break;
                    case 3:
                        cartasMazo.add(new TortugaMarina(id));
                        break;
                    case 4:
                        cartasMazo.add(new TortugaMarina(id));
                        break;
                    case 5:
                        cartasMazo.add(new TortugaMarina(id));
                        break;
                    case 6:
                        cartasMazo.add(new Pulpo(id));
                        break;
                    case 7:
                        cartasMazo.add(new Pulpo(id));
                        break;
                    case 8:
                        cartasMazo.add(new TiburonBlanco(id));
                        break;

                    default:
                        break;

                    }
                }

                contadorAnimales++;
            } else if (contadorHabilidades < limiteHabilidades) {

                if (mazoSeleccionado == 0) {
                    switch (contadorHabilidades) {
                    case 0:
                        cartasMazo.add(new Aullido(id));
                        break;
                    case 1:
                        cartasMazo.add(new Aullido(id));
                        break;
                    case 2:
                        cartasMazo.add(new Camuflaje(id));
                        break;
                    case 3:
                        cartasMazo.add(new Enamoramiento(id));
                        break;

                    default:
                        break;

                    }
                } else if (mazoSeleccionado == 1) {
                    switch (contadorHabilidades) {
                    case 0:
                        cartasMazo.add(new Coraza(id));
                        break;
                    case 1:
                        cartasMazo.add(new Coraza(id));
                        break;
                    case 2:
                        cartasMazo.add(new Captura(id));
                        break;
                    case 3:
                        cartasMazo.add(new Fortalecimiento(id));
                        break;
                    default:
                        break;

                    }
                }
            } else if (contadorHabitats < limiteHabitat) {
                if (mazoSeleccionado == 0) {
                    switch (contadorHabilidades) {
                    case 0:
                        cartasMazo.add(new Alcantarilla(id));
                        break;
                    case 1:
                        cartasMazo.add(new Alcantarilla(id));
                        break;
                    case 2:
                        cartasMazo.add(new Orquidea(id));
                        break;
                    default:
                        break;

                    }
                } else if (mazoSeleccionado == 1) {
                    switch (contadorHabilidades) {
                    case 0:
                        cartasMazo.add(new Anemona(id));
                        break;
                    case 1:
                        cartasMazo.add(new Anemona(id));
                        break;
                    case 2:
                        cartasMazo.add(new Costa(id));
                        break;
                    default:
                        break;

                    }
                }
            }
            contadorId++;
            cantidadCartasMazo++;
        }

        mezclarMazo();
    }

    public void mezclarMazo() {
        Collections.shuffle(cartasMazo);
    }

    public void robarManoInicialCartas() {
        int manoInicial = 4;
        List<Carta> auxiliar = new ArrayList<Carta>();

        if (manoInicial >= getCantidadCartasMazo()) {
            cartasMazo.clear();

        } else {

            for (int i = 1; i <= manoInicial; i++) {
                if (tieneCartasElMazo()) {
                    auxiliar.add(cartasMazo.get(cartasMazo.size() - i));
                }
            }

            Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);

            cartasEnMano.addAll(auxiliar);
            cartasMazo.removeAll(auxiliar);
            auxiliar.clear();

        }

    }

    public void robarCarta() {

        if (0 >= getCantidadCartasMazo()) {
            cartasMazo.clear();

        } else {
            if (tieneCartasElMazo()) {
                Carta ultimaCartaMazo = cartasMazo.get(cartasMazo.size() - 1);

                cartasEnMano.add(ultimaCartaMazo);
                cartasMazo.remove(ultimaCartaMazo);

                Inspector.inspeccionarCarta(ultimaCartaMazo);
            }
        }

    }

    public void robarMultiplesCartas(int cantidadCartas) {

        List<Carta> auxiliar = new ArrayList<Carta>();

        if (cantidadCartas >= getCantidadCartasMazo()) {
            cartasMazo.clear();

        } else {

            for (int i = 1; i <= cantidadCartas; i++) {
                if (tieneCartasElMazo()) {
                    auxiliar.add(cartasMazo.get(cartasMazo.size() - i));
                }
            }

            Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);

            cartasEnMano.addAll(auxiliar);
            cartasMazo.removeAll(auxiliar);
            auxiliar.clear();
        }

    }

    public int bajarCartaAlTablero(int alimentosBajadosAlTablero) {

        int reservaAlimentos = devolverCantidadAlimentosEnReserva();

        List<Carta> removedorCartas = new ArrayList<Carta>();

        boolean cartasDisponibles = Inspector.inspeccionarCartasDisponiblesParaBajar(cartasEnMano, reservaAlimentos);
        boolean cartaEncontrada = false;

        if (cartasDisponibles) {

            List<Carta> cartasDisponiblesParaBajar = new ArrayList<Carta>();
            for (Carta carta : cartasEnMano) {
                if (carta.isSePuedeBajarAlTablero()) {
                    cartasDisponiblesParaBajar.add(carta);
                }
            }

            JOptionPane.showMessageDialog(null, "Actualmente tienes " + reservaAlimentos
                    + " alimentos en tu reserva. \n-Recuerda que sólo puedes bajar un alimento por turno y este debe ser bajado antes que cualquier otra carta.-",
                    "Alimentos en tu reserva", 1);

            Inspector.inspeccionarMultiplesCartasPorZona(cartasDisponiblesParaBajar);

            int cartaABajar = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "-Ingresa el [ID] de la carta a bajar.-", "[ID] completo", 1));

            for (Carta carta : cartasDisponiblesParaBajar) {

                if (carta.getId() == (cartaABajar)) {

                    cartaEncontrada = true;

                    if (carta instanceof Alimento) {
                        Alimento alimento = (Alimento) carta;

                        if (alimentosBajadosAlTablero == 0) {
                            JOptionPane.showMessageDialog(null, "Has agregado un alimento a tu reserva.",
                                    "Reserva de alimentos", 1);

                            alimento.setEnReservaDeAlimentos(true);
                            cartasTablero.add(alimento);
                            removedorCartas.add(alimento);
                            alimentosBajadosAlTablero++;

                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "Ya has bajado un alimento este turno o bien has bajado otro tipo de carta antes.",
                                    "Reserva de alimentos", 2);
                        }

                    } else if (carta instanceof Animal) {
                        Animal animal = (Animal) carta;

                        if (reservaAlimentos >= animal.getCoste()) {
                            JOptionPane.showMessageDialog(null, "Has agregado un animal a tu linea de reposo",
                                    "Linea de reposo", 1);
                            if (animal.getCoste() == 0) {

                            } else {

                                int alimentosConsumidos = 0;

                                for (Carta carta2 : cartasTablero) {
                                    if (carta2 instanceof Alimento) {
                                        Alimento alimentoDisponible = (Alimento) carta2;
                                        if (alimentoDisponible.isEnReservaDeAlimentos()) {
                                            if (alimentosConsumidos < animal.getCoste()) {
                                                alimentoDisponible.setAlimentoConsumido(true);
                                                alimentoDisponible.setEnReservaDeAlimentos(false);
                                                alimentosConsumidos++;
                                            }
                                        }
                                    }

                                }
                            }

                            animal.setEnLineaDeReposo(true);
                            cartasTablero.add(animal);
                            removedorCartas.add(animal);
                            alimentosBajadosAlTablero++;

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Actualmente no tienes alimentos suficientes para pagar el coste de esta carta.",
                                    "Alimentos faltantes", 2);
                        }

                    } else if (carta instanceof Habilidad) {
                        Habilidad habilidad = (Habilidad) carta;

                        if (reservaAlimentos >= habilidad.getCoste()) {
                            JOptionPane.showMessageDialog(null, "Has activado una habilidad", "Habilidad activa", 2);

                            if (habilidad.getCoste() == 0) {

                            } else {
                                int alimentosConsumidos = 0;
                                for (Carta carta2 : cartasTablero) {
                                    if (carta2 instanceof Alimento) {
                                        Alimento alimentoDisponible = (Alimento) carta2;
                                        if (alimentoDisponible.isEnReservaDeAlimentos()) {
                                            if (alimentosConsumidos < habilidad.getCoste()) {
                                                alimentoDisponible.setAlimentoConsumido(true);
                                                alimentoDisponible.setEnReservaDeAlimentos(false);
                                                alimentosConsumidos++;
                                            }
                                        }
                                    }

                                }
                            }

                            habilidad.activarEfecto();
                            removedorCartas.add(habilidad);
                            alimentosBajadosAlTablero++;

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Actualmente no tienes alimentos suficientes para pagar el coste de esta carta.",
                                    "Alimentos faltantes", 2);
                        }

                    } else if (carta instanceof Habitat) {
                        Habitat habitat = (Habitat) carta;

                        if (reservaAlimentos >= habitat.getCoste()) {
                            JOptionPane.showMessageDialog(null, "Has agregado un animal a tu linea de reposo",
                                    "Linea de reposo", 1);
                            if (habitat.getCoste() == 0) {

                            } else {
                                int alimentosConsumidos = 0;

                                for (Carta carta2 : cartasTablero) {
                                    if (carta2 instanceof Alimento) {
                                        Alimento alimentoDisponible = (Alimento) carta2;
                                        if (alimentoDisponible.isEnReservaDeAlimentos()) {
                                            if (alimentosConsumidos < habitat.getCoste()) {
                                                alimentoDisponible.setAlimentoConsumido(true);
                                                alimentoDisponible.setEnReservaDeAlimentos(false);
                                                alimentosConsumidos++;
                                            }
                                        }
                                    }

                                }
                            }

                            habitat.setEnLineaApoyo(true);
                            cartasTablero.add(habitat);
                            removedorCartas.add(habitat);
                            alimentosBajadosAlTablero++;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Actualmente no tienes alimentos suficientes para pagar el coste de esta carta.",
                                    "Alimentos faltantes", 2);
                        }

                    }

                }
            }

            cartasDisponiblesParaBajar.clear();

            if (!cartaEncontrada) {

                JOptionPane.showMessageDialog(null, "Has ingresado un [ID] incorrecto", "[ID] incorrecto", 0);
                bajarCartaAlTablero(alimentosBajadosAlTablero);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Actualmente no tienes cartas disponibles para bajar al tablero",
                    "Sin cartas disponibles", JOptionPane.WARNING_MESSAGE);
        }

        cartasEnMano.removeAll(removedorCartas);
        removedorCartas.clear();

        return alimentosBajadosAlTablero;
    }

    public void reagruparAlimentos() {

        for (Carta carta : cartasTablero) {
            if (carta instanceof Alimento) {
                Alimento alimento = (Alimento) carta;
                if (alimento.isAlimentoConsumido()) {
                    alimento.setAlimentoConsumido(false);
                    alimento.setEnReservaDeAlimentos(true);
                }
            }
        }

    }

    public void reagruparAnimalesEnZonaBatalla() {

        for (Carta carta : cartasTablero) {
            if (carta instanceof Animal) {
                Animal animal = (Animal) carta;
                if (animal.isEnLineaDeBatalla()) {
                    animal.setEnLineaDeBatalla(false);
                    animal.setEnLineaDeReposo(true);
                }

            }
        }
    }

    public int devolverCantidadAlimentosEnReserva() {

        List<Carta> alimentos = new ArrayList<Carta>();

        cartasTablero.stream()
                .filter((carta) -> carta instanceof Alimento && ((Alimento) carta).isEnReservaDeAlimentos())
                .forEach((carta) -> alimentos.add(carta));

        return alimentos.size();
    }

    public int devolverCantidadAnimalesEnReposo() {
        List<Carta> animalesEnReposo = new ArrayList<Carta>();

        cartasTablero.stream().filter((carta) -> carta instanceof Animal && ((Animal) carta).isEnLineaDeReposo())
                .forEach((carta) -> animalesEnReposo.add(carta));

        return animalesEnReposo.size();
    }

    public Carta seleccionarAnimalAtacanteEnReposo() {
        List<Carta> animalesEnReposo = new ArrayList<Carta>();

        cartasTablero.stream().filter((carta) -> carta instanceof Animal && ((Animal) carta).isEnLineaDeReposo())
                .forEach((carta) -> animalesEnReposo.add(carta));

        JOptionPane.showMessageDialog(null, animalesEnReposo.size());
        JOptionPane.showMessageDialog(null, "Escoge el animal para atacar", "Ataque", JOptionPane.QUESTION_MESSAGE);

        Inspector.inspeccionarMultiplesCartasPorZona(animalesEnReposo);

        boolean animalEncontrado = false;
        int idAnimalEscogido = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el ID del animal seleccionado para atacar", "[ID] del animal"));

        while (!animalEncontrado) {
            for (Carta animalAtacanteActual : animalesEnReposo) {
                if (idAnimalEscogido == animalAtacanteActual.getId()) {
                    Animal animalADevolver = (Animal) animalAtacanteActual;
                    animalADevolver.setEnLineaDeReposo(false);
                    animalADevolver.setEnLineaDeBatalla(true);
                    animalEncontrado = true;

                    return animalADevolver;
                }
            }
        }

        animalesEnReposo.clear();

        return null;

    }

    public Carta seleccionarAnimalDefensorEnReposo() {
        List<Carta> animalesEnReposo = new ArrayList<Carta>();

        cartasTablero.stream().filter((carta) -> carta instanceof Animal && ((Animal) carta).isEnLineaDeReposo())
                .forEach((carta) -> animalesEnReposo.add(carta));

        boolean animalEncontrado = false;

        Inspector.inspeccionarMultiplesCartasPorZona(animalesEnReposo);

        int idAnimalEscogido = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el ID del animal seleccionado para atacar", "[ID] del animal"));

        while (!animalEncontrado) {
            for (Carta animalDefensorActual : animalesEnReposo) {
                if (idAnimalEscogido == animalDefensorActual.getId()) {

                    Animal animalADevolver = (Animal) animalDefensorActual;
                    animalADevolver.setEnLineaDeReposo(false);
                    animalADevolver.setEnLineaDeBatalla(true);
                    animalEncontrado = true;

                    return animalADevolver;
                }
            }
        }

        animalesEnReposo.clear();

        return null;
    }

    public int calcularDañoCombate(Carta cartaAtacante, Carta cartaDefensora) {
        Animal animalAtacante = (Animal) cartaAtacante;
        Animal animalDefensor = (Animal) cartaDefensora;

        if (animalAtacante.getDano() == animalDefensor.getDano()) {
            JOptionPane.showMessageDialog(null,
                    "Ambos animales han sido destruidos por tener la misma puntuación de combate.", "Igualdad de daño",
                    JOptionPane.WARNING_MESSAGE);
            animalAtacante.setEnLineaDeBatalla(false);
            animalAtacante.setEnCementerio(true);

            animalDefensor.setEnLineaDeBatalla(false);
            animalDefensor.setEnCementerio(true);

        } else if (animalAtacante.getDano() < animalDefensor.getDano()) {
            JOptionPane.showMessageDialog(null,
                    "El animal " + animalAtacante.getNombre()
                            + " ha sido destruido por tener menor puntuación de combate.",
                    animalAtacante.getNombre() + "destruido", JOptionPane.ERROR_MESSAGE);

            animalAtacante.setEnLineaDeBatalla(false);
            animalAtacante.setEnCementerio(true);

        } else if (animalAtacante.getDano() > animalDefensor.getDano()) {

            JOptionPane.showMessageDialog(null,
                    "El animal " + animalDefensor.getNombre()
                            + " ha sido destruido por tener menor puntuación de combate.",
                    animalDefensor.getNombre() + "destruido", JOptionPane.ERROR_MESSAGE);

            animalDefensor.setEnLineaDeBatalla(false);
            animalDefensor.setEnCementerio(true);
        }

        return Math.abs(animalAtacante.getDano() - animalDefensor.getDano());
    }

    public int botarCartasMazo(Carta cartaAtacante) {

        Animal animalAtacante = (Animal) cartaAtacante;

        int danoMazo = animalAtacante.getDano();

        List<Carta> auxiliar = new ArrayList<Carta>();

        if (danoMazo >= getCantidadCartasMazo()) {
            cartasMazo.clear();

        } else {

            for (int i = 1; i <= danoMazo; i++) {
                if (tieneCartasElMazo()) {
                    auxiliar.add(cartasMazo.get(cartasMazo.size() - i));
                }
            }

            cartasMazo.removeAll(auxiliar);
        }

        auxiliar.clear();

        return animalAtacante.getDano();
    }

    public void botarCartasMazo(int dañoRecibido) {

        List<Carta> auxiliar = new ArrayList<Carta>();

        if (dañoRecibido >= getCantidadCartasMazo()) {
            cartasMazo.clear();

        } else {

            for (int i = 1; i <= dañoRecibido; i++) {
                if (tieneCartasElMazo()) {
                    auxiliar.add(cartasMazo.get(cartasMazo.size() - i));
                }
            }

            cartasMazo.removeAll(auxiliar);
        }

        auxiliar.clear();
    }

    private boolean tieneCartasElMazo() {
        if (cartasMazo.size() == 0) {
            return false;
        } else {
            return true;
        }

    }

    public void verCantidadAlimentosConsumidos() {
        List<Carta> auxiliar = new ArrayList<Carta>();

        for (Carta carta : cartasTablero) {
            if (carta instanceof Alimento) {
                Alimento alimento = (Alimento) carta;
                if (alimento.isAlimentoConsumido()) {
                    auxiliar.add(alimento);
                }

            }
        }

        JOptionPane.showMessageDialog(null, "Alimentos consumidos: " + auxiliar.size());
        Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);
    }

    public void verCantidadAlimentosDisponibles() {
        List<Carta> auxiliar = new ArrayList<Carta>();

        for (Carta carta : cartasTablero) {
            if (carta instanceof Alimento) {
                Alimento alimento = (Alimento) carta;
                if (alimento.isEnReservaDeAlimentos()) {
                    auxiliar.add(alimento);
                }

            }
        }

        JOptionPane.showMessageDialog(null, "Alimentos en reserva: " + auxiliar.size());
        Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);
    }

    public void verCantidadAnimalesReposo() {
        List<Carta> auxiliar = new ArrayList<Carta>();

        for (Carta carta : cartasTablero) {
            if (carta instanceof Animal) {
                Animal animal = (Animal) carta;
                if (animal.isEnLineaDeReposo()) {
                    auxiliar.add(animal);
                }

            }
        }

        JOptionPane.showMessageDialog(null, "Animales en reposo: " + auxiliar.size());
        Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);
    }

    public void verCantidadAnimalesBatalla() {
        List<Carta> auxiliar = new ArrayList<Carta>();

        for (Carta carta : cartasTablero) {
            if (carta instanceof Animal) {
                Animal animal = (Animal) carta;
                if (animal.isEnLineaDeBatalla()) {
                    auxiliar.add(animal);
                }

            }
        }

        JOptionPane.showMessageDialog(null, "Animales en batalla: " + auxiliar.size());
        Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);
    }

    public void regresarTodasLasCartasAlMazoYBarajar() {
        List<Carta> auxiliar = new ArrayList<Carta>();

        for (Carta carta : cartasTablero) {
            auxiliar.add(carta);
        }

        for (Carta carta : cartasEnMano) {
            auxiliar.add(carta);
        }

        cartasMazo.addAll(auxiliar);
        cartasEnMano.removeAll(auxiliar);
        cartasTablero.removeAll(auxiliar);

        auxiliar.clear();

        mezclarMazo();
    }
}