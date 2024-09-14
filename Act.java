/*
 * Author: Sarricolea Cortés Ethan Yahel
 * Description: Pasar arreglos y datos primitivos a metodos.
*/

// Importar la libreria Scanner para recepción de datos
import java.util.Scanner;

public class Act{

    /**
     * Metodo findMax
     * 
     * @param arreglo de enteros (int[])
     * @return valor maximo (int)
     */
    public static int findMax(int[] array){
        // Se declara la variable max como 0
        int max = 0;
        // Recorrer el arreglo para encontrar el numero mayor y retornarlo
        for (int i = 0; i < array.length; i++){
            max = (array[i] > max ? array[i] : max);
        }
        return max;
    }

    /**
     * Metodo findMin
     * 
     * Nota: Ningun numero sera menor que sero por lo que se debe tomar
     * el primer numero para posteriormente compararlo con todos los 
     * del arreglo.
     * 
     * @param arreglo de numeros enteros (int[])
     * @return valor minimo del arreglo (int)
     * 
     */

     public static int findMin(int[] array){
        // se declara la variable min como el ultimo numero del arreglo
        int min = array[array.length-1];
        // Recorrer el arreglo para encontrar el numero menor y retornarlo
        for (int i = array.length-1; i >= 0 ; i--){
            min = (array[i] < min ? array[i] : min );
        }
        return min;
    }

    /**
     * Metodo printArray
     * 
     * @param arreglo de numeros enteros (int[])
     * @return void
     */

    public static void printArray(int[] array){
        System.out.println("Datos del arreglo:");
        //Recorrer el arreglo
        for (int i = 0 ; i < array.length ; i++){
            System.out.printf("Valor [%d] = %d\n",i+1,array[i]);
        }
    }

    /**
     * Metodo extra: createArray
     * 
     * @param cantidad de numeros del arreglo (int)
     * @return arreglo de valores (int[])
     */

    public static int[] createArray(int cant){
        try (Scanner input = new Scanner(System.in)) {
            int [] array = new int [cant];
            for (int i = 0; i < cant ; i++){
                System.out.printf("Valor %d: ",i+1);
                array[i] = input.nextInt();
            }
            return array;
        }
    }

    public static void main(String[] args){
        try (// creacion de scanner para recepcion de datos
        Scanner input = new Scanner(System.in)) {
            System.out.println("Mayor y menor de un arreglo");
            System.out.println("Coloca el largo de tu arreglo: ");

            // Creacion del arreglo
            int cant = input.nextInt();
            int [] array = new int [cant];
            array = createArray(cant);

            // Mostrar arreglo
            printArray(array);

            // Numero mayor
            System.out.printf("Numero mayor: %d\n", findMax(array));

            // Numero menor
            System.out.printf("Numero menor: %d\n",findMin(array));
        }


    }
}