package EjerciciosIniciales.Biblioteca;

public class Revista extends Publicacion{
	
	//Atributos
	private int numeros;

	
	//M�todos
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	
	public String toString(){
		return super.toString() + " " + this.numeros + " n�meros por a�o";
	}

}
