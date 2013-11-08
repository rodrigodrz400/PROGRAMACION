package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3_a {

	public static void main(String[] args)

	{

		Scanner entrada = new Scanner(System.in);

		int base;
		int altura;
		int area;
		int perimetro;

		System.out.println("Escriba la base del rectángulo: ");
		base = entrada.nextInt();

		System.out.println("Escriba la altura del rectángulo: ");
		altura = entrada.nextInt();

		area = base * altura;
		perimetro = 2 * altura + 2 * base;

		System.out.println();

		System.out.println("El área del rectangulo es " + area);
		System.out.println("El perímetro del rectangulo es " + perimetro);

	}

}
