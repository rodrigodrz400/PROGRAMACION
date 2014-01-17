package Metodos;

import java.util.Scanner;

public class EncuentreMinimo {

	/*
	 Escriba un método llamado minimo3 que devuelva el menor de tres números de punto flotante. Use el método Math.min para
	 implementar minimo3. Incorpore el método en una palicación que reciba como entraa tres valores por parte de usuario,
	 determine el valor menor y muestre el resultado.
	 */
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		
		System.out.println("Introduzca 3 números de punto flotante: ");
		float n1 = teclado.nextFloat();
		float n2 = teclado.nextFloat();
		float n3 = teclado.nextFloat();
		
		System.out.printf("El menor de los 3 números introducidos es: %.2f",  minimo3(n1,n2,n3));
		
		teclado.close();

	}

	public static float minimo3(float n1, float n2, float n3){
		float resultado = 0;
		if (n1 < n2){
			resultado = Math.min(n1, n3);
		}else if (n2 < n3){
			resultado = Math.min(n1, n2);
		}
		
		return resultado;
	}
}
