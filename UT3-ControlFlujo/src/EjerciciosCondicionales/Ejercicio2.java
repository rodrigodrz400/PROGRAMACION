package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio2 {

	
	//Crea un programa que tiene una palabra oculta. El programa pregunta la contraseña al jugador, 
	//si la adivina muestra un mensaje de éxito. Si no, muestra el error.

	public static void main(String[] args) {

		String palabraOculta = "programacion";
		
		
		Scanner teclado = new Scanner(System.in);
		
		 
		
		System.out.println("----ADIVINA LA PALABRA OCULTA----");
		System.out.println("Escriba una palabra: ");
		String palabraUsuario = teclado.next();
		
		teclado.close();
			
		palabraUsuario= palabraUsuario.toLowerCase();
		//if (dia.equals("lunes")
		
		if (palabraUsuario.equals("programacion")){
			System.out.println("!ENORABUENA!, ha descubierto la palabra oculta " + "(la palabra oculta era: \"" + palabraOculta +  "\")");
		}else{
			System.out.println("No ha conseguido adivinar la palabra oculta, por favor siga intentandolo " );
		}
		
		
		
	}

}
