package Examen5Diciembre;

public class Ejercicio1 {

	public static void main(String[] args) {

		int filas = 7;
		int contador = filas;

		System.out.println("Figura 1");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < contador; j++) {
				System.out.print("@");

			}
			System.out.println();
			contador--;
		}
		
		
	}
}