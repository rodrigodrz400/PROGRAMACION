package Metodos;

import java.util.Scanner;

public class Ejemplo2Aleatorio {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		int tama�o = teclado.nextInt();
		
		for (int i=0; i<tama�o;i++){
			lineaAleatorios(tama�o);
		}
		
	}
	
	public static void lineaAleatorios(int tam){
		for (int j=0; j<tam; j++)
			numeroAleatorio();
		System.out.println();
		
	}
	public static void numeroAleatorio(){
		int numero;
		numero = (int) (Math.random()*10);
		System.out.print(numero);
		
	}

}
