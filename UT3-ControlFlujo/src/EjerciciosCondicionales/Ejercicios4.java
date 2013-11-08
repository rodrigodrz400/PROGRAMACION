package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios4 {

	/*
	 * El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. Crea un programa que pida:
	 *  tamaño del depósito (en litros), porcentaje del depósito que está lleno y litros de consumo por 100kms. 
	 *  El programa mostrará los kilómetros que quedan de autonomía. Si quedan menos de 30 kilómetros mostrará un aviso 
	 *  de que hay que repostar porque estamos usando la reserva.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		double autonomia = 0;
		double litros = 0;
	
		
		System.out.println("Por favor introduzca la capacidad en LITROS de su depósito.");
		double depositoLitros = teclado.nextDouble();
		
		System.out.println("Por favor introduzca (como NÚMERO REAL) el porcentaje del depósito ocupada por combustible");
		double depositoPorcentaje = teclado.nextDouble();
		
		System.out.println("Por favor introduzca el consumo medio EN LITROS de combustible cada 100 Km");
		double consumoMedio = teclado.nextDouble();
		
		teclado.close();
		
		
		litros = depositoLitros * (depositoPorcentaje * 1/100);
		autonomia = (litros * 100) / consumoMedio;
		
		System.out.printf("La autonomia de su vehículo es de: %.2f Kilómetros %n%n",  autonomia );
		
		
		if (autonomia < 30){
			System.out.println("------------AVISO DE REPOSTAJE------------");
			System.out.println("Su autonomía es inferior a 30 Kilómetros");
		}
		
		
	}

}
