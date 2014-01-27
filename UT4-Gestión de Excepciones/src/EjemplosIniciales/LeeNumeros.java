package EjemplosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeeNumeros {
	
	static Scanner teclado;

	public static float leerFloat() throws NumeroNegativo{//Se captura el error en el método y lo trata directamente sin propagarlo
		float leido = 0;
		
		try{
			leido= teclado.nextFloat();
			if (leido<0) 
				throw new NumeroNegativo();
		}catch (NullPointerException e){
			System.out.println("Error, Scanner no inicializado");
			throw e;
		}catch (InputMismatchException e){
			System.out.println("Error, no es un float");
			throw e;
		}
		
		return leido;
	}
	public static void main(String[] args) {
		float numero = 0;
		boolean continuar = true;
		
		teclado = new Scanner(System.in);
		
		try{
			do{
				try{
					numero= leerFloat();
				}catch (NumeroNegativo e){
					continuar= false;;
				}
				System.out.println(numero);
			}while(continuar);
		}catch (NullPointerException e){
			System.out.println("No se puedo terminar el programa correctamente");
		}catch (InputMismatchException e){
			System.out.println("No puedes introducir caracteres.");
		}
		
	}

}
