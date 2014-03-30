package EjerciciosArrays;

import java.util.Scanner;

public class E4NumeroCaracteres {
/*
 Ejerciccio 4 Realiza un programa que pida al usuario la introducción de un carácter hasta que 
 este pulse el carácter @. El programa debe mostrar las veces que se ha escrito cada carácter.
  Recordad que los caracteres tienen asociado un número (código) que comienza por cero. 
  Ten en cuenta que se pueden hacer cosas como esta:

			int c;
			String qp="qp";
			c=qp.charAt(0);
			System.out.println(c);
			Este programa imprimiría "113", el código de q. Si quisiera imprimir un número también puedo hacerlo así:
			
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
		System.out.println("Introduzca caracteres para contar el número de repetidos: ");
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
