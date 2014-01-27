package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisorSiNoEsEntero {

	/*
	 * Modifica el ejercicio 1 para que si el usuario introduce algo que no es
	 * un número, vuelva a repetirse el pedir el dividendo y divisor.
	 */
	public static void main(String[] args) {
        int dividendo=0,divisor=0;
        boolean leido,es_cero;
        Scanner teclado=new Scanner(System.in);
        
        leido=false;
        es_cero=false;
        do{
                System.out.println("Dame un número:");
                try{
                        System.out.print("¿Dos números?: ");
                        dividendo=teclado.nextInt();
                        divisor=teclado.nextInt();
                        leido=true;
                        System.out.println("Resultado: " + (dividendo/divisor));
                        es_cero=false;
                }
                catch (InputMismatchException e){
                        leido=false;
                        teclado.nextLine(); //limpiar buffer para no volver a generar excepción
                        System.out.println("Error al leer números enteros");
                }
                catch (ArithmeticException e) {
                        es_cero=true;
                        System.out.println("Error, división por cero");
                }
                
        }while(!leido || es_cero);

        teclado.close();
        

}

}
