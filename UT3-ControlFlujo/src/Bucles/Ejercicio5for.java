package Bucles;

import java.util.Scanner;

public class Ejercicio5for {

	//Escribe un programa que pida dos n�meros con el fin de visualizar la suma de todos los n�meros que hay entre ambos n�meros 
	//(incluidos dichos n�meros). Si el primer n�mero que inserte el usuaruio es mayor que el segundo, se volver�n a pedir otros 
	//dos n�meros hasta que el primer n�mero insertado sea menor o igual que el segundo.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int n1 = 0;
		int n2 = 0;
		int suma2 = 0;
		
		
				
		do {
			int suma1 = 0;
			System.out.println("Introduzca el primer n�mero");
		    n1 = teclado.nextInt();
			System.out.println("Introduzca el segundo n�mero");
		    n2 = teclado.nextInt();
			   	if  (n1>n2){
					    for (int i=n1; i>=n2; --i){
							suma1 += i;
							}System.out.println("n1>n2, por tanto la suma de todos los n�meros que hay entre ambos (�stos inclusives) es: " + suma1);
					   	}	
			} while (n1>n2);
			
			for (int i=n2; i>=n1; --i){
			suma2 += i;
			}
		System.out.println("---FIN DE LA SECUENCIA--");
		System.out.println( "n1<=n2, la suma de todos los n�meros que hay entre ambos (�stos inclusives) es: " + suma2);		
		
		
		
		
	teclado.close();
	}

}
