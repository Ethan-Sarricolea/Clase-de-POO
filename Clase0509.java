/**
 * Elabora un programa que implemente un metodo llamado printFinalGrade y lo invoque desde el main. El programa debe retornar el valor segun las condiciones:
 * menor a 6 mal
 * menor a 8 regular
 * menor a 9 bien
 * 9 o mayor excelente
 */

import java.util.Scanner;

public class Clase0509 {
    
    public static String printFinalGrade(float calif){
        if (calif<6){
            return "Mal";
        } else if (calif>=6 && calif<8){
            return "Regular";
        } else if (calif>=8 && calif<9){
            return "Bien";
        } else if (calif>=9){
            return "Excelente";
        }
        return "Syntax error";
    }

    public static void main(String[] args){
        System.out.print("Ingresa tu calificación final: ");
        try (Scanner input = new Scanner(System.in)) {
            float calificacion = input.nextFloat();
            System.out.printf("Tu calificacion (%.2f) esta: %s", calificacion, printFinalGrade(calificacion));
        }
        final int X = 20;
        System.out.println(X);
    }
}
