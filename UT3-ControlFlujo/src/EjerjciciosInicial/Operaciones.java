package EjerjciciosInicial;

import java.util.Scanner;

public class Operaciones {

	
	//Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /. 
	//El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2;
		String operacion;
		
		System.out.println("Introduzca un n�mero entero");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca la operaci�n a realizar ( *, +, -, / )");
		operacion = teclado.next();
		
		System.out.println("Introduzca un segundo n�mero entero");
		numero2 = teclado.nextInt();
		
		
		switch (operacion){
		case "*": 
			System.out.println("El resultado es: " + (numero1 * numero2));
			break;
		case "+":
			System.out.println("El resultado es: " + (numero1 + numero2));
			break;
		case "-":
			System.out.println("El resultado es: " + (numero1 - numero2));
			break;
		case "/":
			System.out.println("El resultado es: " + (numero1 / numero2));
			break;
		default:
			System.out.println("El resultado no corresponde a ninguna operaci�n");
		}
		
		
	}

}
