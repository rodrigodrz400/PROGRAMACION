package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3_b {

	public static void main(String[] args)

	{

		Scanner entrada = new Scanner(System.in);

		double radio;
		double area;
		double perimetro;

		/*
		 * double PI;
		 * 
		 * PI= 3.141592654;
		 */

		System.out.println("Escriba el radio de la circunferencia: ");
		radio = entrada.nextInt();

		/*
		 * area= 3.1416 * (radio^2);
		 */

		area = 3.1416 * radio * radio;
		perimetro = 2 * 3.1416 * radio;

		System.out.println();

		System.out.println("El área del círculo es " + area);
		System.out.println("El perímetro del círculo es " + perimetro);

	}

}
