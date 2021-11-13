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

    public void robarMultiplesCartas(int cantidadCartas) {
        List<Carta> auxiliar = new ArrayList<Carta>();
        for (int i = 1; i <= cantidadCartas; i++) {
            Carta ultimaCartaMazo = cartasMazo.get(cartasMazo.size() - i);

            auxiliar.add(ultimaCartaMazo);
        }

        Inspector.inspeccionarMultiplesCartasPorZona(auxiliar);

        cartasEnMano.addAll(auxiliar);
        cartasMazo.removeAll(auxiliar);
        auxiliar.clear();

    }

    public void robarCarta() {
        Carta ultimaCartaMazo = cartasMazo.get(cartasMazo.size() - 1);

        cartasEnMano.add(ultimaCartaMazo);
        cartasMazo.remove(ultimaCartaMazo);

        Inspector.inspeccionarCarta(ultimaCartaMazo);

    }

    public void bajarCartaAlTablero() {
        int reservaAlimentos = cantidadAlimentosEnReserva();

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

            boolean alimentoBajadoAlTablero = false;

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

                        if (!alimentoBajadoAlTablero) {
                            JOptionPane.showMessageDialog(null, "Has agregado un alimento a tu reserva.",
                                    "Reserva de alimentos", 1);

                            alimento.setEnReservaDeAlimentos(true);
                            cartasTablero.add(alimento);
                            removedorCartas.add(alimento);
                            alimentoBajadoAlTablero = true;

                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "Ya has bajado un alimento este turno o bien has bajado otro tipo de carta antes.",
                                    "Reserva de alimentos", 2);
                        }

                    } else if (carta instanceof Animal) {
                        Animal animal = (Animal) carta;

                        if (reservaAlimentos >= animal.getCoste()) {
                            JOptionPane.showMessageDialog(null, "Has agregado un animal a tu linea defensvia",
                                    "Linea defensiva", 1);
                            if (animal.getCoste() == 0) {

                            } else {
                                int alimentosConsumidos = 0;

                                for (Carta carta2 : cartasTablero) {
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

                            animal.setEnLineaDefensiva(true);
                            cartasTablero.add(animal);
                            removedorCartas.add(animal);
                            alimentoBajadoAlTablero = true;

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

                            habilidad.activarEfecto();
                            removedorCartas.add(habilidad);
                            alimentoBajadoAlTablero = true;

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Actualmente no tienes alimentos suficientes para pagar el coste de esta carta.",
                                    "Alimentos faltantes", 2);
                        }

                    } else if (carta instanceof Habitat) {
                        Habitat habitat = (Habitat) carta;

                        if (reservaAlimentos >= habitat.getCoste()) {
                            JOptionPane.showMessageDialog(null, "Has agregado un animal a tu linea defensvia",
                                    "Linea defensiva", 1);
                            if (habitat.getCoste() == 0) {

                            } else {
                                int alimentosConsumidos = 0;

                                for (Carta carta2 : cartasTablero) {
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

                            habitat.setEnLineaApoyo(true);
                            cartasTablero.add(habitat);
                            removedorCartas.add(habitat);
                            alimentoBajadoAlTablero = true;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Actualmente no tienes alimentos suficientes para pagar el coste de esta carta.",
                                    "Alimentos faltantes", 2);
                        }

                    }

                }
            }

            cartasEnMano.removeAll(removedorCartas);
            cartasDisponiblesParaBajar.clear();
            removedorCartas.clear();

            System.out.println("carta encontrada: " + cartaEncontrada);
            if (!cartaEncontrada) {

                JOptionPane.showMessageDialog(null, "Has ingresado un [ID] incorrecto", "[ID] incorrecto", 0);
                bajarCartaAlTablero();

            }
        } // sin cartas disponibles
    }

    public int cantidadAlimentosEnReserva() {

        List<Carta> alimentos = new ArrayList<Carta>();

        cartasTablero.stream()
                .filter((carta) -> carta instanceof Alimento && ((Alimento) carta).isEnReservaDeAlimentos())
                .forEach((carta) -> alimentos.add(carta));

        return alimentos.size();
    }

}
