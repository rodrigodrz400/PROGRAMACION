package EjerciciosCondicionales;

import java.util.Scanner;



public class Ejercicio5 {

	
	//Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100), 
	//salvo que este último sea divisible por 400 http://es.wikipedia.org/wiki/Año_bisiesto.
	//Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CONOZCA SI EL AÑO ES BISIESTO");
		System.out.println("Por favor, escriba un año");
		int añoIntroducido = teclado.nextInt();
	
		
		if (añoIntroducido % 4 ==0){
			System.out.println("El año " + añoIntroducido + ", ES un año bisiesto");
			
		}else if (añoIntroducido %100 !=0){
			System.out.println("El año " + añoIntroducido + ", NO un año bisiesto");
			
		}else if (añoIntroducido %4 == 0){
			System.out.println("El año " + añoIntroducido + ", ES un año bisiesto");
		}
		
		teclado.close();
		
	}

}
