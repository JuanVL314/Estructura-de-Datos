import java.util.ArrayList;

public class MapaCarga<Suministro> {
    int[][] mapa; 

    public MapaCarga() {
        mapa = new int[3][3];
    }
   
    public void llenarMapa(ArrayList<Integer> filtrados) {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (index < filtrados.size()) {
                    mapa[i][j] = filtrados.get(index);
                    index++;
                } else {
                    mapa[i][j] = -1;
                }
            }
        }
    }

    public void mostrarMapa() {
        System.out.println("\nMapa de carga (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mapa[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Suministro [] generarManifiesto() {
        Suministro [] manifiesto = new Suministro[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = mapa[i][j];
                int pos = i * 3 + j;
                if (valor != -1) {
                    String prioridad = (valor > 100) ? "ALTA" : "ESTÁNDAR";
                    String id = "C-" + i + "-" + j;
                    manifiesto[pos] = new Suministro(id, valor, prioridad);
                } else {
                    manifiesto[pos] = null;
                }
            }
        }
        return manifiesto;
    }
}