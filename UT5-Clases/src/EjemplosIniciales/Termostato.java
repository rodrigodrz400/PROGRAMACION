package EjemplosIniciales;

import java.util.Scanner;

	public class Termostato {
	
		public enum Estados{
			ENCENDIDO, APAGADO
		}
		Estados estado;
		
	public String toString(){
		if (estado == Estados.ENCENDIDO) return "Encendido";
		else return "Apagado";
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Termostato t = new Termostato();
		
		while(true){
			System.out.println("1. Apagar");
			System.out.println("2. Encender");
			System.out.println("¿Qué hacer?");
			
			if (teclado.nextInt()==1) t.estado=Estados.APAGADO;
			else  t.estado=Estados.ENCENDIDO;
		
			System.out.println("El termostato esta: " + t);
		}
		
	}

}
