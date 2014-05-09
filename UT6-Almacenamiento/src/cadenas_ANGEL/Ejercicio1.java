package cadenas;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String cadena=BuscarCaracteres.pedirCadena();
		
		String inversa=(new StringBuilder(cadena)).reverse().toString();

		
		System.out.printf("Cadena: %s\nInversa: %s\n",cadena,inversa);
		
		if (cadena.equals(inversa)) {
			System.out.println("¡Es palíndromo!");
		}
	}

}
