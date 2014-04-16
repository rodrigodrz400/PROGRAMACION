package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaYperimetroRectanguloAngel {

	 private static Scanner teclado;
     
     public static double leerLadoPositivo() {
             
             teclado = new Scanner(System.in);
             double lado=0;
             boolean bueno;
             
             do {
                 System.out.print("Introduzca lado: ");
                 
                 try {
                 
                         lado = teclado.nextDouble();
                 
                         bueno = ( lado > 0 );
                 }
                 catch ( InputMismatchException entradaInvalida ) {
                         System.out.println("Debe introducir números. Inténtelo de nuevo");
                         teclado.nextLine();
                         bueno=false;
                 }
                 
             }while (!bueno);
                                             
             return lado;
     }

     public static void main(String[] args) {

             double[] lados = new double[2];
             boolean ladoCorrecto;
             boolean hayErrores;                        
                             
             for ( int i = 0; i < lados.length; ++i ) 
                  lados[i] = leerLadoPositivo();

             
             System.out.println("\n=========== R E S U L T A D O S ===========");
             
             for ( int i = 0; i < lados.length; ++i ) {
                     
                     System.out.printf("===\tLado nº %d: %15.2f\t===\n", (i+1), lados[i]);
             }
             
             System.out.printf("===\tPERIMETRO: %15.2f\t===\n", (lados[0] + lados[1]) * 2 );
             System.out.printf("===\tAREA: %20.2f\t===\n", lados[0] * lados[1] );                
     }
}