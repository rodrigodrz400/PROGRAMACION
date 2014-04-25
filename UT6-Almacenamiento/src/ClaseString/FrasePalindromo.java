package ClaseString;

import java.util.Scanner;

/*
 	Ejercicio 1**. Calcular si una frase es un palíndromo, comprobando si la cadena es simétrica.

	Ejercicio 2**. Mejorar el ejercicio 1, teniendo en cuenta que los espacios en blanco no cuentan,
	 			   ni las mayúsculas o minúsculas.
 */
public class FrasePalindromo {

	//se puede hacer sin el StringBuffer
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String cadenaMinusculas;
		boolean bError = false;
		
		
		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();
		cadenaMinusculas= cadena.toLowerCase().replaceAll(" ", "");
		
		
		StringBuffer cadenaInver = new StringBuffer(cadenaMinusculas);
		cadenaInver = cadenaInver.reverse();
		
		int inicio= 0;
		int fin= Math.round(cadenaMinusculas.length()/2);
		
		while ((inicio<fin) && (!bError)){
			 
			if (cadenaMinusculas.charAt(inicio)==cadenaInver.charAt(inicio)){				
				inicio++;
			} else {
				bError = true;
			}
		}
		
		if (!bError)
			System.out.println("\"" + cadena + "\"" + "--> ES un PALINDROMO");
		else
			System.out.println("\"" + cadena + "\"" + "--> NO es un PALINDROMO");
	

		teclado.close();
	}

}
