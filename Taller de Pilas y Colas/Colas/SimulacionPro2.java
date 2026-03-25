import java.util.*;

public class SimulacionPro2 {

    // 🔹 Clase Cliente
    static class Cliente {
        int id;
        int llegada;

        public Cliente(int id, int llegada) {
            this.id = id;
            this.llegada = llegada;
        }
    }

    // 🔹 Clase Caja
    static class Caja {
        double tiempoRestante;
        double min;
        double max;
        Random r = new Random();

        public Caja(double min, double max) {
            this.min = min;
            this.max = max;
            this.tiempoRestante = 0;
        }

        public boolean libre() {
            return tiempoRestante <= 0;
        }

        public void atender() {
            tiempoRestante = min + (r.nextDouble() * (max - min));
        }

        public void avanzarTiempo() {
            if (tiempoRestante > 0)
                tiempoRestante--;
        }
    }

    public static void main(String[] args) {

        Queue<Cliente> fila = new LinkedList<>();
        Random r = new Random();

        // 🔹 Cajas
        Caja caja1 = new Caja(1.5, 2.5);
        Caja caja2 = new Caja(2, 5);
        Caja caja3 = new Caja(2, 4);
        Caja caja4 = new Caja(2, 4.5);

        int tiempo = 0;
        int clienteID = 1;

        int clientesAtendidos = 0;
        int maxFila = 0;
        int sumaFila = 0;
        int tiempoCaja4 = 0;
        int maxEspera = 0;

        int proximaLlegada = 0;

        // 🔥 SIMULACIÓN
        while (tiempo < 420) {

            // 🔹 Llegada de clientes
            if (tiempo >= proximaLlegada) {
                fila.add(new Cliente(clienteID++, tiempo));
                proximaLlegada = tiempo + (1 + r.nextInt(2));
            }

            // 🔹 Activar caja 4
            boolean usarCaja4 = fila.size() > 20;

            if (usarCaja4)
                tiempoCaja4++;

            // 🔹 Lista de cajas activas
            List<Caja> cajas = new ArrayList<>();
            cajas.add(caja1);
            cajas.add(caja2);
            cajas.add(caja3);

            if (usarCaja4)
                cajas.add(caja4);

            // 🔹 Asignar clientes a cajas
            for (Caja c : cajas) {

                if (c.libre() && !fila.isEmpty()) {

                    Cliente cli = fila.poll();

                    int espera = tiempo - cli.llegada;
                    if (espera > maxEspera)
                        maxEspera = espera;

                    c.atender();
                    clientesAtendidos++;
                }
            }

            // 🔹 Avanzar tiempo en cajas
            for (Caja c : cajas) {
                c.avanzarTiempo();
            }

            // 🔹 Estadísticas
            sumaFila += fila.size();

            if (fila.size() > maxFila)
                maxFila = fila.size();

            tiempo++;
        }

        double promedio = (double) sumaFila / 420;

        // 🔥 RESULTADOS
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Promedio fila: " + promedio);
        System.out.println("Max fila: " + maxFila);
        System.out.println("Max espera: " + maxEspera);
        System.out.println("Tiempo caja 4 activa: " + tiempoCaja4 + " minutos");
    }
}