package co.edu.misiontic2022.c2.app;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Escriba el nombre del estudiante : " );
        // Scanner input = new Scanner(System.in);
        // String nombre = input.nextLine();
        // double notas = 0;// double[] notas  = new double[3];
        // for(int nota = 0 ; nota<3;nota++){
        // System.out.println("Escriba la nota :" + (nota+1));
        // double aux= input.nextDouble();
        // notas = notas + aux;

        // }
        // double promedio = notas /3 ;
        // String notafinal = (promedio >= 3) ? "Aprobo" : "Reprobo" ; 
        // System.out.println("El estudiante " + nombre +" "+notafinal);
        System.out.println("Digite las horas trabajdas:");
        Scanner input = new Scanner(System.in);
        int horas  = input.nextInt();

        System.out.printf("El sueldo del trabajador es :%d \n", horas*30000);
        input.close();
    }
}
