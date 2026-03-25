import java.util.Stack;

public class Ejercicio93 {

    public static boolean estaBalanceado(String exp) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);

            // Si abre → se guarda
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }

            // Si cierra → se verifica
            else if (c == ')' || c == ']' || c == '}') {

                if (pila.isEmpty()) {
                    return false;
                }

                char abierto = pila.pop();

                if ((c == ')' && abierto != '(') ||
                    (c == ']' && abierto != '[') ||
                    (c == '}' && abierto != '{')) {

                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {

        String exp1 = "((a+b)*5)";
        String exp2 = "2*[(a+b)/2.5 * 7*y";

        System.out.println("Expresión 1: " + estaBalanceado(exp1));
        System.out.println("Expresión 2: " + estaBalanceado(exp2));
    }
}