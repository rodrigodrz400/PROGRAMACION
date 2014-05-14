package MediaMac;

public class Aparato {

	//Almacena el número de producto y número de serie del aparato (cadenas de texto), 
	//su nombre, sistema operativo (“Android 4.1”, “iOS 6”, “Windows Phone 8”, etc) y precio base.
	
	private String numProducto;
	private String numSerie;
	private String nombre;
	private String SO;
	private double precioBase;
	
	public Aparato(String numProducto, String numSerie, String nombre, String so, double precioBase) {
		this.numProducto = numProducto;
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.SO = so;
		this.precioBase=precioBase;
	}

	public String getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(String numProducto) {
		this.numProducto = numProducto;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSO() {
		return SO;
	}
	
	public void setSO(String sO) {
		SO = sO;
	}
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Aparato: "
				+ "\nNombre-->	" + nombre 
				+ "\nSistema Operativo-->	" + SO 
				+ "\nNúmero de serie-->	" + numSerie
				+ "\nNúmero de Producto-->	" + numProducto
				+ "\nPrecio final-->  " + precioPVP();
	}
	/*
	 Como el precio puede variar, la clase Aparato tendrá definirá los métodos siguientes:
		precioPVP(). Devuelve el precio del artículo, sumándole un 10% de márgen después añadiendo el IVA.
		precioPVPRebajado(double rebaja). Se le pasa una rebaja, en tanto por ciento y devolverá el precio 
		final rebajado.
	 */
	public  double precioPVP(){
		double iva = 1.21;
		double precioFinal=this.precioBase * 1.10 * iva;
		
		return precioFinal;
	}
	public double preciopPVPRebajado(double rebajaPorc){
		double rebajaNum = (rebajaPorc/100)+1 ;
		double precioFinal=precioPVP() * rebajaNum;
		
		return precioFinal;
	}
	
}
