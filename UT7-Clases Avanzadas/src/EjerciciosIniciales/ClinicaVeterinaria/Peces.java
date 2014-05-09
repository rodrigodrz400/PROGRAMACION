package EjerciciosIniciales.ClinicaVeterinaria;

public class Peces extends Animales {

	private int numPeces;
	private boolean tropicales;//si es false (Agua Fría)
	
	public Peces(String clienteNomb, String clienteDirec, String nombre,
			double peso, String fechaNac,int numPeces, boolean tropicales) {
		super(clienteNomb, clienteDirec, nombre, peso, fechaNac);
		this.numPeces=numPeces;
		this.tropicales=tropicales;
	}

}
