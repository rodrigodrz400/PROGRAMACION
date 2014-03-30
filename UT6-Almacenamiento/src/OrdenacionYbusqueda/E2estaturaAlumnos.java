package OrdenacionYbusqueda;

import java.util.Arrays;
import java.util.Scanner;

public class E2estaturaAlumnos {

	/*
	 Ejercicio 2. 
	  Escribe un programa que pida la estatura de una serie de alumnos, 
	  de tantos como indique el usuario del programa. Posteriormente, el programa ordenará
	  dichos datos de forma ascendente. Una vez ordenados, el programa visualizará los 
	  datos en el orden que se insertaron y ordenados de forma ascendente.
	 */
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numAlum = 0;
		int contador=1;
		
		System.out.println("Introduzca el número de alumnos que desea anotar su estatura: ");
		numAlum=teclado.nextInt();
		
		double alumnos[] = new double[numAlum];
		
		for (int i=0; i<alumnos.length;i++){
		System.out.println("Introduzca la estatura del " + contador + "º alumno");
		alumnos[i]=teclado.nextDouble();
		contador++;
		}
		
		Arrays.sort(alumnos);
		
		System.out.println("Las estaturas de los alumnos en orden ascendente son:");
		for(int i=0; i<alumnos.length; i++){
			System.out.print(alumnos[i] + "\t");
		}
		
	}

}
