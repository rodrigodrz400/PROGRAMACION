package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConDecimales10numerosAngel {

	public static void main(String[] args) {



/*
 Escribe un programa que pida diez números con decimales. Si insertan letras, 
 se pedirá de nuevo dicho número. El programa debe visualizar el número más alto 
 de todos los insertados. Si se produce alguna excepción se mostrará el mensaje 
 correspondiente. Además, al final del programa se visualizará un mensaje que indica 
 cuántas veces se ha producido dicho error.
 */

                Scanner teclado = new Scanner(System.in);
                                
                int errores = 0;
                double numeroIntroducido,maximo;
                
                maximo = -Double.MAX_VALUE;
                System.out.println(maximo);

                for (int correctos = 0; correctos < 10;) {
                        try {
                                if (correctos != 0) {
                                        System.out.println("Inserte otro número: ");
                                } else {
                                        System.out.println("Escriba 10 números decimales: ");
                                }
                                numeroIntroducido= teclado.nextDouble();
                                if (numeroIntroducido > maximo) 
                                        maximo = numeroIntroducido;
                                correctos++;
                        } catch (InputMismatchException ime) {
                                System.out.println("\nError: " + ime.toString());
                                System.out.println("Tipo de error: " + ime.getMessage()
                                                + "\nSe han introducido caracteres "
                                                + "para un valor de tipo numérico.\n");
                                teclado.nextLine();
                                errores++;
                        }
                }
                
                System.out.println("El valor más alto introducido es el número: " + maximo + ".");
                System.out.println("Se han producido un total de: " + errores 
                                + " errores, durante la ejecución del programa.");

                teclado.close();
        }

}