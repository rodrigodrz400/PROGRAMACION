package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroMayor {

	//Escribe un programa que pida dos números y que visualice el número que sea mayor de los dos. 
	//Si los dos son iguales, imprimirá cualquiera de ellos.
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
			
		System.out.print("Escriba el primer número entero:");
		int numero1 = teclado.nextInt();
		System.out.print("Escriba el segundo núemro entero:");
		int numero2 = teclado.nextInt();
			

	//visualizar el número que sea mayor de los dos. 
		if (numero1 >= numero2){	
			System.out.print("El número " + numero1 + ", es el mayor.");
		}else{
			System.out.print("El número " + numero2 + ", es el mayor.");
		}
		
	teclado.close();
	}

}
