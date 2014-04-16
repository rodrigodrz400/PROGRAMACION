package Examen2evalCasa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Distancia {

	public static double distanciaPuntos(){
		Scanner teclado = new Scanner (System.in);
		double distancia = 0;
		boolean continuar = false;
		double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		
		do{
			try{
				System.out.println("Introduzca la coordenada X1 del primer punto:");
				x1= teclado.nextDouble();
				continuar=true;
			}catch(InputMismatchException e){
				System.out.println("No has introducido dos números válidos, vuelve a intentarlo.\n");
				teclado.nextLine();
				continuar=false;
			}
		}while(continuar==false);
		
		do{
			try{
				System.out.println("Introduzca la coordenada Y1 del primer punto:");
				y1= teclado.nextDouble();
				continuar=true;
			}catch(InputMismatchException e){
				System.out.println("No has introducido dos números válidos, vuelve a intentarlo.\n");
				teclado.nextLine();
				continuar=false;
			}
		}while(continuar==false);
		
		do{
			try{
				System.out.println("Introduzca la coordenada X2 del segundo punto:");
				x2= teclado.nextDouble();
				continuar=true;
			}catch(InputMismatchException e){
				System.out.println("No has introducido dos números válidos, vuelve a intentarlo.\n");
				teclado.nextLine();
				continuar=false;
			}
		}while(continuar==false);
		
		do{
			try{
				System.out.println("Introduzca la coordenada Y2 del segundo punto:");
				y2= teclado.nextDouble();
				continuar=true;
			}catch(InputMismatchException e){
				System.out.println("No has introducido dos números válidos, vuelve a intentarlo.\n");
				teclado.nextLine();
				continuar=false;
			}
		}while(continuar==false);
		
		distancia = Math.sqrt( Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		return distancia;
	}
	public static void main(String[] args) {
		
		System.out.printf("La distancia entre los dos puntos es:  %.2f", distanciaPuntos() );

	}

}
