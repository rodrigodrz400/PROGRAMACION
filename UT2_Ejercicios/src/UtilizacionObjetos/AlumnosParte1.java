package UtilizacionObjetos;

import java.util.Scanner;

public class AlumnosParte1 {

	public static void main(String[] args) {

		String alumno1;
		String alumno2;
		String alumno3;

		int edad;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre de tres alumnos:");
		System.out.println("Primer alumno:");
		alumno1 = teclado.next();
		System.out.println("Segundo alumno");
		alumno2 = teclado.next();
		System.out.println("Tercer alumno");
		alumno3 = teclado.next();
		System.out.println();

		System.out.println("Introduzca la edad de los alumnos:");
		edad = teclado.nextInt();
		System.out.println();
		
		System.out.println("Los alumnos son:");
		System.out.println(alumno1 + " " + edad + " años");
		System.out.println(alumno2 + " " + edad + " años");
		System.out.println(alumno3 + " " + edad + " años");

		teclado.close();
	}

}
