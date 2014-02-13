package EjerciciosIniciales.Conversores;

import java.util.Scanner;

import EjemplosIniciales.Cuenta;

/*
Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple y 
cuádruple de un número proporcionado en su constructor (realiza un método para doble,
 otro para triple y otro para cuádruple). En este caso haz que la clase tenga 
 un método main y comprueba los distintos métodos, sin necesidad de crear un método de prueba.
*/
public class MiNumero {
	
	private static double numero;
	
	public static double numeroDoble(){
		numero = numero *2;
		return numero;
	}
	public static double numeroTriple(){
		numero = numero *3;
		return numero;
	}
	public static double numeroCuadruple(){
		numero = numero *4;
		return numero;
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("\n*  Menú Números  *");
			for (int k = 0; k < 18; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" Pulse 1. Para convertir el número introducido a su doble.");
				System.out.println(" Pulse 2. Para convertir el número introducido a su triple.");
				System.out.println(" Pulse 3. Para convertir el número introducido a su cuadruple. ");
				System.out.println(" Pulse 4. Para salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

			switch (opcion) {
			case 1:

				System.out.println("Indique el número que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor doble del número " + numero + " es: " + numeroDoble());
				break;
			case 2:
				System.out.println("Indique el número que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor triple del número " + numero + " es: " + numeroTriple());
				break;
			case 3:
				System.out.println("Indique el número que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor cuadruple del número " + numero + " es: " + numeroCuadruple());
				break;

			case 4:
				System.out
						.println("---FIN DEL PROGRAMA---\n"
								+ "Gracias por utilizar nuestro conversor de números.");
				break;
			}
		} while (opcion != 4);

		teclado.close();
	}

}
