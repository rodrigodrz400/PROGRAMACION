package Actividades_4;

import java.util.Arrays;
import java.util.Scanner;

/*
 Ejercicio 5 Imagina que quieres crear un programa que te permita organizar tus películas. 
 Crearemos una clase Película donde recogemos toda la información relacionada con un film.
  Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres),
   fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: 
   insertar, modificar, eliminar, buscar o visualizar una película.
 */
public class Pelicula {
	private String titulo;
	private String [] actores;
	private String [] directores;
	private String fechaEstreno;
	private String formato;
	

	public Pelicula(String titulo, String []actores, String []directores, String fechaEstreno, String formato){
	
		this.titulo=titulo;
		this.actores=actores;
		this.directores=directores;
		this.fechaEstreno=fechaEstreno;
		this.formato=formato;
	}
	
	//Métodos auxiliares
		public String toString() {
			
			String actores = "";

			for (int i = 0; i < actores.length(); ++i) {

				actores += getActores()[i] + "\n";

			}

			String directores = "";

			for (int i = 0; i < directores.length(); ++i) {

				directores += getDirectores()[i] + "\n";

			}
			return String.format( "Título: %s\n Actores:\n%s Directores:\n%s Fecha de estreno: %s\n Formato: %s\n", 
			             			this.getTitulo(),actores,directores,this.getFechaEstreno(),this.getFormato());
	}

	//Accesadores
	
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String[] getActores() {
			return actores;
		}

		public void setActores(String[] actores) {
			this.actores = actores;
		}

		public String[] getDirectores() {
			return directores;
		}

		public void setDirectores(String[] directores) {
			this.directores = directores;
		}

		public String getFechaEstreno() {
			return fechaEstreno;
		}

		public void setFechaEstreno(String fechaEstreno) {
			this.fechaEstreno = fechaEstreno;
		}

		public String getFormato() {
			return formato;
		}

		public void setFormato(String formato) {
			this.formato = formato;
		}

	public static void main(String[] args) {
		

	}

}
