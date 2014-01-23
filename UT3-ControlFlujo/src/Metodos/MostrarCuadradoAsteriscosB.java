package Metodos;

import java.util.Scanner;

public class MostrarCuadradoAsteriscosB {

	/*
	 Escriba un m�todo llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo n�mero de filas y columnas)
	 de asteriscos cuyo lado se especifique en el par�metro entero lado.
	 Incorpore este m�todo a una aplicaci�n que lea un valor entero para el par�metro lado que introduzca el usuario,
	 y despliegue los asteriscos con el m�todo cuadradoDeAsteriscos.
	 */
	  public static String cuadradoAsteriscos ( int filas_columnas ) {                
          
          String resultado="";
          
      for ( int i = 0; i < filas_columnas; ++i ) {
              
              for ( int j = 0; j < filas_columnas; ++j ) {
                      resultado=resultado+"*";
              }
              
              resultado=resultado+"\n";
      }
      
      return resultado;
}

public static void main(String[] args) {

      int numFilasColumnas;        
      
      Scanner teclado = new Scanner(System.in);
      
      do {
              
              System.out.print("Dame el n�mero de filas y columnas [ > 0 ]: ");
              numFilasColumnas = teclado.nextInt();                        
              
      } while ( numFilasColumnas <= 0 );
      
      teclado.close();
      
      String cuadrado = cuadradoAsteriscos(numFilasColumnas);
      
      System.out.println(cuadrado);

}

}