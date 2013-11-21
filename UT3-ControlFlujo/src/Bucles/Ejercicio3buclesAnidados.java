package Bucles;

import java.util.Scanner;

public class Ejercicio3buclesAnidados {

	//Mejora el juego de piedra/papel/tijera haciendo dos cosas:
	//Que se compruebe lo que el usuario escribe, y si no está {"piedra","papel","tijera"} vuelva a pedir que introduzca su elección.
	//Al finalizar la partida, deberá preguntarse "¿Otra partida [s/n]?".
	//Si el usuario contesta que si, deberá volver a dejarnos jugar una nueva partida.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int aleatorio = 0 ;
		String usuario;
		String partida = "null";
		
		do{
			
				do{
					System.out.println("Introduzca una expresión para jugar a \"PIEDRA/PAPEL/TIJERA\" ");
					usuario = teclado.next();
					usuario= usuario.toLowerCase();
				}while (!(usuario.equals("piedra")|| usuario.equals("papel")||usuario.equals("tijera")));
					
						
							
						
								
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
				
				do{
					System.out.println("¿Otra partida [s/n]?");
					partida = teclado.next();
					partida = partida.toLowerCase();
				}while ( !(partida.equals("s") || partida.equals("n") ) );
						
						
						
		}while (partida.equals("s") );
		
		System.out.println("FIN DEL JUEGO");
		
		teclado.close();
	}

}

		
