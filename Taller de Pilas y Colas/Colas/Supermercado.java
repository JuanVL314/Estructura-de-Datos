import java.util.*;

class Cliente {
    int id;
    int carrito;

    public Cliente(int id, int carrito) {
        this.id = id;
        this.carrito = carrito;
    }
}

public class Supermercado {

    public static void main(String[] args) {

        Queue<Integer> carritos = new LinkedList<>();
        Queue<Cliente> fila = new LinkedList<>();

        Queue<Cliente> caja1 = new LinkedList<>();
        Queue<Cliente> caja2 = new LinkedList<>();
        Queue<Cliente> caja3 = new LinkedList<>();

        Random r = new Random();

        // 🔹 25 carritos
        for (int i = 1; i <= 25; i++) {
            carritos.add(i);
        }

        int clienteID = 1;

        // 🔹 Simulación de llegada
        for (int tiempo = 0; tiempo < 20; tiempo++) {

            System.out.println("\nTiempo: " + tiempo);

            // llega cliente
            if (!carritos.isEmpty()) {
                int carrito = carritos.poll();
                Cliente c = new Cliente(clienteID++, carrito);
                fila.add(c);
                System.out.println("Cliente " + c.id + " entra con carrito " + carrito);
            } else {
                System.out.println("Cliente espera por carrito...");
            }

            // asignar a cajas
            while (!fila.isEmpty()) {

                Cliente c = fila.peek();

                if (caja1.size() <= caja2.size() && caja1.size() <= caja3.size()) {
                    caja1.add(fila.poll());
                    System.out.println("Cliente " + c.id + " va a Caja 1");
                } else if (caja2.size() <= caja1.size() && caja2.size() <= caja3.size()) {
                    caja2.add(fila.poll());
                    System.out.println("Cliente " + c.id + " va a Caja 2");
                } else {
                    caja3.add(fila.poll());
                    System.out.println("Cliente " + c.id + " va a Caja 3");
                }
            }

            // procesar pagos
            if (!caja1.isEmpty() && r.nextBoolean()) {
                Cliente c = caja1.poll();
                carritos.add(c.carrito);
                System.out.println("Cliente " + c.id + " paga en Caja 1");
            }

            if (!caja2.isEmpty() && r.nextBoolean()) {
                Cliente c = caja2.poll();
                carritos.add(c.carrito);
                System.out.println("Cliente " + c.id + " paga en Caja 2");
            }

            if (!caja3.isEmpty() && r.nextBoolean()) {
                Cliente c = caja3.poll();
                carritos.add(c.carrito);
                System.out.println("Cliente " + c.id + " paga en Caja 3");
            }
        }

        System.out.println("\nSimulación finalizada.");
    }
}