package SimulacroExamen;

import Graficos.Librerias.Graficos.*;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		//pedir dos números por consola
		Scanner teclado = new Scanner (System.in);
		
		int tamañoLienzo=0;
		int numeroFiguras=0;
		Rectangle tablero;
		
		System.out.println("Introduzca el tamaño del lienzo:");
		tamañoLienzo = teclado.nextInt();
		System.out.println("Introduzca el número de figuras que quiere dibujar:");
		numeroFiguras = teclado.nextInt();

			//uno tamaño del lienzo
		tablero=new Rectangle(0,0,tamañoLienzo,tamañoLienzo);
		tablero.draw();
		
			//numero de figuras dentro
		Rectangle cuadrado;
		Ellipse circulo;
		Text texto;
		Line linea;
	
				
		do{
			int aleatorio = (int )((Math.random() * numeroFiguras) + 1);
			
			int ancho= (int) (Math.random()* tamañoLienzo);
			int alto= (int) (Math.random()* tamañoLienzo);
			int centro_x=(int) (Math.random()* (tamañoLienzo-ancho)/2);
			int centro_y=(int) (Math.random()* (tamañoLienzo-alto)/2);
			int linea_x=(int) (Math.random()* (tamañoLienzo-ancho));
			int linea_y=(int) (Math.random()* (tamañoLienzo-ancho));
			int radio_disco=(int) (Math.random()* (ancho/2));
			
			switch (aleatorio){
			case 1: 
				cuadrado = new Rectangle (centro_x,centro_y,ancho,alto);
				cuadrado.fill();
				numeroFiguras--;
				Color colorCuadrado = new Color(((int)Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));//generar un color
				cuadrado.setColor(colorCuadrado);
				cuadrado.fill();
				break;
	        
			case 2:
	        	circulo = new Ellipse (centro_x, centro_y, radio_disco, radio_disco);
	        	circulo.fill();
	        	numeroFiguras--;
	        	Color colorCirculo = new Color(((int)Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));//generar un color
				circulo.setColor(colorCirculo);
	        	circulo.fill();
	        	
	        	break;
	       
			case 3:
	        	texto= new Text(centro_x,centro_y,"DAW");
	        	texto.draw();
	        	numeroFiguras--;
	        	
	        	break;
	       
			case 4:
	        	linea = new Line(centro_x, centro_y, linea_x, linea_y);
	        	linea.draw();
	        	numeroFiguras--;
	        	
	        	break;
			}
		}while (numeroFiguras>=0);
	
		
	}

}
