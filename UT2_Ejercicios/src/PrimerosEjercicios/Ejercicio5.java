package PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	        
	        /*
	         * Crea un programa que pida el tama�o de un archivo (Mbytes) 
	         * y la velocidad de una l�nea de datos (Mbps), y muestre
	         * el tiempo que tardar� en transmitirlo usando dicha l�nea.
	         */
	        public static void main(String[] args) {
	                double tama�o,velocidad;
	                
	                Scanner teclado = new Scanner(System.in);
	                
	                System.out.print("�Cu�l es el tama�o del archivo (Mbytes)? ");
	                tama�o = teclado.nextDouble();
	                System.out.print("�Cu�l es la velocidad de tu l�nea (Mbps)? ");
	                velocidad = teclado.nextDouble();
	                tama�o = tama�o * 1024 * 1024 * 8; // = tama�o * Math.pow(2,20) * 8
	                velocidad = velocidad * 1000000;
	                
	                System.out.print("Datos: " + tama�o + " bits");
	                System.out.print("\nVelocidad: " + velocidad + " bps");
	                System.out.print("\nTiempo para transmitir: " + tama�o/velocidad + " s");
	       
	                teclado.close();
	        
	        }
	}
