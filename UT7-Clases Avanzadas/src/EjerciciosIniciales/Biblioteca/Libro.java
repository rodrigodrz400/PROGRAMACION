package EjerciciosIniciales.Biblioteca;

public class Libro extends Publicacion {

	//Atributos
	private String autor;
	private String ISBN;
	
	//Métodos
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String toString(){
		return this.ISBN + ": " +  super.toString() + " " + this.autor;
	}

}
