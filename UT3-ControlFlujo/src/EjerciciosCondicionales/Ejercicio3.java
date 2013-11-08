package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Una tienda hace un descuento del 10% por compras menores de 20€, un 20% por compras entre 20 y 50€ y 
	 * un 25% si la compra es mayor. Escribe un programa que pida el precio de un producto y muestre su precio
	 *  final en las rebajas.
	 */
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Por favor introduzca el importe del producto");
		double precio = teclado.nextDouble();
		
		if (precio <= 20){	
			System.out.print("El precio del producto rebajado es de " + (precio * 0.9) + "€  (10% de descuento)" );
		}else if (precio >= 20 && precio <=50){
			System.out.print("El precio del producto rebajado es de " + (precio * 0.8) + "€  (20% de descuento)" );
		}else{
			System.out.print("El precio del producto rebajado es de " + (precio * 0.75) + "€  (25% de descuento)" );
		}
		
	teclado.close();
		
	}

}
