package Bucles;

public class Ejercicio2for {

	//Visualizar los 15 primeros números naturales del 15 al 1. 
	//Primero utilizar una estructura while, luego una for.
	public static void main(String[] args) {

		int numero = 16;
		
		System.out.println("Con estructura \"While\"");
		while (numero > 1){
			numero--;
			System.out.println(numero);
		}
		
		System.out.println();
		
		System.out.println("Con estructura \"For\"");
		for (numero = 15; numero >= 1; numero--){
			System.out.println(numero);
		}
		
		
	}

}
