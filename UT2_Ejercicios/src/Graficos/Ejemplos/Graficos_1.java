package Graficos.Ejemplos;

import Graficos.Librerias.graficos.Canvas;
import Graficos.Librerias.graficos.Color;
import Graficos.Librerias.graficos.Rectangle;



public class Graficos_1 {

	public static void main(String[] args) {

		Rectangle rectangulo;
		
		rectangulo = new Rectangle(10,10,50,100);
		
		rectangulo.draw();
		
		Canvas.pause();
		
		rectangulo.translate(250, 0);
		
		rectangulo.setColor(Color.ORANGE);
		rectangulo.fill();
		
		Canvas.pause();
		
		Color gris;
		
		
		gris=new Color(200,200,200);
		
		rectangulo.setColor(gris);
		
		
	}

}
