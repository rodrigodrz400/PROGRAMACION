package Metodos;

import java.util.Scanner;

public class Redondeo {

	//La aplicaci�n pedir� n�meros reales, y mostrar� el n�mero y el redondeo (sin decimales).
	//y = Math.floor (x + 0.5);
	
	static double numero = 0;
	static double resultado = 0;
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		do{
			System.out.println("Introduzca un n�mero real: ");
			numero = teclado.nextDouble();
			if(numero == 0) break;
			System.out.println("�C�antos decimales desea incluir en el resultado?");
			
			System.out.println("El n�mero introducido es: " +numero + " y su n�mero redondeado es: " + redondeado(numero));
		}while(numero !=0);
		System.out.println("Fin del Programa!");
		
		
	}
	public static double redondeado(double numero){
		resultado =  Math.floor(numero + 0.5);
		return resultado;
	}
	
}
