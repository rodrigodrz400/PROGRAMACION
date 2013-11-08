package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3_d {

	public static void main(String[] args)

	{
		Scanner entrada = new Scanner(System.in);

		int base;
		int altura;
		int area;
		int x;
		int px1;
		int px2;
		int y;
		int py1;
		int py2;

		System.out
				.println("Escriba las cordenadas  \" X1 \" y \" X2 \" del rectángulo: ");
		px1 = entrada.nextInt();
		px2 = entrada.nextInt();

		x = px2 - px1;

		System.out
				.println("Escriba las cordenadas  \" Y1 \" y \" Y2 \" del rectángulo: ");
		py1 = entrada.nextInt();
		py2 = entrada.nextInt();

		y = py2 - py1;

		area = x * y;

		System.out.println();

		System.out.println("El área del rectangulo es " + area);

	}

}
