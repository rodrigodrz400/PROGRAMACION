package EjerciciosPracticas;

import java.util.Scanner;

public class DatosEmpleados {

	// Escribe un programa que pida los datos de empleados, en concreto su
	// nombre y sueldo.
	// Realizará una pregunta tipo "¿Otro [s/n]?" para saber cuando parar.
	// El programa calculará la media del sueldo y mostrará el nombre de los
	// empleados que cobran
	// por encima de la media.
	public static void main(String[] args) {

		// Pedir datos (nombre y sueldo)
		Scanner teclado = new Scanner(System.in);

		double sueldo = 0;
		double media = 0;
		String respuesta;
		int acumulador = 0;
		double sumaSueldo = 0;
		int i = 0;

		String[] empleados = new String[40];
		double[] sueldos = new double[40];

		do {

			System.out.println("Introduzca su nombre: ");
			empleados[i] = teclado.next();
			System.out.println("Introduzca su sueldo: ");
			sueldos[i] = teclado.nextDouble();
			sueldo = sueldos[i];
			sumaSueldo = sumaSueldo + sueldo;
			acumulador++;
			i++;

			// Preguntar "¿Otro [s/n]?"
			do {
				System.out
						.println("¿Desea introducir los datos de otro empleado? [s/n] ");
				respuesta = teclado.next();
			} while (!respuesta.equals("s") && !respuesta.equals("n"));

		} while (respuesta.equals("s"));
		// Calcular media
		media = sumaSueldo / acumulador;
		System.out
				.printf("El importe medio de sueldo de los empleados introducidos es: %.2f € \n",
						media);
		// Mostrar nombre y quien cobra por encima de la media
		System.out
				.println("Los empleados que cobran por encima de la media son: ");

		for (int j = 0; j < 40; j++)
			if (sueldos[j] > media) {
				System.out.print(empleados[j] + ",\t ");
			}

		teclado.close();
	}

}
