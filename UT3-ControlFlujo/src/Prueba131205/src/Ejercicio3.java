package Prueba131205.src;

import Graficos.Librerias.Graficos.*;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lado;

		do {
			System.out.print("Dame el lado del cuadrado ([100,200]): ");
			lado = input.nextInt();
		} while (!(lado >= 100 && lado <= 200));

		Rectangle cuadrado;

		cuadrado = new Rectangle(20, 20, lado, lado);
		cuadrado.fill();

		// Pide valores de color
		int r, g, b;
		do {
			System.out.print("Dame los valores del color (R,G,B): ");
			r = input.nextInt();
			g = input.nextInt();
			b = input.nextInt();
		} while (!(r >= 0 && r <= 255) || !(g >= 0 && g <= 255)
				|| !(b >= 0 && b <= 255));

		cuadrado.setColor(new Color(r, g, b));
		cuadrado.fill();

	}

}
