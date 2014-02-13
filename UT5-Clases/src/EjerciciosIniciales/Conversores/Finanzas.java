package EjerciciosIniciales.Conversores;
/*
 Ejercicio 3. Realiza una clase Finanzas que convierta dólares a euros y viceversa. 
 Codifica los métodos dolaresToEuros y eurosToDolares. Prueba que dicha clase funciona 
 correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener:

Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.
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
