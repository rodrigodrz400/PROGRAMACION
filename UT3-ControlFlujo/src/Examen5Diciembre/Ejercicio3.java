package Examen5Diciembre;

import java.util.Scanner;

import Graficos.Librerias.Graficos.*;


public class Ejercicio3 {

	public static void main(String[] args) {
		Rectangle cuadrado;
		boolean repetir = true;
		double tamaño;
		int rojo;
		int verde;
		int azul;

		Scanner teclado = new Scanner(System.in);

		// Pedir tamaño de lado de un cuadrado y dibujar

		do {
			System.out.println("Indique el tamaño de un cuadrado");
			tamaño = teclado.nextDouble();

			cuadrado = new Rectangle(0, 0, tamaño, tamaño);

			if (tamaño > 100 && tamaño < 200) {
				cuadrado.draw();
				break;
			}

		} while (repetir = true);

		do{
			System.out
			.println("Inserte otros tres valores correspondientes a los colores Rojo, Verde y Azul:");
	System.out.println("Valor del color Rojo");
	rojo = teclado.nextInt();
	System.out.println("Valor del color Verde");
	verde = teclado.nextInt();
	System.out.println("Valor del color Azul");
	azul = teclado.nextInt();

	
		}while ((rojo > 255 || rojo < 0) || (verde > 250 || verde < 0)
				|| (azul > 255 || azul < 0));
		
		Color colorCuadrado = new Color(rojo, verde, azul);
			cuadrado.setColor(colorCuadrado);
			cuadrado.fill();
		}

	}


