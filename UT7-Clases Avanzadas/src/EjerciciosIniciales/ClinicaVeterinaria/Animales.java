package EjerciciosIniciales.ClinicaVeterinaria;

/*
 Realizar una jerarquía de clases necesaria para implementar la base de datos de una 
 clínica veterinaria (solo la parte de animales). Las clases de animales deben ser: Animal, 
 Mamífero, Perro, Gato, Reptil y Pez. De todas las mascotas se necesita saber su peso, nombre,
 fecha de nacimiento, asi como los datos del cliente (Nombre y Dirección) Tanto perros como gatos 
 tienen un nombre de raza ('Persa','American Stanford', etc.). Los perros tienen además un número
 identificador, que va en el chip, además del atributo peligroso que almacenará si el perro es 
 una raza catalogada como peligrosa o no. A los reptiles debemos además añadir como atributo 
 una lista (array) con los nombres de los animales que come, por ejemplo {'insectos','ratón'
 ,'pequeños reptiles'). Por su parte, los peces se guarda su número (en realidad la clase 
 guardará los elementos) y si son tropicales o de agua fría.
 */
public class Animales {

	private double peso;
	private String nombre;
	private String fechaNac;
	private String clienteNomb;
	private String clienteDirec;
	
	public Animales(String clienteNomb, String clienteDirec,String nombre,double peso,String fechaNac){
		this.clienteNomb=clienteNomb;
		this.clienteDirec=clienteDirec;
		this.nombre=nombre;
		this.peso=peso;
		this.fechaNac=fechaNac;
	}

	@Override
	public String toString() {
		return "Animales [peso=" + peso + ", nombre=" + nombre + ", fechaNac="
				+ fechaNac + ", clienteNomb=" + clienteNomb + ", clienteDirec="
				+ clienteDirec + "]";
	}
	
}
