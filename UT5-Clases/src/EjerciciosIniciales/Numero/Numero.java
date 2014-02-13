package EjerciciosIniciales.Numero;
/*
 * Ejercicio 5. Realiza una clase Número que almacene un número entero y tenga las siguientes características:

	Constructor por defecto que inicializa a 0 el número interno.
	Constructor que inicializa el número interno.
	Método añade que permite sumarle un número al valor interno.
	Método resta que resta un número al valor interno.
	Método getValor. Devuelve el valor interno.
	Método getDoble. Devuelve el doble del valor interno.
	Método getTriple. Devuelve el triple del valor interno.
	Método setNumero. Inicializa de nuevo el valor interno.
 */
public class Numero {
	public int numero=0;
	
	public Numero(){
		this.numero=20;
	}
	
	public void añade(int add){
		this.numero+=add;
	}
	
	public void resta(int resta){
		this.numero-=resta;
	}

	public int getNumero() {
		return numero;
	}
	
	public int getDoble() {
		return numero*2;
	}
	
	public int getTriple() {
		return numero*3;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void main(String[] args) {
		Numero comprobar;
		comprobar=new Numero();
		
		System.out.println("Número: "+comprobar.getNumero());
		comprobar.añade(5);
		System.out.println("Añade: "+comprobar.getNumero());
		comprobar.resta(10);
		System.out.println("Resta: "+comprobar.getNumero());
		System.out.println("Doble: "+comprobar.getDoble());
		System.out.println("Triple: "+comprobar.getTriple());
		comprobar.setNumero(80);
		System.out.println("Inicializa: "+comprobar.getNumero());
		
		
	}
}
