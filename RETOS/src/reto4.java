import java.util.Scanner;
import java.util.Random;

public class reto4 {

    public static void main(String[] args) {

        int eleccion=0;
        int mano;
        int apuesta=0;
        
        Scanner lectura= new Scanner(System.in);
        Random man = new Random();

        System.out.println("Desea añadir una apuesta? si(1) no(2)");
        apuesta=lectura.nextInt();
        if (apuesta==1) {
            System.out.println("Cuanto dinero desea apostar?");
            apuesta=lectura.nextInt();
        }else{
            System.out.println("Continuar juego");
        }

        System.out.println("Elija piedra(1) papel (2) o tijera(3)");
        eleccion=lectura.nextInt();
        mano=man.nextInt(3);

    if(eleccion==mano){
        System.out.println("Felicidades Ganaste :3");
    }else if(eleccion==mano){
        System.out.println("Hay un empate :o");
    }else{
        System.out.println("Perdiste :(");
    }

    lectura.close();
    }

}
