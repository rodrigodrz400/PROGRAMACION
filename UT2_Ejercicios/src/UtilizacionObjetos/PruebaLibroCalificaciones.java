//Fig: 3.5: PruebaLibroCalificaciones.java
//Crea un objeto LibroCalificaciones y llama a su método mostrarMensaje
//Crea un objeto LibroCalificacionse y pasa un objeto String a su método mostrarMensaje

package UtilizacionObjetos;

import java.util.Scanner;

public class PruebaLibroCalificaciones {
	
	//El método main comienza la ejecución del programa
	public static void main(String[] args) {
		
		//Crea un objeto LibroCalificaciones
		LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones ("CS101 Introducción a la programación en Java");
		LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones ("CS102 Estructuras de datos en Java");
		
		//muestra el valor inicial de nobreDelCurso para cada LibroCalificaciones
		System.out.printf("El nombre del curso de libroCalificaciones1 es: %s\n", 
		libroCalificaciones1.obtenerNombreDelCurso () );
		
		System.out.printf("El nombre del curso de libroCalificaciones2 es: %s\n", 
		libroCalificaciones2.obtenerNombreDelCurso () );
		
	}//fin de main

}//fin de la clase PruebaLibroCalificaciones
