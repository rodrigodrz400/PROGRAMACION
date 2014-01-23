package Metodos;
import java.util.Scanner;


public class Ejemplo143 {

	public static double redondea(double a_redondear, int decimales) {
		double resultado;
		
		resultado=a_redondear*Math.pow(10,decimales);
		
		resultado=Math.floor(resultado +0.5);
		
		resultado=resultado/Math.pow(10,decimales);
		
		return resultado;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double numero;
		int decimales;
		
		System.out.println("-SuperRedondator-");
		System.out.println("Dame un numero de decimales (entero): ");
		decimales = teclado.nextInt();
		
		do {
		
			System.out.println("Dame un numero real: ");
		
			numero= teclado.nextDouble();
		
			System.out.println(numero +
					" redondeado es: " + redondea(numero,decimales));
			
			
		} while (numero != 0.0);

		System.out.println("Adiós!");
	}

}

		
