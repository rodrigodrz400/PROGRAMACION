package EjerciciosPracticas;

import java.util.Scanner;

public class DosNumeros {

	//Escribe un programa que pida dos n�meros. Si los dos n�meros dados son iguales, 
	//se visualizar� un mensaje informando de esto y se volver�n a pedir otros dos n�meros. 
	//El programa termina cuando los dos n�meros no son iguales y se imprime el mayor de los dos.
	public static void main(String[] args) {

		//Pedir dos n�meros
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		do{
			System.out.println("Introduzca dos n�meros para comprobar si son iguales: ");
			System.out.println("Introduzca el primer n�mero: ");
			n1 = teclado.nextInt();
			System.out.println("Introduzca el segundo n�mero: ");
			n2 = teclado.nextInt();
			//Si, dos numeros son iguales //imprimir
			if (n1==n2){
				System.out.println("Los n�meros " +n1+ " y "+ n2 + " son iguales");
			}	
		//volver a pedir otros dos n�meros	
		}while (n1==n2);
			System.out.println("Los n�meros " +n1+ " y "+ n2 + " no son iguales");
		//Si dos numeros no son iguales= imprimir mayor y fin de programa
		if(n1!=n2){
			if (n1>n2){
				System.out.println("El n�mero mayor es "+ n1);
			}else if (n1<n2){
				System.out.println("El n�mero mayor es "+ n2);
			}
		System.out.println("---FIN DEL PROGRAMA---");
		}
			
	}

}
