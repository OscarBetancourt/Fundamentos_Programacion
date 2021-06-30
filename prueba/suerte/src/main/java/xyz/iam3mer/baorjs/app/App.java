package xyz.iam3mer.baorjs.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner input = new Scanner(System.in);
        String fecha = input.nextLine();
        int indice  = fecha.indexOf('/');
        int dia = Integer.parseInt(fecha.substring(0,indice));
        int indice2 = fecha.lastIndexOf('/');
        int mes = Integer.parseInt(fecha.substring(++indice,indice2));
        int anio = Integer.parseInt(fecha.substring(++indice2,fecha.length()));
        int suerte = dia + mes + anio ;
        System.out.println(suerte);
        input.close();

    }
}
