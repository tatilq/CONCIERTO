package Concierto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public abstract class Entrada {
    private static final  double precio = 50;
    //PARA LA FECHA DEL CONCIERTO 20/09/2024 20:30 en el WIZINK
    private static final LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.SEPTEMBER,7, 20,30,0);
    private final String codigo;
    private static int numEntradas = 1;
    private static final String grupo = "ROMEO SANTOS - TOUR 2024";
    private String correo;
    private LocalDateTime fechaHoraCompra;
    private boolean esVendida;
    //Almacenara el tipo de entrada que se inicia en vacio
    private final String TIPO_ENTRADA;

    public Entrada(String tipoEntrada, String correo) {
        //RETORNA EL VALOR DE LA ENTRADA CREADA
        this.codigo = generarCodigoEntradas();
        this.TIPO_ENTRADA = tipoEntrada;
        this.correo = correo;
        this.esVendida=true;
        //LA FECHA Y HORA DE COMPRA SE INICIALIZA EN LA FECHA Y HORA ACTUAL CUANDO SE HACE LA COMPRA
        this.fechaHoraCompra= LocalDateTime.now();
    }
    public String generarCodigoEntradas()
    {
        numEntradas++;
        String cabecera = "ENT";
        String codigo = String.format("%06d", numEntradas);

        return cabecera+codigo;
    }
    public String mostrarDatos()
    {
        String mostrar=
                "\n Grupo: "+ grupo+
                "\n N° Entrada: "+ codigo+
                "\n Correo: "+ correo+
                "\n Fecha de compra: "+ fechaHoraCompra+
                "\n Fecha de concierto: "+ fechaHoraInicio+
                        "\n Tipo de Entrada: "+ TIPO_ENTRADA;
        return mostrar;
    }
    //-------------------GETERS Y SETERS-------------------//
    public enum Tipo {
        PISTA,
        GRADA,
        VIP

    }
    public double getPrecio()
    {
        return precio;
    }
    public LocalDateTime getFechaHoraInicio()
    {
        return fechaHoraInicio;
    }
    public String getCodigo()
    {
        return codigo;
    }

    public String getGrupo()
    {
        return grupo;
    }
    public String getCorreo()
    {
        return correo;
    } public LocalDateTime getFechaHoraCompra()
    {
        return fechaHoraCompra;
    } public boolean getEsVendida()
    {
        return esVendida;
    }

    abstract Tipo getTipoEntrada();

}



//ENUM CON TODOS LOS TIPÓS DE ENTRADAS


//------------toString() fechaHoraCompra, correo, estaVendida
//------------equals()
//------------calculaPrecio