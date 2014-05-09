package EjerciciosIniciales.Biblioteca;

public class PruebaE2 {

	public static void main(String[] args) {
		
		Publicacion pub;
		Revista revista;
		Libro miLibro;
		
		pub= new Publicacion();
		revista = new Revista();
		miLibro = new Libro();
		
		pub.setFecha("03/07/2012");
		pub.setEditor("Rojo Editores");
		
		revista.setEditor("Azul Editores");
		revista.setFecha("30/11/2011");
		revista.setNumeros(2);
		
		miLibro.setEditor("Azul Editores");
		miLibro.setFecha("30/11/2011");
		miLibro.setISBN("12345");
		miLibro.setAutor("A. Cañete");
		
		System.out.println("Publicación: " + pub);
		System.out.println("revista: " + revista);
		System.out.println("libro: " + miLibro);

	}

}
