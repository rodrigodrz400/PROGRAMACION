package Bucles;

import java.util.Scanner;

public class Ejercicio1buclesAnidados {

	//Escribe un programa que pida un n�mero con el fin de calcular el factorial de dicho n�mero. 
	//Hay que validar que el n�mero insertado sea positivo (incluido el 0). 
	//Si no es as�, se volver� a pedir dicho n�mero. Posteriormente, 
	//el programa le preguntar� al usuario si quiere insertar otro n�mero, con un mensaje como este: 
	//"�Quiere insetar otro n�mero [s/n]?". Debes validar tambi�n esta respuesta.
	public static void main(String[] args) {
		
		int numero = 0;
		String respuesta;
		long factorial = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("C�lculo de factoriales");
		do{
			
				do{
					
					//Pedir n�mero
					System.out.println("Dame un n�mero positivo: ");
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
					System.out.println("�Quiere insetar otro n�mero [s/n]?");
					respuesta = teclado.next();
					}while (!respuesta.equals("s") && !respuesta.equals("n"));
			
			
		}while (respuesta.equals ("s"));
			
	teclado.close();
	}

}
