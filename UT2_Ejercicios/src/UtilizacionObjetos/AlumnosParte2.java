package UtilizacionObjetos;

import java.util.Scanner;

public class AlumnosParte2 {

	public static void main(String[] args) {

		String alumno1;
		String alumno2;
		String alumno3;

		int edad1;
		int edad2;
		int edad3;
		
		double media;

		
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
		System.out.println("Primer alumno:");
		edad1 = teclado.nextInt(); 
		System.out.println("Segundo alumno:");
		edad2 = teclado.nextInt(); 
		System.out.println("Tercer alumno:");
		edad3 = teclado.nextInt(); 
		System.out.println();
		
		System.out.println("Los alumnos son:");
		System.out.println(alumno1 + " " + edad1 + " años");
		System.out.println(alumno2 + " " + edad2 + " años");
		System.out.println(alumno3 + " " + edad3 + " años");
		System.out.println();
		
		System.out.println("La media de edad de los alumnos es:");
		media= (double) (edad1+edad2+edad3)/3;
		System.out.printf( "%.2f%s", (media), " años");
		//System.out.println( Math.rint(media*100)/100 + " años");

		teclado.close();
	}

}
