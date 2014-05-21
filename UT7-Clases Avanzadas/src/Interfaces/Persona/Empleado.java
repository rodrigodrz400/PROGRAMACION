package Interfaces.Persona;

public class Empleado implements Persona {


	@Override
	public String nombreEmpresa() {
		
		return "Restaurante Tan Dao Vien";
	}

	@Override
	public void pedirDatos() {
		
	}

	@Override
	public String visualizarDatos() {
		return null;

	}

	public static void main(String[] args) {

	}
}
