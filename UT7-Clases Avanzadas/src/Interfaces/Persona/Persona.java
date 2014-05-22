package Interfaces.Persona;
/*
 	método: pedirDatos();
	método: visualizarDatos();
	dato: nombre de la empresa a la que pertenecen (con un valor asignado).
 */
public interface Persona {
	
	String nombreEmpresa = "Restaurante Tan Dao Vien";
	
	public void pedirDatos();
	
	public String visualizarDatos();
	
}
