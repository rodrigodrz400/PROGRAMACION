package EjerciciosPracticas;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Intoduzca el tamaño de la base");
		int tamaño = teclado.nextInt();
		teclado.close();
		
		for (int k=0; k<tamaño-1;k++){
			for (int i = 0; i < k+2; i++) {
				//fila i
				for (int j =0; j<tamaño -i -1; j++)
					System.out.print(" ");
				for (int j = 0; j <= i; j++)
					System.out.print("@ ");
					System.out.println();
			}	
		}
	
		
		
	}

}
