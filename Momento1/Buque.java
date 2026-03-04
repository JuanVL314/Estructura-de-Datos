
import java.util.Random;

public class Buque {

    private int id;
    private int peso;
    private String origen;

    private static Random r = new Random();

    public Buque(String origen) {
        this.id = 1000 + r.nextInt(9000); // ID aleatorio
        this.peso = 500 + r.nextInt(4501); // Peso aleatorio
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
        return "ID: " + id + " Peso: " + peso + " Origen: " + origen;
    }
}