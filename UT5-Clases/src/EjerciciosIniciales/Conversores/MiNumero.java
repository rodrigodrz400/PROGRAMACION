package EjerciciosIniciales.Conversores;

import java.util.Scanner;

import EjemplosIniciales.Cuenta;

/*
Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple y 
cu�druple de un n�mero proporcionado en su constructor (realiza un m�todo para doble,
 otro para triple y otro para cu�druple). En este caso haz que la clase tenga 
 un m�todo main y comprueba los distintos m�todos, sin necesidad de crear un m�todo de prueba.
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
			System.out.println("\n*  Men� N�meros  *");
			for (int k = 0; k < 18; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" Pulse 1. Para convertir el n�mero introducido a su doble.");
				System.out.println(" Pulse 2. Para convertir el n�mero introducido a su triple.");
				System.out.println(" Pulse 3. Para convertir el n�mero introducido a su cuadruple. ");
				System.out.println(" Pulse 4. Para salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

			switch (opcion) {
			case 1:

				System.out.println("Indique el n�mero que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor doble del n�mero " + numero + " es: " + numeroDoble());
				break;
			case 2:
				System.out.println("Indique el n�mero que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor triple del n�mero " + numero + " es: " + numeroTriple());
				break;
			case 3:
				System.out.println("Indique el n�mero que desea tranformar: ");
				numero = teclado.nextDouble();
				System.out.println("El valor cuadruple del n�mero " + numero + " es: " + numeroCuadruple());
				break;

			case 4:
				System.out
						.println("---FIN DEL PROGRAMA---\n"
								+ "Gracias por utilizar nuestro conversor de n�meros.");
				break;
			}
		} while (opcion != 4);

		teclado.close();
	}

}
