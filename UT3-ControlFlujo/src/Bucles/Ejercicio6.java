package Bucles;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') 
	de forma que permita hacer una operaci�n, volver� a pedir al usuario el operador, 
	para, con los mismos n�meros, volver a hacer otra operaci�n. El programa terminar� 
	cuando se inserte un caracter que no es un operador.
	*/
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numero1 = 0;
		int numero2 = 0;
		String operacion ="";
		

				System.out.println("Introduzca un n�mero entero");
				numero1 = teclado.nextInt();
				
				do {
						
						System.out.println("Introduzca la operaci�n a realizar ( *, +, -, / )");
						operacion = teclado.next();
				
							if (operacion.equals("*")||operacion.equals("/")
									|| operacion.equals("-") || operacion.equals("+")){
								
										System.out.println("Introduzca un segundo n�mero entero");
										numero2 = teclado.nextInt();
										
										switch (operacion){
										case "*": 
											System.out.println("El resultado es: " + (numero1 * numero2));
											break;
										case "+":
											System.out.println("El resultado es: " + (numero1 + numero2));
											break;
										case "-":
											System.out.println("El resultado es: " + (numero1 - numero2));
											break;
										case "/":
											System.out.println("El resultado es: " + (numero1 / numero2));
											break;
										
							}
							}else{
								System.out.println("Ha introducido un valor incorrecto, EL PROGRAMA HA FINALIZADO.");
								}
				}while(operacion != "*" || operacion != "/" || operacion != "-" || operacion != "+");
			
		
			
		
	teclado.close();	
	}

}


