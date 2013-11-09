package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1 {

	
	//Crea un programa que tiene un numero oculto (del 1 al 10). 
	//El programa pregunta el número al jugador, si la adivina muestra un mensaje de éxito. 
	//Si no, muestra el error.
	public static void main(String[] args) {
		
		int numeroOculto = 0;
		numeroOculto = (int) ((Math.random()*10)+1);
		
		
		Scanner teclado = new Scanner(System.in);
		
		 
		
		System.out.println("----ADIVINA EL NÚMERO OCULTO----");
		System.out.println("Escriba un número del 1 al 10");
		int numeroEntero = teclado.nextInt();
			
		
		if (numeroOculto == numeroEntero){
			System.out.println("!ENORABUENA!, ha descubierto el número oculto " + "(el número oculto era: " + numeroOculto +  ")");
		}else{
			System.out.println("No ha conseguido adivinar el número oculto, siga intentandolo " +" "
					+ "(el número oculto era: " + numeroOculto + ")");
		}
		
		
		

		
	}

}
