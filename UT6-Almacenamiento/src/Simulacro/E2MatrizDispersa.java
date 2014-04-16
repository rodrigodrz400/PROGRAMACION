package Simulacro;

import java.util.Arrays;
import java.util.Scanner;

public class E2MatrizDispersa {

	public static double[][] dispersa(int orden, double tantoPorCiento) {
	
		//creo matriz
		double matriz[][] = new double[orden][orden];
		//inicializar matriz
		int  numElementos;
		
		numElementos = (int) (orden * orden * tantoPorCiento/100);
		
		for(int i=0;i<orden;i++){
			Arrays.fill(matriz[i], 0);
		}
		for(int i=0;i<numElementos;){
			int columna=aleatorio(orden-1,0);
			int fila=aleatorio(orden-1,0);
			
			if(matriz[fila][columna]==0){
				matriz[fila][columna]=Math.random();
				i++;
			}
		}
	
		return matriz;	
	}
	public static void mostrar(double[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.printf("%.2f ",matriz[i][j]);
			}
			System.out.println();
		}
	}
	private static  int aleatorio(int max,int min){
		return (int)(Math.random()*(max-min))+min;		
}
	public static void main(String[] args) {

		double[][] matriz;
		matriz = dispersa(8,25);
		
		mostrar(matriz);
	}
	


}
