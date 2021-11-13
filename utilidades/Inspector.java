package utilidades;

import java.util.List;

import javax.swing.JOptionPane;

import domain.base.Alimento;
import domain.base.Animal;
import domain.base.Carta;
import domain.base.Habilidad;
import domain.base.Habitat;

public class Inspector {
    public static void inspeccionarCarta(Carta carta) {

        if (carta instanceof Animal) {
            Animal animal = (Animal) carta;

            JOptionPane.showMessageDialog(null,
                    "[" + animal.getId() + "]\nTipo: " + animal.getTipo() + "\nNombre: " + animal.getNombre());

        } else if (carta instanceof Alimento) {

            Alimento alimento = (Alimento) carta;
            JOptionPane.showMessageDialog(null, "[" + alimento.getId() + "]\nTipo: " + alimento.getTipo());

        } else if (carta instanceof Habilidad) {
            Habilidad habilidad = (Habilidad) carta;
            JOptionPane.showMessageDialog(null,
                    "[" + habilidad.getId() + "]\nTipo: " + habilidad.getTipo() + "\nNombre: " + habilidad.getNombre());

        } else if (carta instanceof Habitat) {
            Habitat habitat = (Habitat) carta;
            JOptionPane.showMessageDialog(null,
                    "[" + habitat.getId() + "]\nTipo: " + habitat.getTipo() + "\nNombre: " + habitat.getNombre());

        }
    }

    public static void inspeccionarMultiplesCartas(List<Carta> zonaAInspeccionar) {

        if (zonaAInspeccionar.size() == 0) {

        } else {
            String cartasInspeccionadas = "";

            for (int i = 1; i <= zonaAInspeccionar.size(); i++) {
                Carta carta = zonaAInspeccionar.get(zonaAInspeccionar.size() - i);

                if (carta instanceof Animal) {
                    Animal animal = (Animal) carta;

                    cartasInspeccionadas = cartasInspeccionadas + "\n[" + animal.getId() + "]\nTipo: "
                            + animal.getTipo() + "\nNombre: " + animal.getNombre() + "\nCoste: " + animal.getCoste()
                            + "\nDaño: " + animal.getDano() + "\nEfecto: " + animal.getEfecto()
                            + "\n-----------------------------------";

                } else if (carta instanceof Alimento) {

                    Alimento alimento = (Alimento) carta;
                    cartasInspeccionadas = cartasInspeccionadas + "\n[" + alimento.getId() + "]\nTipo: "
                            + alimento.getTipo() + "\n-------------------";

                } else if (carta instanceof Habilidad) {
                    Habilidad habilidad = (Habilidad) carta;
                    cartasInspeccionadas = cartasInspeccionadas + "\n[" + habilidad.getId() + "]\nTipo: "
                            + habilidad.getTipo() + "\nNombre: " + habilidad.getNombre() + "\nCoste: "
                            + habilidad.getCoste() + "\nEfecto: " + habilidad.getEfecto()
                            + "\n-----------------------------------";

                } else if (carta instanceof Habitat) {
                    Habitat habitat = (Habitat) carta;
                    cartasInspeccionadas = cartasInspeccionadas + "\n[" + habitat.getId() + "]\nTipo: "
                            + habitat.getTipo() + "\nNombre: " + habitat.getNombre() + "\nCoste: " + habitat.getCoste()
                            + "\nEfecto: " + habitat.getEfecto() + "\n-----------------------------------";

                }
            }

            JOptionPane.showMessageDialog(null, cartasInspeccionadas);
        }

    }
}
