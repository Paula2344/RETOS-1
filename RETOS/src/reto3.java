import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[]args) {

        int apuesta=0;
        int eleccion=0;
        int moneda=0;

        Scanner lectura=new Scanner(System.in);
        Random mone=new Random();

        System.out.println("Desea añadir una apuesta? si(1) no(2)");
        apuesta=lectura.nextInt();
        if (apuesta==1) {
            System.out.println("Cuanto dinero desea apostar?");
            apuesta=lectura.nextInt();
        }else{
            System.out.println("Continuar juego");
        }
    
    System.out.println("Elija cara(1) o sello (2)");
    eleccion=lectura.nextInt();
    moneda=mone.nextInt(2);

    if(eleccion==moneda){
        System.out.println("Felicidades Ganaste :3");
    }else{
        System.out.println("Perdiste :(");
    }

    lectura.close();
    }
    
}
