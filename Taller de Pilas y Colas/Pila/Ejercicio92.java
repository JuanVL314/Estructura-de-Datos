import java.util.Stack;

public class Ejercicio92 {

    public static boolean esValido(String texto) {

        Stack<Character> pila = new Stack<>();

        String[] partes = texto.split("&");

        if (partes.length != 2) {
            return false;
        }

        String x = partes[0].trim();
        String y = partes[1].trim();

        // Guardar X en la pila
        for (int i = 0; i < x.length(); i++) {
            pila.push(x.charAt(i));
        }

        // Comparar con Y
        for (int i = 0; i < y.length(); i++) {

            if (pila.isEmpty() || pila.pop() != y.charAt(i)) {
                return false;
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {

        String prueba = "abc & cba";

        if (esValido(prueba)) {
            System.out.println("Es de la forma X & Y (inversa)");
        } else {
            System.out.println("No es válida");
        }
    }
}