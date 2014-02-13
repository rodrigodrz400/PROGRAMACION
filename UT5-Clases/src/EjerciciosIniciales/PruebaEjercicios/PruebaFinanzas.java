package EjerciciosIniciales.PruebaEjercicios;

import java.util.Scanner;

import EjerciciosIniciales.Conversores.Finanzas;

//Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. 
public class PruebaFinanzas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Finanzas factura01;
		Finanzas factura02;
		
		factura01 = new Finanzas();
		System.out.println("El valor actual del euro respecto al dolar es de: ");
		System.out.println(factura01.getValorDolarEuro());
		
		System.out.println("Introduzca los valores que desea convertir de dolares a euros: ");
		System.out.println("15 dolares = " + Finanzas.dolaresToEuros(15) + "€");
		System.out.println("25 dolares = " + Finanzas.dolaresToEuros(25) + "€");
		System.out.println("68 dolares = " + Finanzas.dolaresToEuros(68) + "€");

		System.out.println("Ahora introduzca los valores que desea convertir de euros a dolares: ");
		System.out.println("15 euros = " + Finanzas.eurosToDolares(15) + "$");
		System.out.println("25 euros = " + Finanzas.eurosToDolares(25) + "$");
		System.out.println("68 euros = " + Finanzas.eurosToDolares(68) + "$\n");
		
		System.out.println("Acaba de variar el valor del Euro respecto al dolar");
		factura02 = new Finanzas(1.38);
		System.out.println("El valor actual del euro respecto al dolar es de: ");
		System.out.println(factura02.getValorDolarEuro());

		System.out.println("Introduzca los valores que desea convertir de dolares a euros: ");
		System.out.println("15 dolares = " + Finanzas.dolaresToEuros(15) + "€");
		System.out.println("25 dolares = " + Finanzas.dolaresToEuros(25) + "€");
		System.out.println("68 dolares = " + Finanzas.dolaresToEuros(68) + "€");

		System.out.println("Ahora introduzca los valores que desea convertir de euros a dolares: ");
		System.out.println("15 euros = " + Finanzas.eurosToDolares(15) + "$");
		System.out.println("25 euros = " + Finanzas.eurosToDolares(25) + "$");
		System.out.println("68 euros = " + Finanzas.eurosToDolares(68) + "$\n");
		

	}

}
