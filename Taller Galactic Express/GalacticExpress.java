import java.util.ArrayList;
import java.util.Random;

public class GalacticExpress {

    private int[] energiaContenedores = new int[12];
    private int[] filtrados = new int[12];
    private int[][] mapaCarga = new int[3][3];
    private Suministro[] manifiesto = new Suministro[9];

    private int contadorFiltrados = 0;

   
    public void procesarEnergia() {

        Random rand = new Random();

        System.out.println("Energía generada:");
        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = rand.nextInt(101) + 50;
            System.out.print(energiaContenedores[i] + " ");
        }

        
        for (int i = 0; i < energiaContenedores.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                filtrados[contadorFiltrados] = energiaContenedores[i];
                contadorFiltrados++;
            }
        }
    }

    
    public void organizarMapa() {

        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (k < contadorFiltrados) {
                    mapaCarga[i][j] = filtrados[k];
                    k++;
                } else {
                    mapaCarga[i][j] = -1;
                }
            }
        }

        System.out.println("\nMapa de carga:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mapaCarga[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
    public void generarManifiesto() {

        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (mapaCarga[i][j] != -1) {

                    int energia = mapaCarga[i][j];
                    String prioridad;

                    if (energia > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTÁNDAR";
                    }

                    String id = "C-" + i + "-" + j;

                    manifiesto[index] = new Suministro(id, energia, prioridad);

                } else {
                    manifiesto[index] = null;
                }

                index++;
            }
        }
    }

   
    public void mostrarManifiesto() {

        System.out.println("\nManifiesto de vuelo:");

        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i] != null) {
                System.out.println(manifiesto[i]);
            } else {
                System.out.println("Posición " + i + ": VACÍA");
            }
        }
    }
}