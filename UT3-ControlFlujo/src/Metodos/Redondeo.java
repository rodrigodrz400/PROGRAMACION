package Metodos;

import java.util.Scanner;

public class Redondeo {

	//La aplicación pedirá números reales, y mostrará el número y el redondeo (sin decimales).
	//y = Math.floor (x + 0.5);
	
	static double numero = 0;
	static double resultado = 0;
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		do{
			System.out.println("Introduzca un número real: ");
			numero = teclado.nextDouble();
			if(numero == 0) break;
			System.out.println("¿Cúantos decimales desea incluir en el resultado?");
			
			System.out.println("El número introducido es: " +numero + " y su número redondeado es: " + redondeado(numero));
		}while(numero !=0);
		System.out.println("Fin del Programa!");
		
		
	}
	public static double redondeado(double numero){
		resultado =  Math.floor(numero + 0.5);
		return resultado;
	}
	
}
