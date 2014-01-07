package Prueba131129.src;

import java.util.Scanner;


public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int positivos = 0;
		int negativos = 0;
		int total = 0;
		int numeros;
		
		System.out.print("Números a leer: ");
		numeros = input.nextInt();
		
		System.out.println("Escribe " + numeros + " números:");
		for(int i = 0; i<numeros;i++){
			num = input.nextInt();
			if(num>0)
				positivos++;
			else if (num<0)
				negativos++;
			total+=num;
		}
		
		input.close();
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.printf("Media: %.2f", (float)total/numeros);
	}

}
