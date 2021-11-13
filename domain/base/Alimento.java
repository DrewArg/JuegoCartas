package domain.base;

public class Alimento implements Carta {
    private String id;
    private String tipo = "Alimento";

    public Alimento(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
