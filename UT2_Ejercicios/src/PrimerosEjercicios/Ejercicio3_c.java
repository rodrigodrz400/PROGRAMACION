package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3_c {

	public static void main(String[] args)

	{

		Scanner entrada = new Scanner(System.in);

		double radio;
		double volumen;

		System.out.println("Escriba el radio de la esfera: ");
		radio = entrada.nextInt();

		volumen = 4 / 3 * 3.1416 * radio * radio * radio;

		System.out.println();

		System.out.println("El volumen de la esfera es " + volumen);

	}

}
