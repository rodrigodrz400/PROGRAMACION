package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3_e {

	public static void main(String[] args)

	{

		Scanner entrada = new Scanner(System.in);

		double cateto1;
		double cateto2;
		double hipotenusa;

		System.out
				.println("Escriba uno de los catetos del triángulo rectángulo: ");
		cateto1 = entrada.nextInt();

		System.out.println("Escriba el otro cateto: ");
		cateto2 = entrada.nextInt();

		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.println();

		System.out.println("La hipotenusa del triángulo es " + hipotenusa);

	}

}
