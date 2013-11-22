package Bucles;

import java.util.Scanner;

public class Ejercicio1buclesAnidados {

	//Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
	//Hay que validar que el número insertado sea positivo (incluido el 0). 
	//Si no es así, se volverá a pedir dicho número. Posteriormente, 
	//el programa le preguntará al usuario si quiere insertar otro número, con un mensaje como este: 
	//"¿Quiere insetar otro número [s/n]?". Debes validar también esta respuesta.
	public static void main(String[] args) {
		
		int numero = 0;
		String respuesta;
		long factorial = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cálculo de factoriales");
		do{
			
				do{
					
					//Pedir número
					System.out.println("Dame un número positivo: ");
					numero = teclado.nextInt();
				}while (numero < 0);
				
				//Calcular el factorial del numero
				factorial =1;
				if (numero!=0){
					for (int i= 1; i<=numero; i++)
						factorial = factorial * i;
					}
				System.out.println("El factorial de " + numero + " es "+ factorial);
				do{
					System.out.println("¿Quiere insetar otro número [s/n]?");
					respuesta = teclado.next();
					}while (!respuesta.equals("s") && !respuesta.equals("n"));
			
			
		}while (respuesta.equals ("s"));
			
	teclado.close();
	}

}
