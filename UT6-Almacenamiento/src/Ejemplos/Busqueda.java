package Ejemplos;

import java.util.Arrays;

public class Busqueda {

	public static void main(String[] args) {
		
		int[] numeros={3,6,3,76,89,5,2};
		int[] ordenado;
		
		System.out.println(Arrays.toString(numeros));
		ordenado=Arrays.copyOf(numeros, numeros.length);
		
		Arrays.sort(numeros);//ordena de menor a mayor
		System.out.println(Arrays.toString(numeros));

		if (Arrays.binarySearch(ordenado, 76) >=0) System.out.println("76 está.");//si no lo encuentra devuelve un -1
		
		
	}

}
