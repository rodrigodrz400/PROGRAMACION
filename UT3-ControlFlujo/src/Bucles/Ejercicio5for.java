package Bucles;

import java.util.Scanner;

public class Ejercicio5for {

	//Escribe un programa que pida dos números con el fin de visualizar la suma de todos los números que hay entre ambos números 
	//(incluidos dichos números). Si el primer número que inserte el usuaruio es mayor que el segundo, se volverán a pedir otros 
	//dos números hasta que el primer número insertado sea menor o igual que el segundo.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int n1 = 0;
		int n2 = 0;
		int suma2 = 0;
		
		
				
		do {
			int suma1 = 0;
			System.out.println("Introduzca el primer número");
		    n1 = teclado.nextInt();
			System.out.println("Introduzca el segundo número");
		    n2 = teclado.nextInt();
			   	if  (n1>n2){
					    for (int i=n1; i>=n2; --i){
							suma1 += i;
							}System.out.println("n1>n2, por tanto la suma de todos los números que hay entre ambos (éstos inclusives) es: " + suma1);
					   	}	
			} while (n1>n2);
			
			for (int i=n2; i>=n1; --i){
			suma2 += i;
			}
		System.out.println("---FIN DE LA SECUENCIA--");
		System.out.println( "n1<=n2, la suma de todos los números que hay entre ambos (éstos inclusives) es: " + suma2);		
		
		
		
		
	teclado.close();
	}

}
