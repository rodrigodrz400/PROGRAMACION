package EjerjciciosInicial;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		//Leer temperatura fahrenheit
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dime la temperatura (�F):");
		double temperatura = teclado.nextDouble();
		
		//Pasar a �C
		temperatura = (temperatura-32)/1.8;
		
		//Si t�<0
		if (temperatura <= 0){	
			System.out.println("Temperatura: " + (int)temperatura + "�C");
			System.out.println("AVISO: temperatura de congelaci�n.");
		}else{
			System.out.println("No hay riesgo de congelaci�n");
		}
		
		
	}

}
