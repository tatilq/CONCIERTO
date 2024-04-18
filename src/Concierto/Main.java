package Concierto;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;
        char rpta = 'n';
        //Entrada entrada1 = new Entrada("00001", "VIP");
        ArrayList<Entrada> romeo= new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("BIENVENIDOS AL CONCIERTO");
            System.out.println("========================");
            System.out.println("1.- Comprar entradas");
            System.out.println("2.- Mostrar entradas vendidas");
            System.out.println("2.- Mostrar entradas");

            System.out.println("Ingresar una opcion");

            opcion = sc.nextInt();
            switch(opcion)
            {
                case 1:

                    Entrada a = generarEntrada();
                    romeo.add(a);
                    System.out.println("Deseas continuar s/n");

                    rpta = sc.next().charAt(0);

                    break;
                case 2:

                    mostrarTodasEntradas(romeo);
                    break;


            }

        }
        while(rpta == 's' || rpta == 'S');;

    }

    public static Entrada generarEntrada()
    {
        Scanner sc = new Scanner(System.in);

        String correo = "";
        String tipoEntrada = "";

        System.out.println("Ingres el correo: ");
        correo=sc.nextLine();
        System.out.println("Ingresa tu tipo de entrada");
        tipoEntrada=sc.nextLine();


        Entrada entradaAventura = new Entrada(tipoEntrada, correo);
        System.out.println("LAS ENTRADAS SON: ");
        System.out.println(entradaAventura.mostrarDatos());
        return entradaAventura;

    }
    public static void mostrarTodasEntradas( ArrayList<Entrada> entrada)
    {
        for(Entrada entradas : entrada)
        {
            System.out.println(entradas.mostrarDatos());
        }
    }
}