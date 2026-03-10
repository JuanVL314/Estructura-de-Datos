import java.util.Random;

public class Contenedor {

    private int id;
    private int peso;
    private String origen;

    private static Random r = new Random();

    String[] paises = {"China", "USA", "Brasil", "Colombia"};

    public Contenedor() {

        int minId = 1000;
        int maxId = 9999;

        int minPeso = 500;
        int maxPeso = 5000;

        id = r.nextInt((maxId - minId + 1)) + minId;
        peso = r.nextInt((maxPeso - minPeso + 1)) + minPeso;

        origen = paises[r.nextInt(paises.length)];
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