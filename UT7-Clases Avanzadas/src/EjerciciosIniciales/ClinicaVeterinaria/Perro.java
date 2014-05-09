package EjerciciosIniciales.ClinicaVeterinaria;

public class Perro extends Mamifero {

	private int numID;
	private boolean peligroso;
	
	public Perro(String clienteNomb, String clienteDirec, String nombre,
			double peso, String fechaNac, String raza, int numID, boolean peligroso) {
		super(clienteNomb, clienteDirec, nombre, peso, fechaNac, raza);
		this.numID=numID;
		this.peligroso=peligroso;
	}

}
