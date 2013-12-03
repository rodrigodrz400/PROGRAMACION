package SimulacroExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		double cantidadnumeros;
		int positivos= 0;
		int negativos = 0;
		double acumulador = 0;
		
		System.out.println("Introduzca la cantidad de n�meros que desea introducir:");
		cantidadnumeros = teclado.nextDouble();
		
		for (int i=1; i< (cantidadnumeros + 1); i++){
			System.out.println("Introduzca un n�mero:");
			double numero= teclado.nextDouble();
			if (numero > 0){
				positivos ++;
			}else if (numero < 0 ){
				negativos ++;
			}
			acumulador += numero;

		}
		System.out.println("La cantidad de n�meros positivos es: " + positivos);
		System.out.println("La cantidad de n�meros negativos es: " + negativos);
		System.out.println("La media de los n�meros introducidos es: " + ( acumulador/cantidadnumeros));

		
		teclado.close();
	}

}
