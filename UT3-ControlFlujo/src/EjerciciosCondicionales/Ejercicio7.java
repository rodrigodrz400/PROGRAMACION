package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7 {

	
	//El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
	//Solo una ronda por ejecución.
	//para obtener un número aleatorio en Java entre 1 y 3

	//resultado = (int )(Math.random() * 3 + 1);
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int aleatorio = 0 ;
		
			System.out.println("Introduzca una expresión para jugar a \"PIEDRA/PAPEL/TIJERA\" ");
			String usuario = teclado.next();
			
		teclado.close();
			
		usuario= usuario.toLowerCase();
				
		aleatorio = (int )(Math.random() * 3 + 1);
		
		
		String Maquina = "";
		
		switch (aleatorio){
		case 1: Maquina = "piedra"; 
        break; 
        case 2: Maquina = "papel"; 
        break; 
        case 3: Maquina = "tijera"; 
        break;
		} 
		
		System.out.println( "La máquina ha elegido: " + Maquina);
		
		
		if (usuario.equals("piedra") && Maquina.equals("piedra")){
			System.out.println("El resultado es EMPATE" );
		}else if (usuario.equals("piedra") && Maquina.equals("papel")){
			System.out.println("Lo siento pero, HAS PERDIDO");
		} else if (usuario.equals("piedra") && Maquina.equals("tijera")){
			System.out.println("Enhorabuena HAS GANADO");
		
		}else if (usuario.equals("papel") && Maquina.equals("tijera")){
			System.out.println("Lo siento pero, HAS PERDIDO");
		}else if (usuario.equals("papel") && Maquina.equals("papel")){
			System.out.println("El resultado es EMPATE");
		}else if (usuario.equals("papel") && Maquina.equals("piedra")){
			System.out.println("Enhorabuena HAS GANADO");
		
		}else if (usuario.equals("tijera") && Maquina.equals("piedra")){
			System.out.println("Lo siento pero, HAS PERDIDO");
		}else if (usuario.equals("tijera") && Maquina.equals("tijera")){
			System.out.println("El resultado es EMPATE");
		}else if (usuario.equals("tijera") && Maquina.equals("papel")){
			System.out.println("Enhorabuena HAS GANADO");
		}
		
		// Otra forma
		/*
		if (usuario.equals("piedra")) {
			if (Maquina.equals("piedra")) {
				
			}
		}*/
		
		//if (usuario.equals(Maquina)) {system.out}	
		
	}

}
