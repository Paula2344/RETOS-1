import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
       
        int valor1,valor2,valor3,valor4,valor5,totalCompra,iva;
        String nombre1,nombre2,nombre3,nombre4,nombre5;
        
        Scanner lectura =new Scanner (System.in);


        System.out.println("Ingrese el nombre de su primer producto");
        nombre1=lectura.nextLine();
        System.out.println("Ingrese el valor de su primer producto a llevar");
        valor1=lectura.nextInt();
        System.out.println("Ingrese el nombre de su segundo producto");
        nombre2=lectura.next();
        System.out.println("Ingrese el valor de su segundo producto a llevar");
        valor2=lectura.nextInt();
        System.out.println("Ingrese el nombre de su tercer producto");
        nombre3=lectura.next();
        System.out.println("Ingrese el valor de su tercer producto a llevar");
        valor3=lectura.nextInt();
        System.out.println("Ingrese el nombre de su cuarto producto");
        nombre4=lectura.next();
        System.out.println("Ingrese el valor de su cuarto producto a llevar");
        valor4=lectura.nextInt();
        System.out.println("Ingrese el nombre de su quinto producto");
        nombre5=lectura.next();
        System.out.println("Ingrese el valor de su quinto producto a llevar");
        valor5=lectura.nextInt();

        totalCompra=valor1+valor2+valor3+valor4+valor5;
        iva=(totalCompra*19)/100;
        totalCompra=totalCompra+iva;
        
        System.out.println("Sus productos fueron: "+nombre1+" con un valor de "+valor1+", "+nombre2+" con un valor de "+valor2+", "+nombre3+" con un valor de "+valor3+", "+nombre4+" con un valor de "+valor4+", "+nombre5+" con un valor de "+valor5+ " todo esto muestra un total de "+totalCompra);
        System.out.println("Gracias por su compra");
        lectura.close();
    }
}


