package EjerciciosIniciales.Empleados;

public class EmpAsalariado extends Empleado {

	// Atributos
	private double salarioSemanal;

	// Accesadores
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	// Metodos
	public double calcularSalarioSemanal() {
		return this.salarioSemanal;
	}
}
