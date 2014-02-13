package EjerciciosIniciales.Numero;
/*
 * Ejercicio 5. Realiza una clase N�mero que almacene un n�mero entero y tenga las siguientes caracter�sticas:

	Constructor por defecto que inicializa a 0 el n�mero interno.
	Constructor que inicializa el n�mero interno.
	M�todo a�ade que permite sumarle un n�mero al valor interno.
	M�todo resta que resta un n�mero al valor interno.
	M�todo getValor. Devuelve el valor interno.
	M�todo getDoble. Devuelve el doble del valor interno.
	M�todo getTriple. Devuelve el triple del valor interno.
	M�todo setNumero. Inicializa de nuevo el valor interno.
 */
public class Numero {
	public int numero=0;
	
	public Numero(){
		this.numero=20;
	}
	
	public void a�ade(int add){
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
		
		System.out.println("N�mero: "+comprobar.getNumero());
		comprobar.a�ade(5);
		System.out.println("A�ade: "+comprobar.getNumero());
		comprobar.resta(10);
		System.out.println("Resta: "+comprobar.getNumero());
		System.out.println("Doble: "+comprobar.getDoble());
		System.out.println("Triple: "+comprobar.getTriple());
		comprobar.setNumero(80);
		System.out.println("Inicializa: "+comprobar.getNumero());
		
		
	}
}
