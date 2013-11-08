package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args)

	{

		Scanner entrada = new Scanner(System.in);

		double kilogramos;
		double onzas;

		System.out
				.println("Escriba el peso en Kilogramos que quiere convertir a Onzas: ");
		kilogramos = entrada.nextInt();

		onzas = kilogramos * 35.2739619;

		System.out.println();

		System.out.println("El peso en Onzas es: \n" + onzas + " onzas.");

	}

}
