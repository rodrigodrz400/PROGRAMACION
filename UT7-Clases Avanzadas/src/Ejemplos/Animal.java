package Ejemplos;

public class Animal extends Object{

	public String nombreCientifico;
	public String nombreComun;
	
	public Animal(){
		nombreCientifico= "desconocido";
		System.out.println("Se ha creado un animal");
	}
	
	public void comer(){
		System.out.println("Ñam, ñam");
	}
	

}
