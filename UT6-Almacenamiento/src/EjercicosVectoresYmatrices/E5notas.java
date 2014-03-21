package EjercicosVectoresYmatrices;

import java.util.Arrays;
import java.util.Scanner;

public class E5notas {
	/*
	 Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe visualizar cu�l es la nota
	  m�s alta, luego la siguiente, y as� sucesivamente. Si hay alguna nota repetida, se visualizar� 
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
		
		int tama�oInicial = 8;
		int tama�oFinal = tama�oInicial;
		int vector[] = new int[tama�oInicial];
		
		System.out.println("Inserte las notas que desea ordenar (desc).");
		for (int i=0; i<tama�oInicial; i++){
		vector[i]= teclado.nextInt();
		}
		
		teclado.close();

		ordenarArray(vector);
		for (int i=0; i<tama�oInicial; i++){
			if (vector[i]==0){
				tama�oFinal--;
			}
		}
		int vectorSalida[] = new int [tama�oFinal];
		for (int i=0; i<tama�oFinal; i++){
			vectorSalida[i]=vector[i];
		}
		
		System.out.println("Vector orenado de mayor a menor: " + Arrays.toString(vectorSalida));
		
		
	}

}
