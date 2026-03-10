
public class Muelle {

    private Contenedor[][] matriz = new Contenedor[10][10];

    public void agregarContenedor(int columna) {

        if (columna < 0 || columna > 9) {
            System.out.println("Columna invalida");
            return;
        }

        for (int fila = 9; fila >= 0; fila--) {

            if (matriz[fila][columna] == null) {

                matriz[fila][columna] = new Contenedor();

                System.out.println("Contenedor agregado en fila " + fila);
                System.out.println(matriz[fila][columna]);

                return;
            }
        }

        System.out.println("Columna llena.");
    }

    public void pesoTotal() {

        int total = 0;

        System.out.println("\nPesos individuales:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {

                    System.out.println(matriz[i][j]);
                    total += matriz[i][j].getPeso();
                }
            }
        }

        System.out.println("Peso total general: " + total);
    }

    public void agruparOrigen() {

        int china = 0, usa = 0, brasil = 0, colombia = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {

                    String origen = matriz[i][j].getOrigen();

                    if (origen.equalsIgnoreCase("China"))
                        china++;
                    else if (origen.equalsIgnoreCase("USA"))
                        usa++;
                    else if (origen.equalsIgnoreCase("Brasil"))
                        brasil++;
                    else if (origen.equalsIgnoreCase("Colombia"))
                        colombia++;
                }
            }
        }

        System.out.println("\n--- Agrupacion por Origen ---");
        System.out.println("China: " + china);
        System.out.println("USA: " + usa);
        System.out.println("Brasil: " + brasil);
        System.out.println("Colombia: " + colombia);
    }

    public void mostrarMatriz() {

        System.out.println("\nEstado del Muelle:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] == null)
                    System.out.print("[   ]");
                else
                    System.out.print("[ X ]");
            }

            System.out.println();
        }
    }
}