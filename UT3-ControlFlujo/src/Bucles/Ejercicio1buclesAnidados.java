package Bucles;

import java.util.Scanner;

public class Ejercicio1buclesAnidados {

	//Escribe un programa que pida un n�mero con el fin de calcular el factorial de dicho n�mero. 
	//Hay que validar que el n�mero insertado sea positivo (incluido el 0). 
	//Si no es as�, se volver� a pedir dicho n�mero. Posteriormente, 
	//el programa le preguntar� al usuario si quiere insertar otro n�mero, con un mensaje como este: 
	//"�Quiere insetar otro n�mero [s/n]?". Debes validar tambi�n esta respuesta.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		
		
		do {
			System.out.println("Inserte un n�mero para calcular su factorial: ");
			numero = teclado.nextInt();
			int factorial = 1;
			
			if (numero >=0){
						for (int i=numero; i > 0 ; i--){
							factorial*= i;
							}System.out.println("Su factorial es: " + factorial);
						}else{
							System.out.println("El n�mero introducido, no es un n�mero positivo");
						}
			
		}while (numero >=0);
 
			
		
	teclado.close();
	}

}
