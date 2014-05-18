package Ejemplos;

public class Trabajo implements Precio {

	private String tipo;
	private double horas;
	private double precioPorHora;
	
	public Trabajo(String tipo, double horas, double precioPorHora) {
		super();
		this.tipo = tipo;
		this.horas = horas;
		this.precioPorHora = precioPorHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	@Override
	public double getPrecio() {
		
		return this.horas * this.precioPorHora*recargo;
	}

	@Override
	public String toString() {
		return "Trabajo [tipo=" + tipo + ", horas=" + horas
				+ ", precioPorHora=" + precioPorHora + "]";
	}
	
	
}
