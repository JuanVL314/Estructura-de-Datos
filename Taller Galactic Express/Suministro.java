public class Suministro {

    private String id;
    private int nivelEnergia;
    private String prioridad;

    public Suministro(String id, int nivelEnergia, String prioridad) {
        this.id = id;
        this.nivelEnergia = nivelEnergia;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Energía: " + nivelEnergia + " | Prioridad: " + prioridad;

    }
}