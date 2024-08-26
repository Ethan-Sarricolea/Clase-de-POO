
import java.util.Scanner;

/*
 * Crear un codigo que diga si un numero es par o impar
*/

public class parOImpar {
    public static void main(String[] args){
        System.out.println("Coloca un numero");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        try {
            input.close();
        } catch (Exception e) {}
        System.out.printf("El numero %d es %s",
            number,(number%2==0)? "Par" : "Impar");
    }
}

// Complejidad ciclomatica