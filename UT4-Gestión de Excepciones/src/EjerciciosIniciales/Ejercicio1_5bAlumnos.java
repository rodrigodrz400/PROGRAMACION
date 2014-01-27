package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_5bAlumnos {
/*
 * Escribe un programa que pida los datos de dos alumnos. De dichos alumnos nos interesa nombre, edad y altura.
 * Visualiza los datos de dichos alumnos diciendo cual es el mayor (o si tienen la misma edad).
 * Si se produjese un error IOException, se mostrará un mensaje y se terminará el programa.
 * Puedes usar System.exit(-1); Si el usuario introduce un valor erróneo (InputMismatchException) volverá a pedir el dato correspondiente.
 */
	
	static Scanner teclado;
	
	public static int leerEdad(){
		boolean hayDatosErroneos=true;
		int edad=0;
		do {                        
             
             try {                                
                     
                     System.out.print("Introduzca Edad de Alumno: ");                                
                     edad = teclado.nextInt();
                     hayDatosErroneos = false;
             }
             catch ( InputMismatchException entradaInvalida ) {
                     
                     System.out.println("Error al escribir la edad. Inténtelo de nuevo.");
                     teclado.nextLine();
             }
     
		} while ( hayDatosErroneos );
		return edad;
	}
	
	public static float leerAltura(){
		boolean hayDatosErroneos=true;
		float altura=0;
		 do {                        
             
             try {                                
                     
                     System.out.print("Introduzca Altura de Alumno: ");                                
                     altura = teclado.nextFloat();
                     hayDatosErroneos = false;
             }                        
             
             catch ( InputMismatchException entradaInvalida ) {
                     
                     System.out.println("Error al escribir la altura. Inténtelo de nuevo.");
                     teclado.nextLine();
             }
     
     } while ( hayDatosErroneos );
		return altura;
	}
	
	public static void main(String[] args) {
		
        String nomAlumno1;
        String nomAlumno2;
        int edadAlumno1 = 0;
        int edadAlumno2 = 0;
        float altAlumno1 = 0f;
        float altAlumno2 = 0f;                
        
        
        teclado=new Scanner(System.in);
        
        
        
        System.out.print("Introduzca Nombre de Alumno nº1: ");                                
        nomAlumno1 = teclado.next();
        
        edadAlumno1=leerEdad();
        
        
        
        altAlumno1=leerAltura();
        
        System.out.print("Introduzca Nombre de Alumno nº2: ");                                
        nomAlumno2 = teclado.next();
        
       
        
        edadAlumno2=leerEdad();
        
       
        altAlumno2=leerAltura();
        
        teclado.close();
        
        int mayor = Math.max(edadAlumno1, edadAlumno2);
        
        System.out.printf("\n%10s%10s%10s%10s\n", "NOMBRE", "EDAD", "ALTURA", "MAYOR");
        System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno1, edadAlumno1, altAlumno1, 
                        edadAlumno1 == mayor ? "X" : "");//como un if, si es cierto pone la x si es falso lo otro
        System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno2, edadAlumno2, altAlumno2, 
                        edadAlumno2 == mayor ? "X" : "");        

	}

}