/*
 * Codigo de la clase de Programacion orientada a objetos LIS 301 - UV
 */

// ejemplo de importacion import java.util.Scanner;

import java.util.Scanner;

public class clase2608{
    public static void main(String[] args){
        System.out.println("What is your name?");

        // recepcion de datos
        // instancia de la clase scanner en la var input
        Scanner input = new Scanner(System.in);
        String respuesta;
        respuesta = input.nextLine();
        try {
            input.close();
        } catch(Exception e){
            System.out.println("Error");
        }
        System.out.printf("Hi %s\nsee this...\n",respuesta);

        // cast (conversion de tipo)
        int number = (int) (System.currentTimeMillis() % 10);
        System.out.printf("%d + %d = %d",number,5,number+5);

        // Los datos primitivos se almacenan en stack (PILA), el contenido de un dato estructurado en heap
        // ejemplo input tiene su nombre en el stack y en heap sus datos
    }
}

// Polimorfismo = mismo metodo distinto comportamiento