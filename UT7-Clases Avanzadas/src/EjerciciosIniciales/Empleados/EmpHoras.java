package EjerciciosIniciales.Empleados;

public class EmpHoras extends Empleado {

	// Atributos
	private double precioHora;
	private double horasTrabajadas;

	// Constructores
	public EmpHoras(String nombre, String ocupacion, double precioHora, double horasTrabajadas) {
		super(nombre, ocupacion);
		this.precioHora = precioHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	// Metodos
	public double calcularSalarioSemanal() {

		double SalarioSemanal = precioHora * horasTrabajadas;

		return SalarioSemanal;
	}
}
