package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1 {

	
	//Crea un programa que tiene un numero oculto (del 1 al 10). 
	//El programa pregunta el n�mero al jugador, si la adivina muestra un mensaje de �xito. 
	//Si no, muestra el error.
	public static void main(String[] args) {
		
		int numeroOculto = 0;
		numeroOculto = (int) ((Math.random()*10)+1);
		
		
		Scanner teclado = new Scanner(System.in);
		
		 
		
		System.out.println("----ADIVINA EL N�MERO OCULTO----");
		System.out.println("Escriba un n�mero del 1 al 10");
		int numeroEntero = teclado.nextInt();
			
		
		if (numeroOculto == numeroEntero){
			System.out.println("!ENORABUENA!, ha descubierto el n�mero oculto " + "(el n�mero oculto era: " + numeroOculto +  ")");
		}else{
			System.out.println("No ha conseguido adivinar el n�mero oculto, siga intentandolo " +" "
					+ "(el n�mero oculto era: " + numeroOculto + ")");
		}
		
		
		

		
	}

}
