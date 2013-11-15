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
           double descuento;
           
           if (precio <= 20){
                   descuento=0.1;
           }else if (precio > 20 && precio <=50){
                   descuento=0.2;
           }else{
                   descuento=0.25;
           }
           
           /*
           if (precio <= 20) descuento=0.1;
           if (precio > 20 && precio <=50)        descuento=0.2;
           if (precio > 50) descuento=0.25;
            */
           
           System.out.print("El precio del producto rebajado es de " + (precio - precio * descuento) 
                           + "€ (" + descuento*100 + "% de descuento)" );
           
   teclado.close();
           
   }

}