package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio6 {

	
	//Escribe un programa que pida el ph de una solución y muestre el mensaje de si la solución es ácida (ph < 7.0)
	//o peligrósamente ácida: ph < 3.0).
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CONOZCA LA ESCALA DE PH DE UNA SOLUCION");
		System.out.println("Por favor, el ph de una solución comprendido entre 1-14");
		double phSolucion = teclado.nextDouble();
	
		
		if ((phSolucion <= 7.0)  && (phSolucion >= 3.0)){
			System.out.println("El ph " + phSolucion + ", es una solución ÁCIDA");	
		}else if ((phSolucion <= 3.0)  && (phSolucion >= 0.0)){
			System.out.println("El ph " + phSolucion + ", es una solución PELIGÓRSAMENTE ÁCIDA");
		}else if (phSolucion == 7.0){
			System.out.println("El ph " + phSolucion + ", es una solución NEUTRA");
		}else if ((phSolucion >= 8.0)  && (phSolucion <= 11.0)){
			System.out.println("El ph " + phSolucion + ", es una solución BÁSICA");
		}else if ((phSolucion >= 11.0)  && (phSolucion <= 14.0)){
			System.out.println("El ph " + phSolucion + ", es una solución EXTREMADAMENTE ALCALINA");
		}
		
		teclado.close();
		
	}

}