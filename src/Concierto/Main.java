package Concierto;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;
        char rpta = 'n';

        ArrayList<Grada> entradaGrada= new ArrayList<>();
        ArrayList<Pista> entradaPista= new ArrayList<>();
        ArrayList<VIP> entradaVip= new ArrayList<>();

        //Crear lista de entradas dispnibles
        //Crear lista de entradas vendidas

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("BIENVENIDOS AL CONCIERTO");
            System.out.println("========================");
            System.out.println("1.- Comprar entradas");
            System.out.println("2.- Mostrar entradas vendidas");
            System.out.println("3.- Mostrar todas las entradas");

            System.out.println("Ingresar una opcion");

            opcion = sc.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Deseas continuar s/n");
                    rpta = sc.next().charAt(0);
                    String correo = "";

                    //Grada g = new Grada("", "");
                    //Pista p = new Pista("", "");
                    //Pista v = new Pista("", "");

                    System.out.println("Ingres el correo: ");
                    correo = sc.nextLine();
                    System.out.println("Selecciona el tipo de entrada");
                    int c=0;
                    for (Entrada.Tipo tipo: Entrada.Tipo.values()){
                        c++;
                        System.out.println(c+".- "+tipo);
                    }
                    int opcionTipo= 0;
                    opcionTipo=sc.nextInt();
                    switch(opcionTipo)
                    {
                        case 1:
                            generarEntraPista(correo);
                            entradaGrada.add(generarEntradaGrada(correo));
                            break;
                        case 2:

                            generarEntradaGrada(correo);
                            entradaPista.add(generarEntraPista(correo));
                            break;
                        case 3:

                            generarEntraVIP(correo);
                            entradaVip.add(generarEntraVIP(correo));
                            break;
                    }

                    break;
                case 3:

                    //mostrarTodasEntradas(romeo);
                    break;
            }

        }
        while(rpta == 's' || rpta == 'S');;

    }

    public static Grada generarEntradaGrada(String correo) {
        Grada entradaGrada = new Grada("Grada", correo);;
        System.out.println("LAS ENTRADAS SON: ");
        return entradaGrada;

    }
    public static Pista generarEntraPista(String correo) {
        Pista entradaPista = new Pista("PISTA", correo);
        System.out.println("LAS ENTRADAS SON: ");
        return entradaPista;

    }
    public static VIP generarEntraVIP(String correo) {
        VIP entradaVip = new VIP("VIP",correo);;
        System.out.println("LAS ENTRADAS SON: ");
        return entradaVip;

    }
    public static void mostrarTodasEntradas( ArrayList<Entrada> entrada)
    {
        System.out.println("----LISTA DE ENTRADAS A TOUR ROMEO SANTOS-----");
        for(Entrada entradas : entrada)
        {
            System.out.println(entradas.mostrarDatos());
        }
        System.out.println("---------------------------------------------");
    }

}