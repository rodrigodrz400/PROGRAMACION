package Arrays;

import java.util.Scanner;

public class Contrase�aArray {

	//Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras).
	//El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos,
	//lo que ocurra primero. Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres 
	//intentos fallidos.
	public static void main(String[] args) {

		String [] palabras = {"uno", "hola", "tera", "bit"};
		
		/*
		 * palabras [0] = "uno";
		 * palabras [1] = "hola";
		 */
		
		Scanner teclado = new Scanner (System.in);
		boolean encontrado = false;
		
		String intento;
		
		do {
		System.out.println("Dame una palabra: ");
		
		
		
		intento =  teclado.next();
		
		
		
			for (int i=0; i<palabras.length && encontrado==false; i++){
				if (intento.equals(palabras[i])) encontrado = true;
			}
		}while (encontrado== false);
		
		
		System.out.println("Encontrado");
		
	}

}
