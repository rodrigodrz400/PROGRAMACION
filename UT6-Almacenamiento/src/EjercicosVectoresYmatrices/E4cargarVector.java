package EjercicosVectoresYmatrices;

import java.util.Arrays;
import java.util.Scanner;

public class E4cargarVector {

	/*
	 Ejercicio 4. Escribe un método que se encargue de crear y cargar un vector con números decimales
	  (con datos que se insertan por el teclado). El método devolverá dicho vector.
	 */
	
	public static int[] crearVector(int tamaño){
		Scanner teclado = new Scanner (System.in);
		
		int vector[] = new int[tamaño];
		
		System.out.println("Inserte los números que desea guardar en el vector.");
		for (int i=0; i<tamaño; i++){
		vector[i]= teclado.nextInt();
		}
		
		teclado.close();
		return vector;
	}
	public static void main(String[] args) {
		
		int vector[] = crearVector(5);
		
		
		 for (int i=0; i<vector.length; i++){
			System.out.println("Número: " + vector[i]);
		}
		
		
		System.out.println("Números: " + Arrays.toString(vector));
		

	}

}
