import java.util.Random;

public class Contenedor {

    private int id;
    private int peso;
    private String origen;

    private static Random r = new Random();

    public Contenedor(String origen) {

        int minId = 1000;
        int maxId = 9999;

        int minPeso = 500;
        int maxPeso = 5000;

        this.id = r.nextInt((maxId - minId + 1)) + minId;

        this.peso = r.nextInt((maxPeso - minPeso + 1)) + minPeso;

        this.origen = origen;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Peso: " + peso + " | Origen: " + origen;
    }
}