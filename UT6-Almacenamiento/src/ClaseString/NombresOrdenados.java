package ClaseString;

import java.util.Arrays;
import java.util.Scanner;

public class NombresOrdenados {
	
	//Pedir un número de nombres, leerlos del teclado y mostrarlos por orden alfabético
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	boolean continuar = true;
	int contador = 0;
	System.out.println("Indique el número de nombres que desea insertar: ");
	int numNombres = teclado.nextInt();
	String [] nombres = new String [numNombres];
	teclado.nextLine();
	do{
		
		System.out.println("Introduzca un nombre: ");
		nombres[contador]=teclado.nextLine();
		contador++;
		if(contador >= numNombres) {
			continuar=false;
		}
	}while(continuar==true);
	
	Arrays.sort(nombres);
	System.out.println("Los nombres introducidos ordenados alfabéticamente son: " + Arrays.toString(nombres));

	}

}
