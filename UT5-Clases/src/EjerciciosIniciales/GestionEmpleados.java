package EjerciciosIniciales;

public class GestionEmpleados {

	public static void main(String[] args) {
		Empleado rodrigo, daniel;
		float horasExtra= (float)1.5;
		float precioHoras = (float) 12.50;
		
		rodrigo = new Empleado("Rodrigo","Fernández");
		
		System.out.println("El sueldo que cobra " + rodrigo.getNombre()+
							" "+ rodrigo.getApellido1() +" es "+ rodrigo.calculaSueldo(horasExtra, precioHoras)+ "€");
		
		daniel = new Empleado ("Daniel", "García");
		System.out.println("El sueldo que cobra " + daniel.getNombre()+
				" "+ daniel.getApellido1() +" es "+ daniel.calculaSueldo(horasExtra, precioHoras)+ "€");

	}

}
