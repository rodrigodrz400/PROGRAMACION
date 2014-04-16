package Examen2evalCasa;

import java.util.Arrays;

public class NumerosRepetidos {

	public static int[] quitarRepetidos(int[] vector){
	
		int aux[]=Arrays.copyOf(vector, vector.length);
		int aux2[]=Arrays.copyOf(aux, aux.length);
		Arrays.fill(aux2, 0);
	
		int contador=0;
		
		for(int i=0; i<aux.length-1;i++){
			for(int j=i+1; j<aux.length;j++){
				if(aux[i]==aux[j]){
					aux2[contador]=aux[j];
					contador++;
				}
			}
		}
		Arrays.sort(aux2);
		Arrays.fill(aux, 0);
		contador=0;
		for(int i=0; i<aux2.length-1;i++){
				if(aux2[i]!=aux2[i+1] && aux2[i]!=0){
					aux[contador]=aux2[i];
					contador++;
				}
		}
		aux[contador]=aux2[aux2.length-1];
		contador++;
		
		int vectorSalida[]=Arrays.copyOf(aux, contador);
		
		return vectorSalida;
	}
	public static void main(String[] args) {
		int [] entrada = {1,2,3,4,5,2,7,3,2,2,2,7,1,0,0,25,35,25};
		
		int [] salida = quitarRepetidos(entrada);
		
		System.out.println("Vector Entrada: "+Arrays.toString(entrada));
		
		System.out.println("Vector Salida: "+Arrays.toString(salida));

	}

}
