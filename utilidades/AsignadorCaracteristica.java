package utilidades;

public class AsignadorCaracteristica {

    public static String asignarId(int contadorId, int mazoSeleccionado) {
        if (mazoSeleccionado == 0) {
            return "T" + contadorId;
        } else if (mazoSeleccionado == 1) {
            return "A" + contadorId;
        } else {
            return "V" + contadorId;
        }
    }

    

}