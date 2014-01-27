package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisorSiNoEsEntero {

	/*
	 * Modifica el ejercicio 1 para que si el usuario introduce algo que no es
	 * un n�mero, vuelva a repetirse el pedir el dividendo y divisor.
	 */
	public static void main(String[] args) {
        int dividendo=0,divisor=0;
        boolean leido,es_cero;
        Scanner teclado=new Scanner(System.in);
        
        leido=false;
        es_cero=false;
        do{
                System.out.println("Dame un n�mero:");
                try{
                        System.out.print("�Dos n�meros?: ");
                        dividendo=teclado.nextInt();
                        divisor=teclado.nextInt();
                        leido=true;
                        System.out.println("Resultado: " + (dividendo/divisor));
                        es_cero=false;
                }
                catch (InputMismatchException e){
                        leido=false;
                        teclado.nextLine(); //limpiar buffer para no volver a generar excepci�n
                        System.out.println("Error al leer n�meros enteros");
                }
                catch (ArithmeticException e) {
                        es_cero=true;
                        System.out.println("Error, divisi�n por cero");
                }
                
        }while(!leido || es_cero);

        teclado.close();
        

}

}
