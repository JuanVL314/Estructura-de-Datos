import java.util.Queue;
import java.util.LinkedList;

public class ExplicacionCola {
    public static void main(String[] args) {
            Queue<String> objCola = new LinkedList<>();
    
            objCola.offer( "12" );
            objCola.offer( "43" );
            objCola.offer( "45" );
            objCola.offer( "23" );
            objCola.offer( "10" );
            objCola.offer( "34" );
    
            System.out.println(objCola );
    
            System.out.println("Cola Vacia: " + objCola.isEmpty());
    
            System.out.println("Frente de la Cola: " + objCola.peek()); 
    
            System.out.println("elemento eliminado con pool(): " + objCola.poll());
            
            System.out.println("elemento eliminadoncon remove(): " + objCola.remove());

            System.out.println(objCola);

            System.out.println("Tamaño de la cola : " + objCola.size());
    

        
    }
}