package Concierto;

public class Pista extends Entrada {

    private static final int LIMITE_PISTA = 2900;

    public Pista(String tipoEntrada, String correo) {
        super(tipoEntrada, correo);
    }

    Tipo getTipoEntrada()
    {
        return Tipo.PISTA;
    }
}
