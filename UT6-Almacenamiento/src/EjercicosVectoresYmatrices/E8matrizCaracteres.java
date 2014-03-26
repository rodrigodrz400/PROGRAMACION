package EjercicosVectoresYmatrices;

import java.util.Scanner;

public class E8matrizCaracteres {

	/*
	 Ejercicio 8. 
	 Escribe un método que reciba una matriz de caracteres con el fin de visualizar su contenido.
	 */
	
	private static Scanner teclado;
	private static int filas;
	private static int columnas;
	
	public static int[][] matrizCaracteres(int filas, int columnas) {
		teclado = new Scanner(System.in);
		int matriz[][] = new int[filas] [columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca un caracter para la [fila "
						+ (i+1) + " - columna " + (j+1) + "].");
				matriz[i][j] = teclado.next().charAt(0);
			}
		}

		return matriz;
	}
	public static void definirDimension(){
		
		System.out.print("Introduzca el número de filas: ");
		filas=teclado.nextInt();
		System.out.print("Introduzca el número de columnas: ");
		columnas=teclado.nextInt();
		System.out.println("Ha creado una matriz "+filas+"x"+columnas+".\n");

	}
	
	public static void mostrarMatriz(int[][] caracteres){
		System.out.println("Los valores introducidos son:");
		for (int i = 0; i < caracteres.length; i++) {
			for (int j = 0; j < caracteres[i].length; j++) {
				System.out.print( (char)caracteres[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		definirDimension();

		int[][] caracteres = matrizCaracteres( filas, columnas);
		
		mostrarMatriz(caracteres);

	}

}