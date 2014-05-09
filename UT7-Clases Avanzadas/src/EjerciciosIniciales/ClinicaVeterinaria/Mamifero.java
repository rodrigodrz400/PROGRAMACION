package EjerciciosIniciales.ClinicaVeterinaria;


public class Mamifero extends Animales {

	private String raza;
	
	public Mamifero(String clienteNomb, String clienteDirec, String nombre,double peso, 
					String fechaNac, String raza) {
		super(clienteNomb, clienteDirec, nombre, peso, fechaNac);
		this.raza=raza;
	}

}
