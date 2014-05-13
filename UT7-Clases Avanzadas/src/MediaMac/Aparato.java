package MediaMac;

public class Aparato {

	//Almacena el n�mero de producto y n�mero de serie del aparato (cadenas de texto), 
	//su nombre, sistema operativo (�Android 4.1�, �iOS 6�, �Windows Phone 8�, etc) y precio base.
	
	private String numProducto;
	private String numSerie;
	private String nombre;
	private String SO;
	
	public Aparato(String numProducto, String numSerie, String nombre, String so) {
		this.numProducto = numProducto;
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.SO = so;
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

	@Override
	public String toString() {
		return "Aparato: "
				+ "\nNombre-->	" + nombre 
				+ "\nSistema Operativo-->	" + SO 
				+ "\nN�mero de serie-->	" + numSerie
				+ "\nN�mero de Producto-->	" + numProducto;
	}
	/*
	 Como el precio puede variar, la clase Aparato tendr� definir� los m�todos siguientes:
		precioPVP(). Devuelve el precio del art�culo, sum�ndole un 10% de m�rgen despu�s a�adiendo el IVA.
		precioPVPRebajado(double rebaja). Se le pasa una rebaja, en tanto por ciento y devolver� el precio final rebajado.
	 */
	
	
}
