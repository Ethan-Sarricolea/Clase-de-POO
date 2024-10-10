public class Ropa {
    public static void main(String[] args) {
        Garments ropa1 = new Garments("pantalon", "Puma", 30);
    }
}

class Garments {
    private String tipo;
    private int talla;
    private String estado;
    private String marca;

    public Garments(String tipo, String marca,int talla, String estado){
        this.tipo = tipo;
        this.talla = talla;
        this.estado = estado;
        this.marca = marca;
    }

    public Garments(String tipo, String marca,int talla){
        this.tipo = tipo;
        this.talla = talla;
        this.estado = "Nuevo";
        this.marca = marca;
    }

    private void setTipo(String tipo){
        this.tipo = tipo;
    }

    public static void modificar(){
        
    }
}
