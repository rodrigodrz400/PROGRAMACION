package TurisBus;

public class ParadaActividad extends Parada {

	private String nombreActividad;
	private double precioActividad;
	
	public ParadaActividad(String nombre, String horaBajada, String horaSalida,
			String nombreActividad, double precioActividad) {
		super(nombre, horaBajada, horaSalida);
		this.nombreActividad=nombreActividad;
		this.precioActividad=precioActividad;
	}

	public String getNombre() {
		return nombreActividad;
	}

	public void setNombre(String nombre) {
		this.nombreActividad = nombre;
	}

	public double getPrecio() {
		return precioActividad;
	}

	public void setPrecio(double precio) {
		this.precioActividad = precio;
	}
	
	public String toString() {
		return String.format("%s\t\tActividad: %s\n\t\tPrecio de la actividad: %.2f €.\n",
				              super.toString(), this.nombreActividad, this.precioActividad);
	}
}
