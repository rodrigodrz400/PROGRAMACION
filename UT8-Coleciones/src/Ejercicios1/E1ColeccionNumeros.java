package Ejercicios1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

//1. Crea una colección, de tipo ArrayList que carge 10 números por teclado. Después recorrerá la colección y 
//devolverá la cantidad de números positivos, cero y negativos.
public class E1ColeccionNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int positivos=0;
		int cero=0;
		int negativos=0;
		
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Introduzca 10 números enteros");
		for (int i = 0; i < 10; i++) {
			numeros.add(teclado.nextInt());
		}
		
		for( int i = 0 ; i < numeros.size() ; i++ ){
			  if ( numeros.get( i ) > 0){
				  positivos++;
			  }else if( numeros.get( i ) < 0)  {
				  negativos++;
			  }else
			   cero++;
			}
		
		System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos + "\nCero: " + cero);
		
		teclado.close();
	}

}
