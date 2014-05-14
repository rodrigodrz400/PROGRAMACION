package MediaMac;

public class Tableta extends Aparato {

	//Debe tener además como atributo las pulgadas de pantalla y su peso en gramos.
	private double pulgadas;
	private double peso;
	
	public Tableta(String numProducto, String numSerie, String nombre, String so, double precioBase) {
		super(numProducto, numSerie, nombre, so, precioBase);
		this.pulgadas=pulgadas;
		this.peso=peso;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTableta [pulgadas=" + pulgadas + ", peso=" + peso + "]";
	}
	
	
}
