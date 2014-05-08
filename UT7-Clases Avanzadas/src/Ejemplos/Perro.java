package Ejemplos;

public class Perro extends Animal{

	
	public Perro(){
		this.nombreCientifico= "Canis lupus familiaris";
		System.out.println("Ha nacido un nuevo " + this.nombreCientifico);
	}
	
	public void ladrar(){
		System.out.println("Guau, guau");
	}
	
}
