package EjerciciosIniciales.Conversores;
/*
 Ejercicio 1. Crea una clase con un método estático millasAMetros que toma como parámetro de 
 entrada un valor en millas marinas y las convierte a metros.

Una vez tengas este método escribe otro millasAKilometros que realice la misma conversión, 
pero esta vez exprese el resultado en kilómetros.

          Nota:1 milla marina equivale a 1852 metros.               
 */
public class Millas {

	private final static double metrosXmilla=1852;
	
	public static double millasAMetros(double millas){
		double metros;
		
		metros= millas * metrosXmilla;
		
		return metros;
	}
	public static double millasAKilometros(double millas){
		double kilometros;
		
		kilometros= millas * metrosXmilla;
		
		return kilometros;
	}
	
}
