package EjerciciosIniciales;

public class CocheE2 {

	/*
	 A�adirle los siguientes m�todos: 1. int getVelocidad - Obtiene la velocidad actual. 
	 2. void acelera(int mas) - Aumenta la velocidad en 'm�s' kil�metros hora.
	 */
	 private int velocidad = 0;

	public int getVelocidad() {
		return velocidad;
	}
	public void acelera(int mas){
		this.velocidad += mas;
	}
	public void deCelera(int menos){
		this.velocidad -= menos;
	}
}
