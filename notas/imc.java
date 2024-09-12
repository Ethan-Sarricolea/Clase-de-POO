package notas;

import java.util.Scanner;

public class imc {

    public static String imcText(double imc){
        String texto;
        if (imc>=30)
            texto = "Obesidad";
        else if (imc<30 && imc>=25)
            texto = "Sobrepeso";
        else if(imc<25 && imc>=18.5)
            texto = "Normal";
        else 
            texto = "Bajo peso";
        return texto;
    }
    public static void main(String[] args){
        byte peso;
        float altura;
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.print("Coloca tu Peso: ");
        peso = input.nextByte();
        System.out.print("Coloca tu Estatura en metros: ");
        altura = input.nextFloat();
        altura = altura*altura;
        try {
            input.close();
        } catch (Exception e) {}
        System.out.printf("Tu imc es: %.1f",peso/altura);
        System.out.printf("\nTu peso esta en: %s",imcText(peso/altura));

    }
}