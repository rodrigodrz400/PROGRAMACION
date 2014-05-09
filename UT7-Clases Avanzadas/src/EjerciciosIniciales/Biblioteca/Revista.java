package EjerciciosIniciales.Biblioteca;

public class Revista extends Publicacion{
	
	//Atributos
	private int numeros;

	
	//Métodos
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	
	public String toString(){
		return super.toString() + " " + this.numeros + " números por año";
	}

}
