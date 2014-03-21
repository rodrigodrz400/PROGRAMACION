package EjercicosVectoresYmatrices;

import java.util.Arrays;
import java.util.Scanner;

public class E4cargarVector {

	/*
	 Ejercicio 4. Escribe un m�todo que se encargue de crear y cargar un vector con n�meros decimales
	  (con datos que se insertan por el teclado). El m�todo devolver� dicho vector.
	 */
	
	public static int[] crearVector(int tama�o){
		Scanner teclado = new Scanner (System.in);
		
		int vector[] = new int[tama�o];
		
		System.out.println("Inserte los n�meros que desea guardar en el vector.");
		for (int i=0; i<tama�o; i++){
		vector[i]= teclado.nextInt();
		}
		
		teclado.close();
		return vector;
	}
	public static void main(String[] args) {
		
		int vector[] = crearVector(5);
		
		
		 for (int i=0; i<vector.length; i++){
			System.out.println("N�mero: " + vector[i]);
		}
		
		
		System.out.println("N�meros: " + Arrays.toString(vector));
		

	}

}
