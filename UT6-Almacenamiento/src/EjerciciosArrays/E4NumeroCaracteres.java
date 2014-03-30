package EjerciciosArrays;

import java.util.Scanner;

public class E4NumeroCaracteres {
/*
 Ejerciccio 4 Realiza un programa que pida al usuario la introducci�n de un car�cter hasta que 
 este pulse el car�cter @. El programa debe mostrar las veces que se ha escrito cada car�cter.
  Recordad que los caracteres tienen asociado un n�mero (c�digo) que comienza por cero. 
  Ten en cuenta que se pueden hacer cosas como esta:

			int c;
			String qp="qp";
			c=qp.charAt(0);
			System.out.println(c);
			Este programa imprimir�a "113", el c�digo de q. Si quisiera imprimir un n�mero tambi�n puedo hacerlo as�:
			
			System.out.println((char)65);
			Utiliza arrays para hacer el ejercicio.
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		char[]caracteres;
		char []comprobar;
		String caracter ="";
		String cadena ="";
		String imprimir = ""; 
		int contador = 0;
		int c = 0;
		
		do{
		System.out.println("Introduzca caracteres para contar el n�mero de repetidos: ");
		caracter =  teclado.next();
		cadena += caracter;
		c++;	
		}while(!(caracter.equals("@")));
		
		caracteres = new char [c];
		comprobar = new char [c];
		
		for (int i = 0; i < cadena.length()-1; i++) {
			caracteres[i] = (char) cadena.charAt(i);
			comprobar[i] = (char) cadena.charAt(i);
		}
		
		
		System.out.println(imprimir);
	}

}
