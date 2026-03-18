import java.util.Stack;
public class ExplicacionPilas {
    public static void main(String[] args) {

        Stack<String> objPila = new Stack<String>();

        objPila.push( "Camilo" );
        objPila.push( "Daniela" );
        objPila.push( "Francico" );
        objPila.push( "Juan" );
        objPila.push( "Andrea" );
        objPila.push( "Dario" );

        System.out.println(objPila );

        System.out.println("Pila Vacia: " + objPila.empty());

        System.out.println("Tope de la Pila: " + objPila.peek()); 

        System.out.println("elemento eliminado: " + objPila.pop());

        System.out.println(objPila.search( "Camilo" ));
        System.out.println(objPila.search( "Daniela" ));
        System.out.println(objPila.search( "Francico" ));
        System.out.println(objPila.search( "Juan" ));
        System.out.println(objPila.search( "Andrea" ));



    }
    
}
