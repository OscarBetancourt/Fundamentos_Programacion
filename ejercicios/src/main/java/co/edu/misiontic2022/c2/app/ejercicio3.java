package co.edu.misiontic2022.c2.app;

import java.util.Scanner;

public class ejercicio3 {
    static void main( String[] args){

        System.out.println("Digite las horas trabajdas:");
        Scanner input = new Scanner(System.in);
        int horas  = input.nextInt();

        System.out.printf("El sueldo del trabajador es :%d \n ", horas*30000);
        input.close();
 
    }
    
}
