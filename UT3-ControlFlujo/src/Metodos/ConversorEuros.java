package Metodos;

import java.util.Scanner;

public class ConversorEuros {

	//Escribir un método que convierta de euros a dólares. Recibirá un número decimal correspondiente a la 
	//cantidad en euros y devolverá la cantidad correspondiente en dolares. Escribir el código en el main 
	//necesario para probarlo.
	public static void main(String[] args) {
	double euros;
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Intoduzca el valor de Euros que quiere convertir a dolares");
	euros = teclado.nextDouble();
	
	System.out.printf(euros + "€ equivalen a %.2f" + "$", devolverDolares(euros) );
	
	teclado.close();	
	}
	//le paso el valor de la variable euros al método y me devuelve la variable dolares
	public static double devolverDolares (double euros){
	final double valorDolar = 1.34;
		
	double dolares = euros * valorDolar;
		
	return dolares;
	}

}
