public class Television{
    public static void main(String[] args) {
        Tv teleCuarto = new Tv();
    }
}

/**
 * volumen maximo = 10
 * canal maximo = 150
 */

class Tv {
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
        System.err.println(this.on);
    }

    /**
     * Funcion channelUp
     * 
     * incrementar en 1 el canal actual
     * 
     * @param channel (nuevo canal): int
     * @return void
     * 
     */
    public void setChanel(int channel) {
        if (channel < 150 && channel > 0){
            this.channel = channel;
        } else {
            System.out.println("El canal colocado no existe");
        }
    }

    /**
     * Funcion channelUp
     * 
     * incrementar en 1 el canal actual
     * 
     * @param newVolumeLevel (nuevo nivel de volumen): int
     * @return void
     * 
     */
    public void setVolume(int newVolumeLevel){
        if (newVolumeLevel < 10 && newVolumeLevel >= 0){
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
        this.channel = (this.channel < 150 ? this.channel++ : 1);
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
    public void channelDown(){
        this.channel = (this.channel > 1 ? this.channel-- : 150 );
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
    public void volumeUp(){
        this.volumeLevel = (this.volumeLevel<10 ? this.volumeLevel++ : this.volumeLevel);
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
    public void volumeDown(){
        this.volumeLevel = (this.volumeLevel<0 ? this.volumeLevel-- : this.volumeLevel);
    }

}