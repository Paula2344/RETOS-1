import java.util.Scanner;

public class reto2 {
    public static void main(String[]args) {

        String nombre1;
        String nombre2;
        int edad;
        double peso;
        double dosis;

        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese el nombre del bebe ");
        nombre1=lectura.nextLine();
        System.out.println("Ingrese el nombre de la enfermera ");
        nombre2=lectura.nextLine();
        System.out.println("Ingrese el peso de bebe en kg ");
        peso=lectura.nextDouble();
        System.out.println("Ingrese la edad del bebe en meses ");
        edad=lectura.nextInt();
        
        dosis=(peso+10)/(edad*10)*8;
        System.out.println("El nombre del bebe es "+nombre1+ " y el nombre de la enfermera es "+nombre2+" y la dosis adecuada del bebe es " +dosis);
        
        lectura.close();
    }
}
