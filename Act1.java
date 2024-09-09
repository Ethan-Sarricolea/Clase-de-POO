
import java.util.Scanner;

public class Act1 {

    public static float calculo(int[] totales, int[] creditos,int cant){
        float promedio;
        int creditosTotales = 0;
        int total = 0;
        for (int i = 0; i < cant; i++) {
            creditosTotales += creditos[i];
            total += totales[i];
        }
        promedio = total / creditosTotales;
        return promedio;
    }

    public static void input(){
        try (Scanner input = new Scanner(System.in)) {
            int cant = input.nextInt();
            int[] creditos = new int[cant];
            int[] calificaciones = new int[cant];
            int[] totales = new int[cant];
            System.out.println("Coloca la cantidad de materias");
            for (int i = 0; i < totales.length; i++) {
               System.out.print("Creditos: ");
                creditos[i] = input.nextInt();
                System.out.print("Calificaciones: ");
                calificaciones[i] = input.nextInt();
                totales[i] = (creditos[i] * calificaciones[i]);
            }
            System.out.printf("Tu promedio ponderado es: %.2f",calculo(totales,creditos,cant));
        }
    }

    public static void printArray(int[] array, String name){
        System.out.printf("");
    }

    public static void main(String[] args){
        System.out.println("Coloca la cantidad de calificaciones y creditos: ");
        input();

    }
}
