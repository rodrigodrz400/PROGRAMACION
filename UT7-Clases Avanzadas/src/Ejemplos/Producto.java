package Ejemplos;

public class Producto implements Precio{

	private String nombre;
	private double precioUnitario;
	private double IVA;
	
	public Producto(String nombre, double precioUnitario, double iVA) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		IVA = iVA;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getIVA() {
		return IVA;
	}
	public void setIVA(double iVA) {
		IVA = iVA;
	}
	@Override
	public double getPrecio() {
		
		return this.precioUnitario*(1+IVA/100)*recargo;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario="
				+ precioUnitario + ", IVA=" + IVA + "]";
	}
	
	
}
