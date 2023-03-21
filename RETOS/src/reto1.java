import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {

       double gradosF;
       double gradosC;
       double gradosK;

      Scanner lectura=new Scanner(System.in);

      System.out.println("Ingrese la temperatura en grados F");
      gradosF=lectura.nextDouble();
      gradosC=(gradosF-32)*5/9;
      gradosK=gradosC+273.15;

      System.out.print("La temperatura en grados kelvin es "+gradosK);
      
      lectura.close();
    }
}
