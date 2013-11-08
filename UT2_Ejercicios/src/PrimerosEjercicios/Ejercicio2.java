package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		int suma;
		int producto;
		int media;

		System.out.println("Escriba el primer número entero: ");
		numero1 = entrada.nextInt();

		System.out.println("Escriba el segundo número entero: ");
		numero2 = entrada.nextInt();

		suma = numero1 + numero2;
		producto = numero1 * numero2;
		media = (numero1 + numero2) / 2;

		System.out.println();

		System.out.println("La suma es " + suma);
		System.out.println("El producto es " + producto);
		System.out.println("La media es " + media);

	}

}
