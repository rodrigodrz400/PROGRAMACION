package ClaseString;

import java.util.Scanner;

public class E7EncuentraNumYsuma {

	/*
	 Escribe un programa que encuentre los n�meros es una cadena y los sume. Por ejemplo, 
	 si le damos la cadena "en programaci�n 2 m�s 2 no son siempre 4, 24 de Abril de 2014."
	  dever� devolver 2046.
	 */
	private static int sumaCaracteresNum(){
		Scanner teclado = new Scanner(System.in);
		String cadena = "";
		
		int suma = 0;
		
		System.out.println("Introduce una frase para sumar los caractres num�ricos que contenga:");
		cadena = teclado.nextLine().replaceAll("[.|,]", " ");
		cadena = cadena.replaceAll("( )+", " ");
		
		String[] caracteres = cadena.split(" ");
		
		for(int i=0; i<caracteres.length; i++){
			
			suma += esNum(caracteres[i]);

		}teclado.close();
		
		return suma;
		
	}
	private static int esNum(String cadena){
		try {
			
			return Integer.parseInt(cadena); 
			
		} catch (NumberFormatException nfe){
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("\nEl resultado de la suma de todos los caracteres num�ricos es:\t"
						 +sumaCaracteresNum());
		
	}

}
