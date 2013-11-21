package Bucles;

import java.util.Scanner;

public class PRUEBAS {

	public static void main(String[] args) {
		 int numero;
         long factorial; //Máximo hasta factorial del número 20
         String respuesta = null;
         
         Scanner teclado = new Scanner(System.in);
		
		
		 do {                        
             
             do {
                     
                     System.out.print("Introduzca un número: ");
                     numero = teclado.nextInt();
                     
             } while ( numero < 0 );
             
             if ( numero != 0 ) {
                     
                     factorial = 1;
             
                     for ( int i = numero; i > 0; --i ) {
                     
                             factorial *= i; 
             
                     }
                     
                     System.out.printf( "El factorial de %d es igual a %,d\n", numero, factorial );                        
             
             } else {
                     
                     System.out.print( "El factorial de 0 es igual a 1\n" );
             
             }
             
             do {
             
                     System.out.print( "\n¿Quiere intertar otro número [s/n]? ");
                     respuesta = teclado.next().toLowerCase();
             
             } while ( !(respuesta.equals("s") || respuesta.equals("n") ) );                        
             
             
     } while ( respuesta.equals("s") );
     
     System.out.print( "\nGracias por participar y ¡hasta la próxima!" );
     
     teclado.close();

}

}