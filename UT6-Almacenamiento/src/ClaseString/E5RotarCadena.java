package ClaseString;

import java.util.Scanner;

public class E5RotarCadena {

	/*
	 Rotar una cadena a la derecha tantas veces como nos digan. El programa pedir� la cadena y 
	 el n�mero de posiciones a rotar, as� que si introducimos "Rotaciones de cadena" y el valor 4,
	  nos devolver� "denaRotaciones de ca"
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena = null;
		String cadenaAux;
		int pos = 0;
		
		
		
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();
		System.out.println("Indique el n�mero de posiciones que desea rotar en la cadena:");
		pos = teclado.nextInt();
		
		pos=pos%cadena.length();
		
		cadenaAux=cadena.substring(cadena.length()-pos, cadena.length());
		cadena= cadena.substring(0,cadena.length()-pos);
		
		cadena = (cadenaAux + cadena) ;
		
		System.out.println("\nRESULTADO--> " + cadena);
	}

}
