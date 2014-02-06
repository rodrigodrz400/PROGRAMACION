package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaEnteros {

	/*
	 * Haciendo uso de un m�todo que pida un n�mero entero,
	 * hacer un programa que pida n�meros enteros y visualice el resultado de sumar dichos n�mero.
	 * Se pedir�s n�meros hasta que se inserte una letra o se inserten seis n�meros.
	 */
		
		static Scanner teclado;
		
		public static int pideNumero() throws InputMismatchException{
			boolean continuarCiclo=true;
			int resultado = 0;
			
			do{
				try{
				
					resultado=teclado.nextInt();
					continuarCiclo=false;
					}catch(InputMismatchException ime){
						String escrito = teclado.nextLine();
						if(Character.isDigit(escrito.charAt(0))){
							System.out.println("Escribe otra vez el n�mero: ");
							continuarCiclo=true;
						}else{
							throw ime;//lanza la excepci�n al m�todo main para que lo resuleva el try-catch
						}
						
					}
			}while(continuarCiclo==true);
			
			return resultado;
		}
		
		public static void main(String[] args) {
			teclado=new Scanner(System.in);
			int n2;
			int acumulador=0;
			
			boolean continuarCiclo=true;
			int intentos=0;
			do{
				try{
					System.out.println("Introduzca un n�mero entero: (numeros a introducir restantes = "+(6-intentos)+")");
					n2=pideNumero();
					acumulador+=n2;
					intentos++;
					continuarCiclo=true;
				}catch(InputMismatchException ime){
					System.out.println("Error: se ha introducido una letra en lugar de un numero");
					continuarCiclo=false;
				}
			}while(continuarCiclo==true && intentos!=6);
			System.out.printf("Se han introducido %d numeros que suman %d",intentos,acumulador);
			System.out.println("\nFIN DEL PROGRAMA");
			teclado.close();
		}

	}

