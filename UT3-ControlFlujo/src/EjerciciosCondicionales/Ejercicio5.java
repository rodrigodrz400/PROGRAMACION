package EjerciciosCondicionales;

import java.util.Scanner;



public class Ejercicio5 {

	
	//Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo (aquel divisible por 100), 
	//salvo que este �ltimo sea divisible por 400 http://es.wikipedia.org/wiki/A�o_bisiesto.
	//Haz un programa que pida un a�o y muestre un mensaje de si es o no bisiesto.
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CONOZCA SI EL A�O ES BISIESTO");
		System.out.println("Por favor, escriba un a�o");
		int a�oIntroducido = teclado.nextInt();
	
		
		if (a�oIntroducido % 4 ==0){
			System.out.println("El a�o " + a�oIntroducido + ", ES un a�o bisiesto");
			
		}else if (a�oIntroducido %100 !=0){
			System.out.println("El a�o " + a�oIntroducido + ", NO un a�o bisiesto");
			
		}else if (a�oIntroducido %4 == 0){
			System.out.println("El a�o " + a�oIntroducido + ", ES un a�o bisiesto");
		}
		
		teclado.close();
		
	}

}
