package EjerciciosIniciales;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DosAlumnosMETODOS {

	/*
	 * Escribe un programa que pida los datos de dos alumnos. De dichos alumnos
	 * nos interesa nombre, edad y altura. Visualiza los datos de dichos alumnos
	 * diciendo cual es el mayor (o si tienen la misma edad). Si se produjese un
	 * error IOException, se mostrará un mensaje y se terminará el programa.
	 * Puedes usar System.exit(-1); Si el usuario introduce un valor erróneo
	 * (InputMismatchException) volverá a pedir el dato correspondiente.
	 */

    private static Scanner teclado;
        
        public static int leerEdad() {
                
                teclado = new Scanner(System.in);
                boolean hayDatosErroneos = true;
                int edad = 0;
                
                do {                        
                        
                        try {                                
                                
                                System.out.print("Introduzca Edad del alumno: ");                                
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
        
        public static float leerAltura() {
                
                teclado = new Scanner(System.in);
                boolean hayDatosErroneos = true;
                float altura = 0;
                
                do {                        
                        
                        try {                                
                                
                                System.out.print("Introduzca Altura del alumno: ");                                
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
                
                Scanner teclado = new Scanner(System.in);
                String nomAlumno1;
                String nomAlumno2;
                int edadAlumno1 = 0;
                int edadAlumno2 = 0;
                float altAlumno1 = 0;
                float altAlumno2 = 0;
                
                System.out.print("Introduzca Nombre del alumno: ");                                
                nomAlumno1 = teclado.next();
                edadAlumno1 = leerEdad();
                altAlumno1= leerAltura();
                System.out.print("Introduzca Nombre del alumno: ");                                
                nomAlumno2 = teclado.next();
                edadAlumno2 = leerEdad();
                altAlumno2= leerAltura();
                
                teclado.close();
                
                int mayor = Math.max(edadAlumno1, edadAlumno2);
                
                System.out.printf("\n%10s%10s%10s%10s\n", "NOMBRE", "EDAD", "ALTURA", "MAYOR");
                System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno1, edadAlumno1, altAlumno1, 
                                edadAlumno1 == mayor ? "X" : "");
                System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno2, edadAlumno2, altAlumno2, 
                                edadAlumno2 == mayor ? "X" : "");        

        }

}