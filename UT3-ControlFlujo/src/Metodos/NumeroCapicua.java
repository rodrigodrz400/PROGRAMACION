package Metodos;

import java.util.Scanner;

public class NumeroCapicua {

	//Crea un método que nos diga si un número es capicúa (devuelve true en el caso de que lo sea y false si no lo es).
	public static void main(String[] args) {
		long numero= 0;
		String respuesta;
		Scanner teclado = new Scanner (System.in);
		
		do{
			System.out.println("Inserte un número para comprobar si es o no capicúa");
			
			numero = teclado.nextLong();
			
			 if(devuelveCapicua(numero)==true)
				 System.out.println("El número " + numero + ", SÍ es capicua.");
					else
					 System.out.println("El número " + numero + ", NO es capicua.");
			 do {
					System.out
							.println("¿Desea introducir otro numero para comprobar si es capicua? [s/n] ");
					respuesta = teclado.next();
				} while (!respuesta.equals("s") && !respuesta.equals("n"));
	 	 
		}while(respuesta.equals("s"));
		System.out.println("********FIN DE PROGRAMA********");
		teclado.close();
	}

	public static boolean devuelveCapicua(long numero){
		long numeroRestante;
		long numeroInvertido;
		long resto;

		while(numero<=0);
		 numeroRestante=numero;
		 numeroInvertido=0;
		 resto=0;
		 while(numeroRestante!=0)
			{
			 resto=numeroRestante%10;
			 numeroInvertido=numeroInvertido*10+resto;
			 numeroRestante=numeroRestante/10;		 		 
			}
		 if(numeroInvertido==numero){
			 return true; 
		 }else{
			 return false; 
		 }
	
	}
}
