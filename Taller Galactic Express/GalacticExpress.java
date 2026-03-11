import java.util.ArrayList;
import java.util.Random;

public class GalacticExpress {


    public static void main(String[] args) {
        Random r = new Random();

        int [] energiaContenedores = new int [12];
        System.out.print( "Energia Original: ");
        
        for (int i=0; i< energiaContenedores.length; i++) {
            energiaContenedores[i] = 50 + r.nextInt(150);
            System.out.print(energiaContenedores[i]+"  ");
        }
        System.out.println();
        ArrayList<Integer> filtrados = new ArrayList<>();
        for (int valor : energiaContenedores){
            if (valor % 10 == 0) {
                filtrados.add(valor);
            }
        }

        System.out.println("filtrados (multiplos de 10) : " + filtrados);

        MapaCarga mapa = new 
        mapa.llenarMapa(filtrados);
        mapa.mostrarMapa();

        Suministro[] manifiesto = mapa.generarmanifiesto();

        System.out.println( "\n Manifiesto de vuelo: " );
        for (Suministros : manifiesto){
            if ( suministro ! = null){
                System.out.println( suministro);

            }
        }
            

    }   
}
