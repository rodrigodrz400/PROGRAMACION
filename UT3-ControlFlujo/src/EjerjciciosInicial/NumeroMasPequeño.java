package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroMasPequeño {

	//Escribe un programa que visualice el más pequeño de tres números.
		public static void main(String[] args) {

			
			Scanner teclado = new Scanner (System.in);
				
			System.out.print("Escriba el primer número entero:");
			int numero1 = teclado.nextInt();
			System.out.print("Escriba el segundo núemro entero:");
			int numero2 = teclado.nextInt();
			System.out.print("Escriba el tercer núemro entero:");
			int numero3 = teclado.nextInt();
				

		//visualizar el número más pequeño de los tres. 
			if (numero1 < numero2 && numero1 < numero3){	
				System.out.print("El número " + numero1 + ", es el más pequeño");
			}else if(numero2 < numero3){
				System.out.print("El número " + numero2 + ", es el más pequeño");
			}else{
				System.out.print("El número " + numero3 + ", es el más pequeño");
			}
				
			
		teclado.close();
		}

	}

