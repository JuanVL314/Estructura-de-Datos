import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Muelle muelle = new Muelle();

        Buque[] buques = new Buque[10];

        for (int i = 0; i < buques.length; i++) {
            buques[i] = new Buque();
        }

        int opcion;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Mostrar Buques");
            System.out.println("2. Agregar Contenedor");
            System.out.println("3. Mostrar Matriz");
            System.out.println("4. Mostrar Peso Total");
            System.out.println("5. Agrupar por Origen");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    for (int i = 0; i < buques.length; i++) {
                        System.out.println(buques[i]);
                    }

                    break;

                case 2:

                    System.out.println("Columna (0-9): ");
                    int columna = sc.nextInt();

                    muelle.agregarContenedor(columna);

                    break;

                case 3:

                    muelle.mostrarMatriz();

                    break;

                case 4:

                    muelle.pesoTotal();

                    break;

                case 5:

                    muelle.agruparOrigen();

                    break;

            }

        } while (opcion != 6);

        System.out.println("Programa finalizado.");
    }
}