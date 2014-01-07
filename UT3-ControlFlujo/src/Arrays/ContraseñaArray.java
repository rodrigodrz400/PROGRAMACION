package Arrays;

import java.util.Scanner;

public class ContraseñaArray {

	//Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras).
	//El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos,
	//lo que ocurra primero. Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres 
	//intentos fallidos.
	public static void main(String[] args) {

		String [] palabras = {"uno", "hola", "tera", "bit"};
		
		/*
		 * palabras [0] = "uno";
		 * palabras [1] = "hola";
		 */
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame una palabra: ");
		
		String intento;
		
		intento =  teclado.next();
		boolean encontrado = false;
		
		for (int i=0; i<palabras.length && encontrado==false; i++){
			if (intento.equals(palabras[i])) encontrado = true;
		}
		
		if (encontrado) System.out.println("Encontrado");
		
	}

}
