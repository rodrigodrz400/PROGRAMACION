package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroMayor {

	//Escribe un programa que pida dos n�meros y que visualice el n�mero que sea mayor de los dos. 
	//Si los dos son iguales, imprimir� cualquiera de ellos.
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
			
		System.out.print("Escriba el primer n�mero entero:");
		int numero1 = teclado.nextInt();
		System.out.print("Escriba el segundo n�emro entero:");
		int numero2 = teclado.nextInt();
			

	//visualizar el n�mero que sea mayor de los dos. 
		if (numero1 >= numero2){	
			System.out.print("El n�mero " + numero1 + ", es el mayor.");
		}else{
			System.out.print("El n�mero " + numero2 + ", es el mayor.");
		}
		
	teclado.close();
	}

}
