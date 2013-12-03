package EjerciciosPracticas;

import java.util.Scanner;

public class DosNumeros {

	//Escribe un programa que pida dos números. Si los dos números dados son iguales, 
	//se visualizará un mensaje informando de esto y se volverán a pedir otros dos números. 
	//El programa termina cuando los dos números no son iguales y se imprime el mayor de los dos.
	public static void main(String[] args) {

		//Pedir dos números
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		do{
			System.out.println("Introduzca dos números para comprobar si son iguales: ");
			System.out.println("Introduzca el primer número: ");
			n1 = teclado.nextInt();
			System.out.println("Introduzca el segundo número: ");
			n2 = teclado.nextInt();
			//Si, dos numeros son iguales //imprimir
			if (n1==n2){
				System.out.println("Los números " +n1+ " y "+ n2 + " son iguales");
			}	
		//volver a pedir otros dos números	
		}while (n1==n2);
			System.out.println("Los números " +n1+ " y "+ n2 + " no son iguales");
		//Si dos numeros no son iguales= imprimir mayor y fin de programa
		if(n1!=n2){
			if (n1>n2){
				System.out.println("El número mayor es "+ n1);
			}else if (n1<n2){
				System.out.println("El número mayor es "+ n2);
			}
		System.out.println("---FIN DEL PROGRAMA---");
		}
			
	}

}
