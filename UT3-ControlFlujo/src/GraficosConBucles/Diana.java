package GraficosConBucles;

import Graficos.Librerias.graficos.*;

public class Diana {

	//Diana: Escribir un programa que dibuje 10 círculos concéntricos en la pantalla. 
	//Puedes utilizar Math.Random() para obtener valores de color aleatorio.
	public static void main(String[] args) throws InterruptedException {
		
		Ellipse circulos;
		double width = 550;
		double height = 550;
		double x = 0;
		double y = 0;
	
		
		for ( int i = 0; i<10; i++){
			
			//CREACION DE CIRCULOS CONCENTRICOS
			circulos = new Ellipse (x, y, width, height);
			circulos.draw();
			width -=  50;
			height -=  50;
			x += 25;
			y += 25;
			
			//GENERAR COLOR ALEATORIO
			 int rojo = (int)(Math.random() * 255);
             int verde = (int)(Math.random() * 255);
             int azul = (int)(Math.random() * 255);    
             
             //CREAR COLOR
             Color colorCirculo = new Color( rojo, verde, azul );
             
             //SELECCIONAR COLOR
             circulos.setColor(colorCirculo);
             
             //RELLENAR EL CIRCULO CON EL COLOR SELECCIONADO
             circulos.fill();
             
             //RETARDO
             Thread.sleep(1000);
		}
		
	}
}