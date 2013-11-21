package Bucles;

import java.util.Scanner;

public class Ejercicio1buclesAnidados {

	//Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
	//Hay que validar que el número insertado sea positivo (incluido el 0). 
	//Si no es así, se volverá a pedir dicho número. Posteriormente, 
	//el programa le preguntará al usuario si quiere insertar otro número, con un mensaje como este: 
	//"¿Quiere insetar otro número [s/n]?". Debes validar también esta respuesta.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		
		
		do {
			System.out.println("Inserte un número para calcular su factorial: ");
			numero = teclado.nextInt();
			int factorial = 1;
			
			if (numero >=0){
						for (int i=numero; i > 0 ; i--){
							factorial*= i;
							}System.out.println("Su factorial es: " + factorial);
						}else{
							System.out.println("El número introducido, no es un número positivo");
						}
			
		}while (numero >=0);
 
			
		
	teclado.close();
	}

}
