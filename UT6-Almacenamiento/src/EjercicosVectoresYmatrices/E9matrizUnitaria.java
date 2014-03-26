package EjercicosVectoresYmatrices;

import java.util.Scanner;

public class E9matrizUnitaria {
	/*
	 Ejercicio 9. 
	 Necesitamos crear una matriz unitaria de orden 8. Crea un método que lo haga.
	  Una matriz unitaria es aquella que tiene todos sus componentes a 0, excepto las 
	  de la diagonal principal, que están a 1.
	 */
	private static Scanner teclado;
	private static int filas;
	private static int columnas;
	
	static int[][] matrizUnitaria (int filas, int columnas){  
		teclado = new Scanner(System.in);
		int matriz[][] = new int[filas] [columnas]; 
		
		for (int i = 1 ; i <= filas ; i++){ 
            for (int j = 1 ; j <= columnas-1 ; j++){            
                if (i == j)
                   matriz[i][j]=1;
                else
                    matriz[i][j]=0;
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

		int[][] matrizUnitaria = matrizUnitaria( filas, columnas);
		
		mostrarMatriz(matrizUnitaria);

	}

}
