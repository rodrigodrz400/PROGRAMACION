package Metodos;

import java.util.Scanner;

public class CalculoHipotenusa {

	//Defina un m�todo llamado hipotenusa que calcule la longitud de la hipotenusa de un tri�ngulo rect�ngulo, cuando
	//se proporcionen las longitudes de los otros dos lados. El m�todo debe tomar dos argumentos de tipo double y 
	//devolver la hipotenusa como un valor double. Incorpore este m�todo en una aplicaci�n que lea los valores para 
	//lado1 y lado 2, y que realice el c�lculo con el m�todo hipotenusa. Use los m�todos porw y sqrt de Math
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el primero de los lados: ");
		double lado1 = teclado.nextInt();
		System.out.println("Introduzca el segundo de los lados: ");
		double lado2 = teclado.nextInt();
		
		System.out.println("La longitud resultante de la hipotenusa es: " + hipotenusa(lado1,lado2) );
		
		teclado.close();
		
	}
	public static double hipotenusa (double lado1, double lado2){
		double resultado = 0;
		resultado = Math.sqrt(( Math.pow(lado1,2) + Math.pow(lado2, 2)));
		return resultado;
	}
}
