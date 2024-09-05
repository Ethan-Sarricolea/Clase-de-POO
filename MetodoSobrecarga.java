
/**
 * Sobrecargado es por los parametros no por el retorno
 * un metodo es sobrecargado cuando se llama igual pero sus parameteos son diferentes
 * 
 */

public class MetodoSobrecarga {

    public static int mayor(byte x, byte y){ // over loading
        return (x>y ? x : y);
    }

    public static boolean  mayor(){ // over loading
        return true;
    }

    public static void main(String[] args){
        
    }

}
