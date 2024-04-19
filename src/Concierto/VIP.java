package Concierto;

public class VIP extends Entrada {
    private static int contadorVIP;
    private final String codigoVIP="";
    private static final double SUPLEMENTO = 100;
    private static final int LIMITE_VIP=100;

    public VIP (String tipoEntrada, String correo) {
        super(tipoEntrada, correo);
        //his.codigoVIP = codigoVIP;
    }
    Tipo getTipoEntrada()
    {
        return Tipo.GRADA;
    }
}
