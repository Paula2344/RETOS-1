import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        int aleatorio=0,intentos = 0,elegido;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Holi, en este juego tendras que adivinar un numero del 1 al 100 en 10 intentos");
        System.out.println("¿Facil verdad?:)");
	    aleatorio= (int) (Math.random() * 100) + 1;
        do {
            System.out.println("Intento Numero " + (intentos + 1));
            elegido = lectura.nextInt();

            if (elegido < aleatorio) {
                System.out.println("El numero que pusiste es mayor al elegido");
            } else if (elegido > aleatorio) {
                System.out.println("El numero que pusiste es menor al elegido");
            }

            intentos++;
        } while (elegido != aleatorio && intentos < 10);

        if (elegido == aleatorio) {
            System.out.println("Felicitaciones ganaste :3, adivinaste el numero en " + intentos + " intentos");
        } else {
            System.out.println("No lograste adivinar el numero, el numero era "  + aleatorio);
        }
        lectura.close();
    }
}


