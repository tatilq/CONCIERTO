package Concierto;

public class Grada extends Entrada{

    private final String zona ="";
    private final int asiento = 0;
    private static final double suplemento = 10;
    private  static final int LIMITE_ESTE=2000;
    private  static final int LIMITE_OESTE=2000;
    private  static final int LIMITE_SUR=2000;

    public Grada(String tipoEntrada, String correo) {
        super(tipoEntrada, correo);
    }
    public double calculaPrecioEntrada() {
        return this.getPrecio()+ suplemento;
    }

    Tipo getTipoEntrada()
    {
        return Tipo.GRADA;
    }
}
