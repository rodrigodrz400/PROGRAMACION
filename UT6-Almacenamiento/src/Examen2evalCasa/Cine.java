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

	// Métodos
	public void getPeliculas() {

		System.out.println("Hay " + contadorPeliculas
				+ " películas en cartelera:)");
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

		System.out.println("La película ha sido añadida correctamente.");
	}

	public void delPelicula(String nombre) {
		Scanner teclado = new Scanner(System.in);
		if (contadorPeliculas == 0)
			System.out.println("No hay películas en la cartelera.");
		else {

			boolean encontrada = false;

			do {

				for (int i = 0; i <= contadorPeliculas - 1; ++i) {

					if (peliculas[i].getNombre().equalsIgnoreCase(nombre)) {

						encontrada = true;
						System.out.println("Se va a eliminar: "
								+ peliculas[i].getNombre());
						System.out
								.println("¿Está seguro de eliminar esta película [s/n]?");
						String respuesta = teclado.next();
						if (respuesta.equalsIgnoreCase("n")) i = contadorPeliculas - 1;
						System.arraycopy(peliculas, i + 1, peliculas, i,peliculas.length - i - 1);
						peliculas[peliculas.length - 1] = null;
						--contadorPeliculas;
						System.out.println("------Película eliminada-----");
					}
				}
				if (encontrada == false) {

					teclado.nextLine();
					System.out.println("Película no encontrada.");

				}

			} while (!encontrada);
		}
	}

}
