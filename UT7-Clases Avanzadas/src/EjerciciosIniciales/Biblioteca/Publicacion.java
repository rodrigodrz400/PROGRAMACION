package EjerciciosIniciales.Biblioteca;

/*
 Crea la clase Publicaci�n, que contiene los siguientes atributos/m�todos:

Atributo editor: nombre del editor.
Atributo fecha, fecha de la publicaci�n.
M�todos setEditor/getEditor y setFecha/getFecha con la funcionalidad t�pica de estos atributos.
Crea la clase Revista, que heredar� de Publicaci�n. Tendr� adem�s el atributo n�mero, con almacena 
los n�meros al a�o que publica la revista, por ejemplo 12 si es mensual. Tendr� los m�todos set/get 
asociados a este atributo.

Crea la clase Libro, que heredar� de Publicaci�n. La clase Libro tiene los atributos autor e ISBN.
 Crea los m�todos get/set asociados a estos atributos.

Crea una clase de prueba que cree un objeto Publicaci�n, otro Revista y otro Libro. Da valores a 
todos los atributos de cada uno de los objetos y posteriormente muestralos.
 */

public class Publicacion {

	//Atributos
	private String editor;
	private String fecha;
	
	
	//Metodos
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String toString(){
		return this.editor + " " + this.fecha;
	}
	
	
}
