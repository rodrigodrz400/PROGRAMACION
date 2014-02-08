package EjerciciosIniciales;

/*
 Añade a la clase Temperatura los métodos estáticos celsiusToFarenheit farenheitToCelsius, 
 de forma que puedan usarse sin necesidad de crar ningún objeto.
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
