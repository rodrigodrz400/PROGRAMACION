package Ejercicios1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import Interfaces.Persona.Empleado;

public class E4ColeccionConObjetos {
/*
 Crear un programa que utilice dos colecciones, una de tipo ArrayList y otra de tipo LinkedList.
  Las colecciones se cargar�n con objetos de tipo Empleado (de los ejercicios anteriores), 
  en la cantidad que quieras, pero al menos un objeto se cargar� en las dos colecciones. 
  El programa realizar� las siguientes operaciones (tras cada operaci�n imprimir el contenido 
  de las colecciones para comprobar el resultado):

		1.A�adir� a la primera colecci�n los empleados que est�n en la segunda.
		2.Borrar� de la primera colecci�n todos los empleados que no est�n en la segunda.
		3.Borra toda la primera colecci�n.
 */
	public static void main(String[] args) {
		
		LinkedList<Empleado> coleccion1 = new LinkedList<Empleado>();
		
		ArrayList<Empleado> coleccion2 = new ArrayList<Empleado>();

		Empleado rodrigo = new Empleado("Rodrigo","C/ Mayor, 43","Menasalbas","Toledo",45128,31,"rodrigo@gmail.com",1000);
		Empleado daniel = new Empleado("Daniel","C/ Ancha, 12","Toledo","Toledo",45007,24,"daniel@gmail.com",850);
		Empleado raul = new Empleado("Rodrigo","C/ Larga, 05","Malag�n","Ciudad Real",43256,20,"raul@gmail.com",550);
		
		coleccion1.add(rodrigo);
		coleccion2.add(rodrigo);
		coleccion2.add(daniel);
		coleccion2.add(raul);
		
		System.out.println("El LinkedList contine: " + coleccion1.toString());
		System.out.println("El ArrayList contine: " + coleccion2.toString());
		System.out.println();
		//PARA MOSTRAR EL CONTENIDO DE LAS COLECCIONES:
		//for(Empleado contenido : coleccion1) System.out.println(contenido.visualizarDatos());
		//for(Empleado contenido : coleccion2) System.out.println(contenido.visualizarDatos());
		
		//1.A�adir� a la primera colecci�n los empleados que est�n en la segunda.
		coleccion1.addAll(0, coleccion2);
		System.out.println("El LinkedList contine: " +coleccion1.toString());
		System.out.println("El ArrayList contine: " +coleccion2.toString());
		System.out.println();
		
		//2.Borrar� de la primera colecci�n todos los empleados que no est�n en la segunda.
		coleccion1.retainAll(coleccion2);
		System.out.println("El LinkedList contine: " +coleccion1.toString());
		System.out.println("El ArrayList contine: " +coleccion2.toString());
		System.out.println();
		
		//3.Borra toda la primera colecci�n.
		coleccion1.removeAll(coleccion1);
		System.out.println("El LinkedList contine: " +coleccion1.toString());
		System.out.println("El ArrayList contine: " +coleccion2.toString());

		
	}

}
