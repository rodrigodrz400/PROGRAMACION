package EjerciciosIniciales.Empleados;

public class PruebaEmpleado {

	public static void main(String[] args) {
		//Empleado e = new Empleado();
		
		EmpAsalariado  ea = new EmpAsalariado();
		ea.setNombre("Antonio");
		ea.setOcupacion("Litigante");
		ea.setSalarioSemanal(300);
		
		System.out.println(ea.calcularSalarioSemanal() + "€");
		
		
	}

}
