package EjerciciosIniciales.Empleados;

public class EmpHoras extends Empleado {

	// Atributos
	private double precioHora;
	private double horasTrabajadas;


	// Metodos
	public double calcularSalarioSemanal() {

		double SalarioSemanal = precioHora * horasTrabajadas;

		return SalarioSemanal;
	}
}
