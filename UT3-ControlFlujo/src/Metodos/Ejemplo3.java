package Metodos;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número máximo: ");
		int max = teclado.nextInt();
		System.out.println("Introduzca un número mínimo: ");
		int min = teclado.nextInt();
		
		for (int i=0; i<10; i++){
			System.out.print(Devolveraleatorio (max, min)+ "\t");
		}
		
		teclado.close();
		 
		/*	
		int min, max;
		
		min= 10;
		max = 100;
		
		for (int i=0; i<10000;i++){
			int x = aleatorio (min, max);
			if (x<min || x>max)
				System.out.println();
		}
		
		*/
	}
	public static int Devolveraleatorio (int max, int min){
		 
		int aleatorio = (int)(Math.random()*((max-min)+1))+min;
		return aleatorio;
	}

}
