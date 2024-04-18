package Concierto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Entrada {
    public static final  double precio = 50;
    //PARA LA FECHA DEL CONCIERTO 20/09/2024 20:30 en el WIZINK
    public static final LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.SEPTEMBER,7, 20,30,0);
    public final String codigo;
    public static int numEntradas = 1;
    public static final String grupo = "ROMEO SANTOS - TOUR 2024";
    public String correo;
    public LocalDateTime fechaHoraCompra;
    public boolean esVendida;
    public final String TIPO_ENTRADA;

    public Entrada(String tipoEntrada, String correo) {

        //RETORNA EL VALOR DE LA ENTRADA CREADA
        this.codigo = generarEntradas();
        this.TIPO_ENTRADA = tipoEntrada;
        this.correo = correo;
        this.esVendida=true;

        //LA FECHA Y HORA DE COMPRA SE INICIALIZA EN LA FECHA Y HORA ACTUAL CUANDO SE HACE LA COMPRA
        this.fechaHoraCompra= LocalDateTime.now();

    }
    public String generarEntradas()
    {
        numEntradas++;
        String cabecera = "ENT";
        String codigo = String.format("%05d", numEntradas);

        return cabecera+codigo;
    }
    public String mostrarDatos()
    {
        String mostrar=
                "\n Grupo: "+ grupo+
                "\n N° Entrada: "+ this.codigo+
                "\n Correo: "+ correo+
                "\n Fecha de compra: "+ this.fechaHoraCompra+
                "\n Fecha de concierto: "+ this.fechaHoraInicio+
                        "\n Tipo de Entrada: "+ this.TIPO_ENTRADA;
        return mostrar;

    }



    //toString() fechaHoraCompra, correo, estaVendida
    //equals()
    //calculaPrecio
}
