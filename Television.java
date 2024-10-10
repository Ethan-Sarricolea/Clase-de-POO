public class Television{
    public static void main(String[] args) {
        Tv teleCuarto = new Tv();
        teleCuarto.turnOn();
        System.out.println("Canal: " + teleCuarto.getChannel());
        teleCuarto.setChannel(121);
        teleCuarto.setChannel(120);
        System.out.println("Canal: " + teleCuarto.getChannel());
        teleCuarto.channelUp();
        System.out.println("Canal: " + teleCuarto.getChannel());
        teleCuarto.turnOn();
        teleCuarto.setVolume(8);
        teleCuarto.turnOn();
        teleCuarto.setVolume(9);
        System.out.println("volumen: " + teleCuarto.getVolume());
        teleCuarto.volumeUp();
        System.out.println("volumen: " + teleCuarto.getVolume());
        teleCuarto.setVolume(1);
        System.out.println("volumen: " + teleCuarto.getVolume());
        teleCuarto.volumeDown();
        System.out.println("volumen: " + teleCuarto.getVolume());
        teleCuarto.volumeDown();
        System.out.println("volumen: " + teleCuarto.getVolume());
        teleCuarto.turnOn();
    }
}

/**
 * volumen maximo = 0-10
 * canal maximo = 150
 */

class Tv {
    final int MAXCHANNEL = 120;
    final int MAXVOLUME = 10;
    int channel;
    int volumeLevel;
    boolean on;

    public Tv(){
        this.channel=0;
        this.volumeLevel=1;
        this.on = false;
    }

    /**
     * Funcion channelUp
     * 
     * incrementar en 1 el canal actual
     * 
     * @param void
     * @return void
     * 
     */
    public void turnOn(){
        this.on = !this.on;
        System.out.println(this.on ? "*Tv On*"  : "*Tv Off*");
    }

    /**
     * Funcion setChannel
     * 
     * incrementar en 1 el canal actual
     * 
     * @param channel (nuevo canal): int
     * @return void
     * 
     */
    public void setChannel(int channel) {
        if (this.on && channel <= this.MAXCHANNEL && channel > 0){
            this.channel = channel;
        } else {
            System.out.println("El canal colocado no existe");
        }
    }

    /**
     * Funcion setVolume
     * 
     * incrementar en 1 el canal actual
     * 
     * @param newVolumeLevel (nuevo nivel de volumen): int
     * @return void
     * 
     */
    public void setVolume(int newVolumeLevel){
        if (this.on && newVolumeLevel < this.MAXVOLUME && newVolumeLevel >= 0){
            this.volumeLevel = newVolumeLevel;
        } else {
            System.out.println("Ese volumen no es posible");
        }
    }

    /**
     * Funcion channelUp
     * 
     * incrementar en 1 el canal actual
     * 
     * @param void
     * @return void
     * 
     */
    public void channelUp(){
        if (this.on){
            this.channel = (this.channel < this.MAXCHANNEL ? this.channel++ : 1);
        }
        
    }

    /**
     * Funcion channelUp
     * 
     * decrementar en 1 el canal actual
     * 
     * @param void
     * @return void
     * 
     */
    public void channelDown(){
        if (this.on){
            this.channel = (this.channel > 1 ? this.channel-- : this.MAXCHANNEL );
        }
        
    }

    /**
     * Funcion getChannel
     * 
     * retorna el canal en que esta la tele
     * 
     * @param void
     * @return int (canal)
     * 
     */
    public int getChannel(){
        if (this.on){
            return this.channel;
        } else {
            System.out.println("La TV esta apagada");
            return 0;
        }
    }

    /**
     * Funcion volumeUp
     * 
     * incrementar en 1 el volumen actual
     * 
     * @param void
     * @return void
     * 
     */
    public void volumeUp(){
        if (this.on){
            this.volumeLevel = (this.volumeLevel<this.MAXVOLUME ? this.volumeLevel+=1 : this.volumeLevel);
        }
    }

    /**
     * Funcion volumeDown
     * 
     * decrementar en 1 el volumen actual
     * 
     * @param void
     * @return void
     * 
     */
    public void volumeDown(){
        if (this.on){
           this.volumeLevel = (this.volumeLevel>0 && this.volumeLevel!=-1 ? this.volumeLevel-=1 : this.volumeLevel); 
        }
    }

    /**
     * Funcion getVolume
     * 
     * retornar el nivel de volumen
     * 
     * @param void
     * @return int (nivel de volumen)
     * 
     */
    public int getVolume(){
        if (this.on){
            return this.volumeLevel;
        } else {
            System.out.println("La TV esta apagada");
            return 0;
        }
    }
}