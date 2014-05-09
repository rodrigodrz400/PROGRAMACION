package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombres2 {

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
		
		//Arrays.sort(nombres);
		for(i=0;i<numNombres-1;i++){
			String menor;
			int posMenor;
			
			menor=nombres[i];
			posMenor=i;
			for(int j=i+1;j<numNombres;j++) {
				if (menor.compareTo(nombres[j])>0) {
					menor=nombres[j];
					posMenor=j;
				}
			}
			
			String aux=nombres[i];
			nombres[i]=nombres[posMenor];
			nombres[posMenor]=aux;
		}
		
		for(i=0;i<numNombres;System.out.println(nombres[i++]));
	}

}
