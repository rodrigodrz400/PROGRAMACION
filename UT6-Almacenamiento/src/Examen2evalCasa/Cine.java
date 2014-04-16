package Examen2evalCasa;

import java.util.Scanner;

public class Cine {

	// Atributos
	private String nombreCine;
	private Pelicula[] peliculas;
	private int contadorPeliculas;

	// Constructores
	public Cine(String nombre, int numPeliculas) {
		this.nombreCine = nombre;
		this.peliculas = new Pelicula[numPeliculas];
	}

	// Accesadores

	public String getNombreCine() {
		return nombreCine;
	}

	public void setNombreCine(String nombreCine) {
		this.nombreCine = nombreCine;
	}

	// M�todos
	public void getPeliculas() {

		System.out.println("Hay " + contadorPeliculas
				+ " pel�culas en cartelera:)");
		for (int i = 0; i < contadorPeliculas; i++) {
			System.out.println("Taquilla: " + (i + 1) + "\t"
					+ this.peliculas[i].toString());
		}
	}

	public void addPelicula(String P) {
		Pelicula nuevaPelicula;

		nuevaPelicula = new Pelicula(P);

		peliculas[contadorPeliculas] = nuevaPelicula;
		contadorPeliculas++;

		System.out.println("La pel�cula ha sido a�adida correctamente.");
	}

	public void delPelicula(String nombre) {
		Scanner teclado = new Scanner(System.in);
		if (contadorPeliculas == 0)
			System.out.println("No hay pel�culas en la cartelera.");
		else {

			boolean encontrada = false;

			do {

				for (int i = 0; i <= contadorPeliculas - 1; ++i) {

					if (peliculas[i].getNombre().equalsIgnoreCase(nombre)) {

						encontrada = true;
						System.out.println("Se va a eliminar: "
								+ peliculas[i].getNombre());
						System.out
								.println("�Est� seguro de eliminar esta pel�cula [s/n]?");
						String respuesta = teclado.next();
						if (respuesta.equalsIgnoreCase("n")) i = contadorPeliculas - 1;
						System.arraycopy(peliculas, i + 1, peliculas, i,peliculas.length - i - 1);
						peliculas[peliculas.length - 1] = null;
						--contadorPeliculas;
						System.out.println("------Pel�cula eliminada-----");
					}
				}
				if (encontrada == false) {

					teclado.nextLine();
					System.out.println("Pel�cula no encontrada.");

				}

			} while (!encontrada);
		}
	}

}
