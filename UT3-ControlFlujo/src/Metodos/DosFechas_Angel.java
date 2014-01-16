package Metodos;

import java.util.Scanner;

public class DosFechas_Angel {

	//Ejercicio 4
	//Creando un m�todo que calcule los a�os que hay entre dos fechas, calcule la edad de una persona 
	//pidiendole la fecha actual y la de su nacimiento. El m�todo tendr� la forma: public static int 
	//a�osEntre(int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final)
	
	public static int a�osEntre(int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final){
		
		int dif_a�os;
		
		dif_a�os = a�o_final-a�o-1;
		
		if(mes_final>mes || (mes_final==mes && dia_final>=dia)){
			dif_a�os++;
		}
		return dif_a�os;
	}
	
	public static void main(String[] args) {
		/*
		 //pruebas
		System.out.println("Uno: " + a�osEntre(1,1,2013,10,1,2014));
		System.out.println("Cero: " + a�osEntre(11,1,2013,10,1,2014));
		System.out.println("Uno: " + a�osEntre(10,1,2013,10,1,2014));
		System.out.println("Cero: " + a�osEntre(10,7,2013,10,1,2014));
		System.out.println("Siete: " + a�osEntre(8,4,2006,10,1,2014));
		 */
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		while (true){
			//Pedir fecha nacimiento
			System.out.println("Fecha de nacimiento (dd mm aaaa): ");
			int dia_nac =teclado.nextInt();
			int mes_nac =teclado.nextInt();
			int a�o_nac =teclado.nextInt();
			//Pedir fecha actual
			System.out.println("Fecha actual (dd mm aaaa): ");
			int dia_act =teclado.nextInt();
			int mes_act =teclado.nextInt();
			int a�o_act =teclado.nextInt();
			
			System.out.println("Tienes: " + a�osEntre(dia_nac,mes_nac,a�o_nac,dia_act,mes_act,a�o_act) + " a�os.");
			
		}
	}

}
