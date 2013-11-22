package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysVisualizar5frases {

	////Escribe un programa que pida cinco frases y las visualice.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Escriba 5 frases: ");
		
		String [] frases;
		frases = new String [5];
		
		for (int i = 0; i < 5 ; i++){		
			String frase=teclado.nextLine();
			frases [i] = frase;
			
		}
		System.out.println(Arrays.toString(frases));
		
		for (int i=0; i < 5; i++){
			System.out.print(" " + frases [i]);
		}
		
	teclado.close();	
	}

}
