package Ejemplos;

public class Jefe extends Empleado {

	private double complemento;
	private String departamento;
	
	public Jefe(String nombre, double sueldo, double complemento) {
		super(nombre, sueldo);//si no se pone el super. implicitamente llama al constructor sin par�metros
		
		this.complemento=complemento;

	}

	public double getSueldo(){
		double sueldo_total;
		
		sueldo_total= super.getSueldo() + this.complemento;
		
		return sueldo_total;
	}
	public static void main (String [] args){
		@SuppressWarnings("unused")
		Jefe jefe = new Jefe ("Pedro", 1000.0,500);
		
	}
}
