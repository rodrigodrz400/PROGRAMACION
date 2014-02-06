package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecuenciaDeNumerosAngel {

	public static void main(String[] args) {
		

		/*
		 Escribe un programa que pida diez números con decimales. Si insertan letras, 
		 se pedirá de nuevo dicho número. El programa debe visualizar el número más alto 
		 de todos los insertados. Si se produce alguna excepción se mostrará el mensaje 
		 correspondiente. Además, al final del programa se visualizará un mensaje que indica 
		 cuántas veces se ha producido dicho error.
		 */

		                Scanner teclado = new Scanner(System.in);
		                                
		                int numeros = 0;
		                double numeroIntroducido,maximo;
		                boolean continuar=true;
		                
		                maximo = -Double.MAX_VALUE;
		                

		                while (continuar) {
		                        System.out.println("Inserte otro número: ");
		                        
		                        try {
		                                numeroIntroducido= teclado.nextDouble();
		                                if (numeroIntroducido > maximo) 
		                                        maximo = numeroIntroducido;
		                                numeros++;
		                        } catch (InputMismatchException ime) {
		                                //System.out.println("\nError: " + ime.toString());
		                                //System.out.println("Tipo de error: " + ime.getMessage()
		                                //                + "\nSe han introducido caracteres "
		                                //                + "para un valor de tipo numérico.\n");
		                                String cadena = teclado.nextLine();
		                                if (cadena.equals("*")) continuar=false;
		                        }
		                }
		                
		                if (numeros > 0)
		                        System.out.println("El valor más alto introducido es el número: " + maximo + ".");
		                else
		                        System.out.println("No ha dado tiempo a calcular un máximo");

		                teclado.close();
		        }

		}