package Metodos;

import java.util.Scanner;

public class ConversorEuros {

	//Escribir un m�todo que convierta de euros a d�lares. Recibir� un n�mero decimal correspondiente a la 
	//cantidad en euros y devolver� la cantidad correspondiente en dolares. Escribir el c�digo en el main 
	//necesario para probarlo.
	public static void main(String[] args) {
	double euros;
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Intoduzca el valor de Euros que quiere convertir a dolares");
	euros = teclado.nextDouble();
	
	System.out.printf(euros + "� equivalen a %.2f" + "$", devolverDolares(euros) );
	
	teclado.close();	
	}
	//le paso el valor de la variable euros al m�todo y me devuelve la variable dolares
	public static double devolverDolares (double euros){
	final double valorDolar = 1.34;
		
	double dolares = euros * valorDolar;
		
	return dolares;
	}

}
