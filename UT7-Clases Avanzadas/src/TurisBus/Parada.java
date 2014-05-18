package TurisBus;
/*
 Parada, que almacena los tipos de parada:
Almacena el nombre de la ciudad o lugar, hora de bajada y hora de salida.
Las paradas son libres o guiádas, en el caso de que se deje a los viajeros visitar 
libremente el lugar o se les dirija mediante una actividad (visita guiada, ruta, actuación, etc.).
 Para solucionar esto debe utilizarse la herencia y crear estas dos subclases de Parada:
ParadaLibre: no contiene ningún dato extra.
ParadaActividad: contienen el nombre de la actividad a realizar y su precio, que puede ser cero.
 */
public class Parada {

	private String nombreLugar;
	private String horaBajada;
	private String horaSalida;
	
	public Parada(String nombre, String horaBajada, String horaSalida) {
		this.nombreLugar = nombre;
		this.horaBajada = horaBajada;
		this.horaSalida = horaSalida;
	}

	public String getNombre() {
		return nombreLugar;
	}

	public void setNombre(String nombre) {
		this.nombreLugar = nombre;
	}

	public String getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(String horaBajada) {
		this.horaBajada = horaBajada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public String toString() {
		return String.format("\tNombre del lugar: %s\n\t\tHora de bajada: %s\n\t\tHora de salida: %s\n", 
				              this.nombreLugar, this.horaBajada, this.horaSalida);				
	}
	
}
