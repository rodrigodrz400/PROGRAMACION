package Metodos;

import java.util.Scanner;

public class MostrarCuadradoAsteriscosB {

	/*
	 Escriba un método llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo número de filas y columnas)
	 de asteriscos cuyo lado se especifique en el parámetro entero lado.
	 Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que introduzca el usuario,
	 y despliegue los asteriscos con el método cuadradoDeAsteriscos.
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
              
              System.out.print("Dame el número de filas y columnas [ > 0 ]: ");
              numFilasColumnas = teclado.nextInt();                        
              
      } while ( numFilasColumnas <= 0 );
      
      teclado.close();
      
      String cuadrado = cuadradoAsteriscos(numFilasColumnas);
      
      System.out.println(cuadrado);

}

}