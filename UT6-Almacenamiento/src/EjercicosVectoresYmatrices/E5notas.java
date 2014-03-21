package EjercicosVectoresYmatrices;

import java.util.Arrays;
import java.util.Scanner;

public class E5notas {
	/*
	 Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe visualizar cuál es la nota
	  más alta, luego la siguiente, y así sucesivamente. Si hay alguna nota repetida, se visualizará 
	  solo una vez.
	 */
	public static int[] ordenarArray(int[] vector) {
	    int aux;
	 
	    for (int anterior = 0; anterior < vector.length - 1; anterior++) {
	        for (int posterior = anterior + 1; posterior < vector.length; posterior++) {
	            if (vector[anterior] < vector[posterior]) {
	            	aux = vector[anterior];
	                vector[anterior] = vector[posterior];
	                vector[posterior] = aux;
	            }
	            if(vector[anterior] == vector[posterior]){
	                vector[posterior] = 0;
	            }
	        }
	    }
	 
	    return vector;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int tamañoInicial = 8;
		int tamañoFinal = tamañoInicial;
		int vector[] = new int[tamañoInicial];
		
		System.out.println("Inserte las notas que desea ordenar (desc).");
		for (int i=0; i<tamañoInicial; i++){
		vector[i]= teclado.nextInt();
		}
		
		teclado.close();

		ordenarArray(vector);
		for (int i=0; i<tamañoInicial; i++){
			if (vector[i]==0){
				tamañoFinal--;
			}
		}
		int vectorSalida[] = new int [tamañoFinal];
		for (int i=0; i<tamañoFinal; i++){
			vectorSalida[i]=vector[i];
		}
		
		System.out.println("Vector orenado de mayor a menor: " + Arrays.toString(vectorSalida));
		
		
	}

}
