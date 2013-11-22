package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOrdenarNumeros {

	//Leer 10 numeros e imprmirlos en orden inverso
	public static void main(String[] args) {

		int [] enteros; // int [] enteros = {1,2,3}
		
		enteros = new int [10];
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		
		for (int i=9; i>=0; i--){
			/*
			System.out.println("Introduzca un número: ");
			numero = teclado.nextInt();
			enteros [i]= numero;
			*/
			enteros [i]=teclado.nextInt();
			
		}
		System.out.println(Arrays.toString(enteros));
	
		for (int i=0; i<10; i++){
			System.out.print(" " + enteros [i]);
		}
		
		teclado.close();
	}
	

}
