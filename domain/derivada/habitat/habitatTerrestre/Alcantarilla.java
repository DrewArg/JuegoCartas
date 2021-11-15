package domain.derivada.habitat.habitatTerrestre;

import domain.base.Habitat;

public class Alcantarilla extends Habitat {
    private int id;
    private String nombre;
    private String tipo;
    private String efecto;
    private int coste;

    private boolean sePuedeBajarAlTablero;
    private boolean enLineaApoyo;
    private boolean enCementerio;

    public Alcantarilla(int id) {
        this.id = id;
        nombre = "Alcantarilla";
        tipo = "Habitat";
        efecto = "Puedes revivir una Rata por turno pagando su coste.";
        coste = 3;

        sePuedeBajarAlTablero = false;
        enLineaApoyo = false;
        enCementerio =false;
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
    public int getId() {
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

    public boolean isSePuedeBajarAlTablero() {
        return sePuedeBajarAlTablero;
    }

    public void setSePuedeBajarAlTablero(boolean sePuedeBajarAlTablero) {
        this.sePuedeBajarAlTablero = sePuedeBajarAlTablero;
    }

    public boolean isEnLineaApoyo() {
        return enLineaApoyo;
    }

    public void setEnLineaApoyo(boolean enLineaApoyo) {
        this.enLineaApoyo = enLineaApoyo;
    }

    public void setEnCementerio(boolean enCementerio){
        this.enCementerio=enCementerio;
    }

    public boolean isEnCementerio(){
        return enCementerio;
    }
}
