package Ejemplos;

public interface Precio {
	public double recargo=1.1;
	//implicitamente cualquier atributo declarado es final en todas las clases que 
	//implementan el interface
	public double getPrecio();
	
}
