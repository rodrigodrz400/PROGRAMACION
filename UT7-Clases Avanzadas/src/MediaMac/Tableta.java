package MediaMac;

public class Tableta extends Aparato {

	//Debe tener además como atributo las pulgadas de pantalla y su peso en gramos.
	private double pulgadas;
	private double peso;
	
	public Tableta(String numProducto, String numSerie, String nombre, String so, double precioBase,double pulgadas, double peso) {
		super(numProducto, numSerie, nombre, so, precioBase);
		this.pulgadas=pulgadas;
		this.peso=peso;
	}
	
	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSubclase: Tableta \n\tpulgadas-->" + pulgadas + "\n\tpeso=" + peso;
	}
	
	
}
