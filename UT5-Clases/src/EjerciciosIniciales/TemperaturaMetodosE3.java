package EjerciciosIniciales;

/*
 A�ade a la clase Temperatura los m�todos est�ticos celsiusToFarenheit farenheitToCelsius, 
 de forma que puedan usarse sin necesidad de crar ning�n objeto.
 */
public class TemperaturaMetodosE3 {
	static float celsius;
	static float farenheit;
	
	public float celsiusToFarenheit(float celsius){
	
	return farenheit=	(float) ((celsius * 1.8000) + 32.00);	
	}
	
	
	public float farenheitToCelsius(float farenheit){
			
	return celsius=	(float) (((farenheit -32)/1.8f)*100)/100;
	}

	
	
}
