

public class Vehiculos {
    public static void main(String[] args) {
        
    }
}

class Vehiculo{
    private int speed;
    private int passagers;
    private String fuelType;

    public Vehiculo(int speed, int passagers, String fuelType){
        this.fuelType = fuelType;
        this.passagers = passagers;
        this.speed = speed;
    }

    public Vehiculo(){
        this.passagers = 1;
        this.speed = 0;
    }

    public void go(){
        System.err.println("Avanzando");
    }

    public void stop(){
        System.out.println("Detenido");
    }

    public void changerDirection(String direction){
        System.out.println("Avanzando a "+direction);
    }
}

