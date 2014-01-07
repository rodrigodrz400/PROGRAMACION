package Metodos;

import java.util.Scanner;

public class DosFechas {

	// Creando un método que calcule los años que hay entre dos fechas, calcule
	// la edad de una persona pidiendole
	// la fecha actual y la de su nacimiento. El método tendrá la forma: public
	// static int añosEntre
	// (int dia, int mes, int año, int dia_final, int mes_final, int año_final)
	public static void main(String[] args) {
		String nombre;
		int dia;
		int mes;
		int año;
		int dia_final;
		int mes_final;
		int año_final;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.next();
		
		System.out.println("Introduzca la fecha actual: ");

		System.out.println("Día actual: ");
		dia_final = teclado.nextInt();
		System.out.println("Mes actual: ");
		mes_final = teclado.nextInt();
		System.out.println("Año actual: ");
		año_final = teclado.nextInt();

		System.out.println("Introduzca su fecha de nacimiento: ");

		System.out.println("Día de nacimiento: ");
		dia = teclado.nextInt();
		System.out.println("Mes de nacimiento: ");
		mes = teclado.nextInt();
		System.out.println("Año de nacimiento: ");
		año = teclado.nextInt();

		System.out.printf("La edad de: "+ nombre +" es de " + añosEntre(dia, mes, año, dia_final, mes_final, año_final) + " años");

		teclado.close();

	}

	public static int añosEntre(int dia, int mes, int año, int dia_final,
			int mes_final, int año_final) {
		int edad = 0;
		int dif_año = año_final - año;
		int dif_mes = mes_final - mes;
		int dif_dia = dia_final - dia;

		if (dif_mes < 0 || (dif_mes == 0 && dif_dia < 0)) {
			dif_año--;
		}

		edad= dif_año;

		return edad;
	}
}
