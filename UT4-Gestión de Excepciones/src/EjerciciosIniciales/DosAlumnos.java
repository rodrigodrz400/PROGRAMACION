package EjerciciosIniciales;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DosAlumnos {

	/*
	 * Escribe un programa que pida los datos de dos alumnos. De dichos alumnos
	 * nos interesa nombre, edad y altura. Visualiza los datos de dichos alumnos
	 * diciendo cual es el mayor (o si tienen la misma edad). Si se produjese un
	 * error IOException, se mostrará un mensaje y se terminará el programa.
	 * Puedes usar System.exit(-1); Si el usuario introduce un valor erróneo
	 * (InputMismatchException) volverá a pedir el dato correspondiente.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nombre1 = "";
		int edad1 = 0;
		double altura1;

		String nombre2 = "";
		int edad2 = 0;
		double altura2;

		boolean continuarCiclo = true;

		System.out.println("--DATOS ALUMNO Nº 1--");
		do {
			try {
				System.out.println("Introduzca su nombre: ");
				nombre1 = teclado.nextLine();
				continuarCiclo=false;
			} catch (IllegalStateException  | NoSuchElementException e) {
				System.err.println("Error: " + e.getMessage());
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		do {
			try {
				System.out.println("Introduzca su edad: ");
				edad1 = teclado.nextInt();
				continuarCiclo=false;
			} catch (InputMismatchException  e) {
				System.err.println("Error: El número introducido no es un número entero. ");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		do {
			try {
				System.out.println("Introduzca su altura: ");
				altura1 = teclado.nextDouble();
				continuarCiclo = false;
			} catch (InputMismatchException e) {
				System.err.println("Error: El número introducido no es un un número real ");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		
		
		System.out.println("--DATOS ALUMNO Nº 2--");
		do {
			try {
				System.out.println("Introduzca su nombre: ");
				nombre2 = teclado.nextLine();
				continuarCiclo=false;
			} catch (IllegalStateException  | NoSuchElementException e) {
				System.err.println("Error: " + e.getMessage());
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		do {
			try {
				System.out.println("Introduzca su edad: ");
				edad2 = teclado.nextInt();
				continuarCiclo=false;
			} catch (InputMismatchException e) {
				System.err.println("Error: El número introducido no es un número entero. ");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		do {
			try {
				System.out.println("Introduzca su altura: ");
				altura2 = teclado.nextDouble();
				teclado.nextLine();
				continuarCiclo = false;
			} catch (InputMismatchException e) {
				System.err.println("Error: El número introducido no es un un número real ");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);

		if (edad1 > edad2) {
			System.out.println(nombre1 + " es " + (edad1 - edad2)
					+ " años mayor que " + nombre2 + ".");
		} else if (edad2 > edad1) {
			System.out.println(nombre2 + " es " + (edad2 - edad1)
					+ " años mayor que " + nombre1 + ".");
		}

		if (edad1 == edad2) {
			System.out.println(nombre1 + " y " + nombre2
					+ " tienen la misma edad.");
		}

		teclado.close();
	}
}
