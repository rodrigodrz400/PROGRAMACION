package EjerciciosPracticas;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Intoduzca el tama�o de la base");
		int tama�o = teclado.nextInt();
		teclado.close();
		
		for (int k=0; k<tama�o-1;k++){
			for (int i = 0; i < k+2; i++) {
				//fila i
				for (int j =0; j<tama�o -i -1; j++)
					System.out.print(" ");
				for (int j = 0; j <= i; j++)
					System.out.print("@ ");
					System.out.println();
			}	
		}
	
		
		
	}

}
