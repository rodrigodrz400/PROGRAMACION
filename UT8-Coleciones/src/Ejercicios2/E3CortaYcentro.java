package Ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E3CortaYcentro {
/*
 Crea una funci�n llamada corta que tome una lista y la modifique, eliminando el primer y �ltimo elemento.
  Despu�s escribe una funci�n llamada centro que, pasada una lista por par�metro, devuelva una nueva lista
   que contenga todos menos los elementos primero y �ltimo.
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		System.out.println(numeros);
		System.out.println(centro(numeros));

	}
	private static ArrayList centro(ArrayList numeros) {
		int longitudArray = numeros.size();

		ArrayList<Integer> copyNumeros = new ArrayList<Integer>();
		for (Iterator it = numeros.iterator(); it.hasNext();) {
			copyNumeros.add( (Integer) it.next());
		}
		copyNumeros.remove(0);longitudArray--;
		
		copyNumeros.remove(longitudArray-1);
		
		return copyNumeros;
	}
}
