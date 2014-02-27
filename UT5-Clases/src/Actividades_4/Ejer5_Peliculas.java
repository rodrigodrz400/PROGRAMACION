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
public class Ejer5_Peliculas {
	private String titulo;
	private static String [] actores;
	private String [] directores;
	private String fechaEstreno;
	private String genero;
	private int codigo = 0;
	private int numeroPeliculas =0;
	
	public Ejer5_Peliculas(String titulo, String []actores, String []directores, String fechaEstreno, String formato, String genero){
		
		
		actores = new String [15];
		directores = new String [15];
		
		this.titulo=titulo;
		for(int i=0; i < actores.length; ++i){
			this.actores[i]=actores[15];}
		for(int j=0; j < actores.length; ++j){
			this.directores[j]=directores[15];}
		this.fechaEstreno=fechaEstreno;
		this.genero=genero;
		codigo = numeroPeliculas +1;
		numeroPeliculas++;
		 
		
	}
	//Métodos auxiliares
	@Override
	public String toString() {
		return "Ejer5_Peliculas [titulo=" + titulo + ", actores="
				+ Arrays.toString(actores) + ", directores="
				+ Arrays.toString(directores) + ", fechaEstreno="
				+ fechaEstreno + ", genero=" + genero + ", codigo=" + codigo
				+ ", numeroPeliculas=" + numeroPeliculas + "]";
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


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getNumeroPeliculas() {
		return numeroPeliculas;
	}


	public void setNumeroPeliculas(int numeroPeliculas) {
		this.numeroPeliculas = numeroPeliculas;
	}


	public static void main(String[] args) {
		//Scanner teclado = new Scanner (System.in);
		Ejer5_Peliculas pelicula1;
		
		
		String actores1[]={"Nicole Kidman", 

			                "Alakina Mann", 
			
			                "James Bentley",
			
			                "Christopher Eccleston", 
			
			                "Fionnula Flanagan"};
		
		pelicula1.setActores(actores1);
		
		String directores1[]={"Alejandro Amenábar",
				
							   "José Luis Cuerda",
							   
							   "Eduardo Chapero-Jackson",
							   
							   "Miguel Ángel González"};
		
		pelicula1.setDirectores(directores1);
						
		pelicula1 = new Ejer5_Peliculas("Los Otros",actores, directores,"2001","Suspense / Terror", "2001");
		System.out.println(pelicula1.toString());

	}

}
