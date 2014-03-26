package EjercicosVectoresYmatrices;

import java.util.Scanner;

public class E7matrizEnteros {

	/* Ejercicio 7.
	 * Escribe un m�todo que reciba una matriz de enteros con la creaci�n ya
	 * hecha y que dicho m�todo se encargue, �nicamente, de cargar dicha matriz
	 * con datos que se van a insertar a traves del teclado y as� devolver dicha
	 * informaci�n al m�todo que le llam�.
	 */
	private static Scanner teclado;
	private static int filas;
	private static int columnas;
	
	public static int[][] matrizEnteros(int filas, int columnas) {
		teclado = new Scanner(System.in);
		int matriz[][] = new int[filas] [columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca un caracter para la [fila "
						+ (i+1) + " - columna " + (j+1) + "].");
				matriz[i][j] = teclado.nextInt();
			}
		}

		return matriz;
	}
	public static void definirDimension(){
		
		System.out.print("Introduzca el n�mero de filas: ");
		filas=teclado.nextInt();
		System.out.print("Introduzca el n�mero de columnas: ");
		columnas=teclado.nextInt();
		System.out.println("Ha creado una matriz "+filas+"x"+columnas+".\n");

	}
	
	public static void mostrarMatriz(int[][] enteros){
		System.out.println("Los valores introducidos son:");
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				System.out.print(enteros[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		definirDimension();

		int[][] enteros = matrizEnteros( filas, columnas);
		
		mostrarMatriz(enteros);

	}

}
