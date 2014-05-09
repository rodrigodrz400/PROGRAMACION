package EjerciciosIniciales.Empleados;
/*
 Diseña una jerarquia de clases con la superclase Empleado, que incluye subclases para 
 EmpleadoPorHoras y EmpleadoAsalariado. Los atributos que comparten son el nombre y ocupación 
 del empleado, más los get/set apropiados para estos atributos. Los empleados asalariados tienen 
 un salario semanal, y los métodos correspondientes get/set. El empleado por horas tiene un precio
 por hora y las horas trabajadas. Debe haber un método calculaSalarioSemanal que se puede aplicar
 a ambos.
 */
public class Empleado {

	//Atributos
	private String nombre;
	private String ocupacion;
	
	//Constructor
	public Empleado(String nombre, String ocupacion){
		this.nombre=nombre;
		this.ocupacion=ocupacion;			
	}
		
	//Accesadores
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
}
