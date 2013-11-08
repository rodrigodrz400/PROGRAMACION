package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios4 {

	/*
	 * El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. Crea un programa que pida:
	 *  tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno y litros de consumo por 100kms. 
	 *  El programa mostrar� los kil�metros que quedan de autonom�a. Si quedan menos de 30 kil�metros mostrar� un aviso 
	 *  de que hay que repostar porque estamos usando la reserva.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		double autonomia = 0;
		double litros = 0;
	
		
		System.out.println("Por favor introduzca la capacidad en LITROS de su dep�sito.");
		double depositoLitros = teclado.nextDouble();
		
		System.out.println("Por favor introduzca (como N�MERO REAL) el porcentaje del dep�sito ocupada por combustible");
		double depositoPorcentaje = teclado.nextDouble();
		
		System.out.println("Por favor introduzca el consumo medio EN LITROS de combustible cada 100 Km");
		double consumoMedio = teclado.nextDouble();
		
		teclado.close();
		
		
		litros = depositoLitros * (depositoPorcentaje * 1/100);
		autonomia = (litros * 100) / consumoMedio;
		
		System.out.printf("La autonomia de su veh�culo es de: %.2f Kil�metros %n%n",  autonomia );
		
		
		if (autonomia < 30){
			System.out.println("------------AVISO DE REPOSTAJE------------");
			System.out.println("Su autonom�a es inferior a 30 Kil�metros");
		}
		
		
	}

}
