package domain.derivada.habitat.habitatTerrestre;

import domain.base.Habitat;

public class Orquidea extends Habitat {
    private String id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    public Orquidea(String id) {
        this.id = id;
        nombre = "Orquidea";
        tipo = "Habitat";
        efecto = "Si tienes una Mantis Orquídea en juego, esta gana +1 de daño por cada animal aliado en juego. Si Mantis Orquídea está en tu cementerio, puedes revivirla pagando su coste.";
        coste = 6;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return nombre;
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return tipo;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getEfecto() {
        // TODO Auto-generated method stub
        return efecto;
    }

    @Override
    public void activarEfecto() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getCoste() {
        // TODO Auto-generated method stub
        return coste;
    }
}
