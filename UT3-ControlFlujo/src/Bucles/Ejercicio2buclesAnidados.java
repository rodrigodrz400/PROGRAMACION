package Bucles;

import java.util.Scanner;

public class Ejercicio2buclesAnidados {
	
	//Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo n�meros 
	//y se vayan imprimiendo las tablas correspondientes. El programa termina cuando se introduce un n�mero 
	//no est� entre 1 y 10.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		
		do {
			
			System.out.println("Introduczca el n�mero correspondiente a la tabla que desee imprimir");
			numero = teclado.nextInt();
			
				if (numero > 1 && numero <10){
					
				
					int linea;
					
					System.out.println("Tabla del " + numero+ ":");
					
					
					for (linea=0; linea<=10;linea++){
						System.out.println( numero +
								" x " + linea + " = " + (numero*linea));
						}
				}else{
						System.out.println("FIN DEL PROGRAMA, el n�mero introducido no "
								+ "corresponde a ning�n valor entre 1 y 10");
					}
				
			}while (numero > 1 && numero <10);
		
		
		
		
		
		teclado.close();
		
	}

}
