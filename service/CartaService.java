package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import domain.base.Alimento;
import domain.base.Carta;
import domain.derivada.Jugador;
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
        // se llena el mazo con cartas y luego se mezcla

        int contadorId = 1;

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
            String id = AsignadorCaracteristica.asignarId(contadorId, mazoSeleccionado);
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

    public void robarMultiplesCartas(Jugador jugador, int cantidadCartas) {

        List<Carta> auxiliar = new ArrayList<Carta>();
        for (int i = 1; i <= cantidadCartas; i++) {
            Carta ultimaCartaMazo = cartasMazo.get(cartasMazo.size() - i);

            auxiliar.add(ultimaCartaMazo);
        }

        JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha robado " + cantidadCartas + " cartas del mazo.");

        Inspector.inspeccionarMultiplesCartas(auxiliar);

        cartasEnMano.addAll(auxiliar);
        cartasMazo.removeAll(auxiliar);
        auxiliar.clear();

    }

    public void robarCarta(Jugador jugador) {
        Carta ultimaCartaMazo = cartasMazo.get(cartasMazo.size() - 1);

        cartasEnMano.add(ultimaCartaMazo);
        cartasMazo.remove(ultimaCartaMazo);

        JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha robado una carta del mazo.");

        Inspector.inspeccionarCarta(ultimaCartaMazo);

    }

}
