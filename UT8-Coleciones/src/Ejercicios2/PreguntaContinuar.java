package Ejercicios2;

import java.util.Scanner;

public class PreguntaContinuar {
	
	public static boolean quiereContinuar(String pregunta, String error) {	
		Scanner teclado = new Scanner(System.in);
		
		String respuesta;
		boolean continuar;
		boolean devuelve = false;
		
		do {			
			continuar = false;			
			
			System.out.print(pregunta);
			respuesta = teclado.next();
			
			if(respuesta.equalsIgnoreCase("s"))	devuelve = true;
			else if(respuesta.equalsIgnoreCase("n")) devuelve = false;
			else {
				System.out.println(error);
				continuar = true;
			}				
				
		} while(continuar);		
		teclado.close();
		
		
		return devuelve;	
		
	}

}
