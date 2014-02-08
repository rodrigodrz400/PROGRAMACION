package EjerciciosIniciales;

import java.util.Scanner;

public class ConsultaProductosE4 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		ProductoE4 naranjas;
		
		naranjas= new ProductoE4(001,4.5);
		
		System.out.println("El kilo de naranjas (cod: " + naranjas.getCodProducto()+
							") tiene un precio de : " + naranjas.getPrecio() +" €/Kg.\n");
			
		System.out.println("Esta semana se le aplica un descuento del 50% al kilo de naranjas.");
		naranjas.setDescuento(50);
		System.out.println("El kilo de naranjas (cod: " + naranjas.getCodProducto()+
				") tiene un precio de : " + naranjas.getPrecioTotal() +" €/Kg.\n");
		
		System.out.println("Esta semana cambia el precio de las naranjas, ahora pasan a costar "
				+ "5€/kg, aunque la oferta del 50% de descuento sigue vigente.");
		System.out.println("El kilo de naranjas (cod: " + naranjas.getCodProducto()+
				") tiene un precio de : " + naranjas.getPrecioTotal(5) +" €/Kg.\n");
		
		System.out.println("Esta semana el kilo de naranjas pasa a costar 4€, pero desaparecen"
				+ " todos los descuentos.");
		naranjas.setPrecio(4);
		naranjas.setDescuento(0);
		System.out.println("El kilo de naranjas (cod: " + naranjas.getCodProducto()+
				") tiene un precio de : " + naranjas.getPrecio() +" €/Kg.\n");
		
		teclado.close();

	}

}
