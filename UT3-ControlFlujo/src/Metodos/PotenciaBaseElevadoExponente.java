package Metodos;

import java.util.Scanner;

public class PotenciaBaseElevadoExponente {

	/*
	 Excriba un método llamado enteroPotencia(base,exponente) que devuelva el valor base^exponente
	 */
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero como base de la potencia: ");
		int base = teclado.nextInt();
		System.out.println("Introduzca el exponente al que deseca elevar la potencia: ");
		int exponente = teclado.nextInt();
		
		System.out.println("El resultado de la operación " + base + " elevado a " +
				exponente + " es igual a: "+ enteroPotencia(base, exponente) );
		
		teclado.close();
	}

	public static int enteroPotencia(int base, int exponente){
	
	int	resultado = base;
	for (int i=0; i<exponente-1; i++){
		resultado= base*resultado;
	}	
	return resultado;
	}
}
