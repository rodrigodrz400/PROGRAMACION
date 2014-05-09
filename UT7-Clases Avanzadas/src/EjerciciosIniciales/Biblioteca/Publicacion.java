package EjerciciosIniciales.Biblioteca;

/*
 Crea la clase Publicación, que contiene los siguientes atributos/métodos:

Atributo editor: nombre del editor.
Atributo fecha, fecha de la publicación.
Métodos setEditor/getEditor y setFecha/getFecha con la funcionalidad típica de estos atributos.
Crea la clase Revista, que heredará de Publicación. Tendrá además el atributo número, con almacena 
los números al año que publica la revista, por ejemplo 12 si es mensual. Tendrá los métodos set/get 
asociados a este atributo.

Crea la clase Libro, que heredará de Publicación. La clase Libro tiene los atributos autor e ISBN.
 Crea los métodos get/set asociados a estos atributos.

Crea una clase de prueba que cree un objeto Publicación, otro Revista y otro Libro. Da valores a 
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
