package TurisBus;

import java.util.Arrays;

/*
 Viaje, que contiene la información de cada viaje:
 Almacena el código del viaje, su nombre, la hora de salida y la hora de regreso.
 Una lista con las paradas que se van a realizar (Lista de objetos Parada).
 */
public class Viaje {
	private String codigo;
	private String nombre;
	private String horaSalida;
	private String horaLlegada;
	private Parada[] paradas;
	private int contadorParadas;
	private int numParadas;

	public Viaje(String codigo, String nombre, String horaSalida,
			String horaLlegada, int numParadas) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.paradas = new Parada[this.numParadas = numParadas];
		this.contadorParadas = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Parada[] getParadas() {
		return paradas;
	}

	public void setParadas(Parada[] paradas) {
		this.paradas = paradas;
	}

	public int getContadorParadas() {
		return contadorParadas;
	}

	public void setContadorParadas(int contadorParadas) {
		this.contadorParadas = contadorParadas;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	public String toString() {
		return String
				.format("******** VIAJE *******\n"
						+ "\tCódigo: %s\n\tNombre: %s\n\tHora De Salida: %s"
						+ "\n\tHora De Llegada: %s\n\tPrecio del viaje: %.2f €.\n\n"
						+ "********  PARADAS *******%s",
						this.codigo, this.nombre, horaSalida, horaLlegada,
						coste(), mostrarParadas());
	}

	private String mostrarParadas() {
		String paradas = "";
		for (int i = 0; i < this.contadorParadas; ++i)
			paradas += "\n\tParada nº " + (i + 1) + ": " + this.paradas[i];
		return paradas;
	}

	private double coste() {

		String[] llegada = this.horaLlegada.split(":");
		String[] salida = this.horaSalida.split(":");

		int llegadaHoras = Integer.parseInt(llegada[0]);
		int salidaHoras = Integer.parseInt(salida[0]);

		double precio = 0;
		precio = (llegadaHoras - salidaHoras) * 50 + this.contadorParadas * 10;
		for (int i = 0; i < this.contadorParadas; ++i) {
			if (this.paradas[i] instanceof ParadaActividad)
				precio += ((ParadaActividad) this.paradas[i]).getPrecio();
		}

		return precio;
	}

	private boolean repetida(String nombre) {
		boolean repetida = false;
		for (int i = 0; i < this.contadorParadas && !repetida; ++i) {
			if (this.paradas[i].getNombre().equalsIgnoreCase(nombre)) {
				repetida = true;
			}
		}
		return repetida;
	}

	public void añadirParada(Parada p) {

		if (!this.repetida(p.getNombre())) {
			this.paradas[this.contadorParadas] = p;
			++this.contadorParadas;
		} else
			System.out.println("La parada ya esta registrada");
	}
	private int buscarParada (String lugar){
		int indiceParada = -1;
		for(int i=0; i < this.contadorParadas; ++i){
			if(this.paradas[i].getNombre().equalsIgnoreCase(lugar)){
				indiceParada = i;
			}
		}
		
		return indiceParada;
	}
	public void quitarParada(Parada p) {
		int posicion = this.buscarParada(p.getNombre());
		
		if(posicion<0)
			System.out.println("No existe ninguna parada con ese nombre");
		else {
			this.paradas[posicion] = this.paradas[this.contadorParadas - 1];
			this.paradas[this.contadorParadas - 1] = null;
			--this.contadorParadas;
		}	
	}
	
}
