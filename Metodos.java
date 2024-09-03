class Metodos {
    /*
    parametro argumento (parametro se recibe / argumento se da)
    * Parametro es lo que pide
    * argumento es lo que da
    static se utiliza para evitar instanciar
    public es la visibilidad / encapsulamiento
    publico, privado y protegido (package por defecto)
     */

    // public static int min(byte x, byte y); interface o firma de metodo

    public static int suma(byte x, byte y){
        return (x + y);
    }

    public static int resta(byte x, byte y){
        return (x-y);
    }

    public static int multiplicacion(byte x, byte y){
        return (x*y);
    }

    public static int mayor(byte x, byte y){
        return (x>y ? x : y);
    }

    public void funcion(String texto){  // sin static
        System.out.println("texto: "+texto);
    }

    public static void main(String[] args){
        byte num1 = 92;
        byte num2 = 87;
        System.out.printf("La suma de %d y %d es %d\n",
        num1,num2,
        suma(num1,num2));
        System.out.printf("La resta de %d y %d es %d\n",
        num1,num2,
        resta(num1,num2));
        System.out.printf("La multiplicacion de %d y %d es %d\n",
        num1,num2,
        multiplicacion(num1,num2));
        System.out.printf("El mayor de %d y %d es %d\n",
        num1,num2,
        mayor(num1,num2));
        Metodos instance = new Metodos(); // instancia del objeto
        instance.funcion("Hola mundo");
    }
}
