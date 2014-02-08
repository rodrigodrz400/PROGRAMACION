package EjerciciosIniciales;

public class TemperaturaE1 {

	float temperatura;
	

	public float getTemperatura() {
		return temperatura;
	}
	public void setCelsius(float celsius) {
		this.temperatura= celsius;
	}
	public void setFahrenheit(float fahrenheit) {
		this.temperatura = (Math.round((fahrenheit-32)/1.8f)*100)/100;
		
	}
	
	
	
	
}
