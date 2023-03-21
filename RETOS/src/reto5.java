import java.util.Random;
import java.util.Scanner;

public class reto5 {
  public static void main(String[] args) {
    
      int apuesta=0,eleccion=0,moneda=0,intentos=15,intento=0;
      String nombre;
      
      Scanner lectura=new Scanner(System.in);
      Random mone=new Random();

      System.out.println("Digite su nombre");
      nombre=lectura.nextLine();
      System.out.println("Hola "+nombre+" bienvenido al juego de Cara o Sello");
      System.out.println("Para este juego tendras un maximo de "+intentos+ " intentos, Buena Suerte :)");

      while (intento<intentos) {
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
      System.out.println("Perdiste te quedan "+(intentos-1)+ " intentos :(");
      intentos --;
  
     }
 
    }
    if (intento==intentos) {
     
      System.out.println("Sus intentos se han acabado, gracias por jugar "+nombre);
     }

  lectura.close();
  
}
}