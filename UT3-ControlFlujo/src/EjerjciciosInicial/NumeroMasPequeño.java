package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroMasPeque�o {

	//Escribe un programa que visualice el m�s peque�o de tres n�meros.
		public static void main(String[] args) {

			
			Scanner teclado = new Scanner (System.in);
				
			System.out.print("Escriba el primer n�mero entero:");
			int numero1 = teclado.nextInt();
			System.out.print("Escriba el segundo n�emro entero:");
			int numero2 = teclado.nextInt();
			System.out.print("Escriba el tercer n�emro entero:");
			int numero3 = teclado.nextInt();
				

		//visualizar el n�mero m�s peque�o de los tres. 
			if (numero1 < numero2 && numero1 < numero3){	
				System.out.print("El n�mero " + numero1 + ", es el m�s peque�o");
			}else if(numero2 < numero3){
				System.out.print("El n�mero " + numero2 + ", es el m�s peque�o");
			}else{
				System.out.print("El n�mero " + numero3 + ", es el m�s peque�o");
			}
				
			
		teclado.close();
		}

	}

