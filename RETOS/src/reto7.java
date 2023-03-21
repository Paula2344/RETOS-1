import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
       
      int num1=0,num2=0,apuesta=0,eleccion=0,vidas=3,seguir=1,perdida=0,ganar=0,total=0;
      String nombre;
      Scanner lectura=new Scanner(System.in);
      Random ram1=new Random();

      System.out.println("Ingrese su nombre");
      nombre=lectura.nextLine();
      System.out.println("Holi, "+nombre+" listo para jugar? ");
      System.out.println("Para este juego tendras un maximo de "+vidas+ " intentos, Buena Suerte :)");

      while (seguir==1 && vidas>=1 && vidas<=3) {
       System.out.println("Ingrese la cantidad de dinero que desea apostar");
       apuesta=lectura.nextInt();
       perdida=apuesta-apuesta;
       ganar=apuesta*2;
       System.out.println("Elija piedra(0) papel(1) o tijera(2)");
       eleccion=lectura.nextInt();
       num1=ram1.nextInt(3);

       if ((num2== 0) &&(num1==0) ) {
        System.out.println("Empate ambos sacaron piedra"+" no ganaste la cantidad de "+apuesta);
    }else if ((num2==1)&&(num1==1)) {
        System.out.println("Empate ambos sacaron papel"+" no ganaste la cantidad de "+apuesta);  
    }else if ((num2==2)&&(num1==2)) {
        System.out.println("Empate ambos sacaron tijera"+" no ganaste la cantidad de "+apuesta);
    }else if ((num2==0)&&(num1==1)){
        vidas=vidas-1;
        System.out.println("Perdiste ha ganado papel"+" Tu dinero apostado "+perdida);
        total=total-perdida;
    }else if ((num2==1)&&(num1==2)){
        vidas=vidas-1;
    System.out.println("Perdiste ha ganado tijera, tu dinero actual "+perdida);
    total=total-perdida;
    }else if ((num2==2)&&(num1==0)){
        vidas=vidas-1;
    System.out.println("Perdiste ha ganado tijera, tu dinero actual "+perdida);
    total=total-perdida;
    }else if ((num2==0)&&(num1==2)){
    System.out.println("Piedra a ganado a tijera, ganaste :), tu dinero ganado "+ganar);
    total=total+ganar;
    }else if ((num2==1)&&(num1==0)){
    System.out.println("Papel a ganado a piedra, ganaste :), tu dinero ganado "+ganar);
    total=total+ganar;
    }else if ((num2==2)&&(num1==1)){
    System.out.println("Tijera a ganado a papel, ganaste :), tu dinero ganado "+ganar);
    total=total+ganar;
    }
    System.out.println(total);
    System.out.println("Desea seguir jugando  seguir(1)  salir(0)");
    seguir=lectura.nextInt();
    
    }
    System.out.println("Gracias por jugar ");

    lectura.close();
    }
    
}
