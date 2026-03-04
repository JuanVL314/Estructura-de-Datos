import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Muelle muelle = new Muelle();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar Contenedor");
            System.out.println("2. Mostrar Matriz");
            System.out.println("3. Mostrar Peso Total");
            System.out.println("4. Agrupar por Origen");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Origen (China, USA, Brasil, Colombia): ");
                    String origen = sc.nextLine();

                    System.out.println("Columna (0-9): ");
                    int columna = sc.nextInt();

                    muelle.agregarContenedor(origen, columna);
                    break;

                case 2:
                    muelle.mostrarMatriz();
                    break;

                case 3:
                    muelle.pesoTotal();
                    break;

                case 4:
                    muelle.agruparOrigen();
                    break;
            }

        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }
}