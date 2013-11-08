package PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	        
	        /*
	         * Crea un programa que pida el tamaño de un archivo (Mbytes) 
	         * y la velocidad de una línea de datos (Mbps), y muestre
	         * el tiempo que tardará en transmitirlo usando dicha línea.
	         */
	        public static void main(String[] args) {
	                double tamaño,velocidad;
	                
	                Scanner teclado = new Scanner(System.in);
	                
	                System.out.print("¿Cuál es el tamaño del archivo (Mbytes)? ");
	                tamaño = teclado.nextDouble();
	                System.out.print("¿Cuál es la velocidad de tu línea (Mbps)? ");
	                velocidad = teclado.nextDouble();
	                tamaño = tamaño * 1024 * 1024 * 8; // = tamaño * Math.pow(2,20) * 8
	                velocidad = velocidad * 1000000;
	                
	                System.out.print("Datos: " + tamaño + " bits");
	                System.out.print("\nVelocidad: " + velocidad + " bps");
	                System.out.print("\nTiempo para transmitir: " + tamaño/velocidad + " s");
	       
	                teclado.close();
	        
	        }
	}
