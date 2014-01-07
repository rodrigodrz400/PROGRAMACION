package Metodos;

import java.util.Scanner;

public class DosFechas {

	// Creando un m�todo que calcule los a�os que hay entre dos fechas, calcule
	// la edad de una persona pidiendole
	// la fecha actual y la de su nacimiento. El m�todo tendr� la forma: public
	// static int a�osEntre
	// (int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final)
	public static void main(String[] args) {
		String nombre;
		int dia;
		int mes;
		int a�o;
		int dia_final;
		int mes_final;
		int a�o_final;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.next();
		
		System.out.println("Introduzca la fecha actual: ");

		System.out.println("D�a actual: ");
		dia_final = teclado.nextInt();
		System.out.println("Mes actual: ");
		mes_final = teclado.nextInt();
		System.out.println("A�o actual: ");
		a�o_final = teclado.nextInt();

		System.out.println("Introduzca su fecha de nacimiento: ");

		System.out.println("D�a de nacimiento: ");
		dia = teclado.nextInt();
		System.out.println("Mes de nacimiento: ");
		mes = teclado.nextInt();
		System.out.println("A�o de nacimiento: ");
		a�o = teclado.nextInt();

		System.out.printf("La edad de: "+ nombre +" es de " + a�osEntre(dia, mes, a�o, dia_final, mes_final, a�o_final) + " a�os");

		teclado.close();

	}

	public static int a�osEntre(int dia, int mes, int a�o, int dia_final,
			int mes_final, int a�o_final) {
		int edad = 0;
		int dif_a�o = a�o_final - a�o;
		int dif_mes = mes_final - mes;
		int dif_dia = dia_final - dia;

		if (dif_mes < 0 || (dif_mes == 0 && dif_dia < 0)) {
			dif_a�o--;
		}

		edad= dif_a�o;

		return edad;
	}
}
