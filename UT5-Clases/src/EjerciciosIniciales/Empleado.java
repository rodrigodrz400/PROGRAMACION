package EjerciciosIniciales;
/*
  //Atributos
	Nombre
	Apellido 1
	Apellido 2
	DNI
	SueldoBase

	// Constructores
	Empleado()
	Empleado(Nombre,Apellido1)

	// Métodos
	calculaSueldo(horasExtra, precioHora)
	  // sueldo = sueldoBase+horasExtra*precioHora;
 */

public class Empleado {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private double sueldoBase = 1115.25;
	private double sueldo;
	
	public Empleado(){
		
	}
	public Empleado(String nombre, String apellido1){
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	public double calculaSueldo(float horasExtra, float precioHora){
		
		sueldo= (sueldoBase + (horasExtra * precioHora));
		
		return sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	
}
