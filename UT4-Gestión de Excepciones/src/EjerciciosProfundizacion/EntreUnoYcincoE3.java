package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntreUnoYcincoE3 {

	/*
	 Escribe un programa que se encargue de pedir números hasta que se indique un número comprendido entre 
	 1 y 5 (ambos inclusive), visualizando al final del programa un mensaje como este: "Número encontrado".
	  Hay que validar que el usuario no inserte letras.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int nIntroducido = 0;
		int nResultado;
		int intentos=0;
		
		nResultado = (int) (Math.random()*5)+1;
		System.out.println(nResultado);
		
		
		do{
			try{
				if(intentos!=0){
				System.out.println("Inserte otro número: ");
				}else{
					System.out.println("Inserte un número comprendido entre el 1 y el 5: ");
				}
				nIntroducido= teclado.nextInt();
				intentos++;
				if (nIntroducido!=nResultado){
					System.out.println("Número incorrecto.");
				}
			}catch (InputMismatchException ime){
				System.out.println("\nError: " + ime.toString());
				System.out.println("Tipo de error: " + ime.getMessage() +"\nSe han introducido caracteres "
						+ "para un valor de tipo numérico.\n");
				teclado.nextLine();
			}
		
		}while(nIntroducido!=nResultado);
	
		System.out.println("NUMERO ENCONTADO! El número oculto era " + nResultado + ".");
		
		teclado.close();
	}

}
