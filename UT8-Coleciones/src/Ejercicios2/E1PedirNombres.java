package Ejercicios2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import ejerciciosHerencia2.DeseaContinuar;
import ejerciciosHerencia2.SmartPhone;
import ejerciciosHerencia2.TecnologiaRepetidaException;
import Ejercicios2.PreguntaContinuar;

public class E1PedirNombres {
/*
 Crear un programa que pida una serie de nombres. Después de cada nombre deberá preguntarse si quiere 
 o no insertar otro nombre. Finalmente se imprimirán los nombres en el mismo orden en el que se 
 introdujeron y también en oden inverso. Nota: prueba a realizarlo usando ListIterator, que tiene 
 los métodos hasPrevious() y previous().
 */
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nombre;
	
	LinkedList<String> nombres = new  LinkedList();
	

	System.out.println("Introduzca una serie de nombres:");

	do{
		nombre=teclado.nextLine();
		nombres.add(nombre);
	}while(DeseaContinuar.deseaContinuar("¿Quiere insertar otro nombre [s/n]? ", 
			"Debe introducir uno de estos dos caracteres [s] o [n] para continuar."));
	
	ListIterator<String> iter = nombres.listIterator();//se crea un iterador sobre una lista que ya no va a cambiar IMPORTANTE
	
	System.out.println("\nLISTA de nombres en orden de inserción: ");

	    while (iter.hasNext())
	    {
	          System.out.print(iter.next() + ", ");
	    }
	    System.out.println();

	System.out.println("\nLISTA de nombres orden inverso: ");
	    while (iter.hasPrevious())
	    {
	          System.out.print(iter.previous() + ", ");
	    }
	    System.out.println();		
				

	teclado.close();
	
	}
}
