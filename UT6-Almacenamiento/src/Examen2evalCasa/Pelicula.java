package Examen2evalCasa;

import java.util.Arrays;

public class Pelicula {

	//Atributos
	private String nombre;
	private String [] genero;
	
	//Constructores
	public Pelicula(String nombre){
		this.nombre=nombre;
		this.genero = new String [6];
	}
	public Pelicula(){
		this.nombre="";
		this.genero = new String [6];
	}
	
	//Accesadores
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getGeneros() {
		return genero;
	}
	public void setGenero(String[] genero) {
		this.genero = genero;
	}
	
	//Método auxiliar
	@Override
	public String toString() {
		return nombre + " " +  Arrays.toString(genero);
	}
	
	
	
}
