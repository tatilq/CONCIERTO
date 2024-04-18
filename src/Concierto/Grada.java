package Concierto;

public class Grada {

    public final String zona;
    public final int asiento;
    public static final double suplemento = 10;
    public  static final int LIMITE_ESTE=2000;
    public  static final int LIMITE_OESTE=2000;
    public  static final int LIMITE_SUR=2000;

    public Grada(String zona, int asiento) {
        this.zona = zona;
        this.asiento = asiento;
    }
}
