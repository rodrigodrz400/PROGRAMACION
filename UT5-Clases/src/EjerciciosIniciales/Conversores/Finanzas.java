package EjerciciosIniciales.Conversores;
/*
 Ejercicio 3. Realiza una clase Finanzas que convierta d�lares a euros y viceversa. 
 Codifica los m�todos dolaresToEuros y eurosToDolares. Prueba que dicha clase funciona 
 correctamente haciendo conversiones entre euros y d�lares. La clase tiene que tener:

Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.
 */
public class Finanzas {

	private static double ValorDolarEuro = 1.36;
	
	public Finanzas(){
		
	}
	public Finanzas(double cambioValor){
		this.ValorDolarEuro=cambioValor;
	}
	
	
	
	public double getValorDolarEuro() {
		return ValorDolarEuro;
	}
	
	
	
	public static double dolaresToEuros(double dolares){
		double euros=0;
		
		euros= Math.rint((dolares/ValorDolarEuro)*100)/100;
		return euros;
	}
	public static double eurosToDolares(double euros){
		double dolares=0;
		
		dolares=Math.rint((euros*ValorDolarEuro)*100)/100;
		return dolares;
	}
}
