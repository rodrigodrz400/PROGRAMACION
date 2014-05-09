package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombres {

	public static void main(String[] args) {
		// Pedir el número de nombres, leerlos de teclado y mostrarlos
		// por orden alfabético
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nombres a leer [número]: ");
		int numNombres=teclado.nextInt();
		String []nombres;
		
		nombres=new String[numNombres];

		int  i=0;
		while (i<numNombres) {
			System.out.print("Nombre " + i + " [cadena]: ");
			nombres[i]=teclado.next();
			i++;
		}
		
		Arrays.sort(nombres);
		
		for(i=0;i<numNombres;System.out.println(nombres[i++]));
	}

}
