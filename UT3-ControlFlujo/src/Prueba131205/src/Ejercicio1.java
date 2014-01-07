package Prueba131205.src;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tamaño;

		System.out.print("Dame el tamaño de las figuras: ");
		tamaño = input.nextInt();

		System.out.println("Figura 1");
		for (int i = 0; i < tamaño; i++) {
			for (int j = tamaño; j > i; j--)
				System.out.print("@");
			System.out.println();
		}

		System.out.println("Figura 2");
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = tamaño; j > i; j--)
				System.out.print("@");
			System.out.println();
		}

		System.out.println("Figura 3");
		for (int i = 0; i < tamaño; i++) {
			for (int j = tamaño; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("@ ");
			System.out.println();
		}
	}

}
