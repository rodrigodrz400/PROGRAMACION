package Simulacro;

import java.util.Scanner;

public class E1Clave {

	public static String introducirClave() throws ClaveNoSegura {
		Scanner teclado = new Scanner(System.in);
		String clave;
		
		System.out.println("Introduzca una clave con al menos 6 caracteres: ");
		clave = teclado.next();
		if (clave.length() >= 6) {
			System.out.println("La clave se ha introducido correctamente.");
		} else {
			
			throw new ClaveNoSegura();
		}
		teclado.close();
		return clave;
	}

	public static void main(String[] args)  {
		String miClave;
		
		try{
			miClave=introducirClave();
		}catch(ClaveNoSegura cns){
			System.out.println("Clave demasiado corta");
		}
		
		
	}

}
