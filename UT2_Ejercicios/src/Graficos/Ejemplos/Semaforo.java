package Graficos.Ejemplos;

import Graficos.Librerias.graficos.Canvas;
import Graficos.Librerias.graficos.Color;
import Graficos.Librerias.graficos.Ellipse;
import Graficos.Librerias.graficos.Rectangle;


public class Semaforo {

	public static void main(String[] args) throws InterruptedException {

		Rectangle rectangulo;
		
		rectangulo = new Rectangle(100,100,300,600);
		rectangulo.draw();
		rectangulo.translate(10, 0);
		rectangulo.setColor(Color.GRAY);
		rectangulo.fill();
		
		rectangulo =new Rectangle (20,100,80,200);
		rectangulo.draw();
		rectangulo.translate(205, 600);
		rectangulo.setColor(Color.GRAY);
		rectangulo.fill();
		
		//Canvas.pause();
		Thread.sleep(1000);
		
	Ellipse elipse1;
		
		elipse1 = new Ellipse (210,150,100,100);
		
		elipse1.draw();
		
		elipse1.setColor(Color.RED);
		elipse1.fill();
		
		//Canvas.pause();
		Thread.sleep(1000);
		
	Ellipse elipse2;
		
		elipse2 = new Ellipse (210,350,100,100);
		
		elipse2.draw();
		
		elipse2.setColor(Color.ORANGE);
		elipse2.fill();
		
		//Canvas.pause();
		Thread.sleep(1000);
		
		
	Ellipse elipse3;
		
		elipse3 = new Ellipse (210,550,100,100);
		
		elipse3.draw();
		
		elipse3.setColor(Color.GREEN);
		elipse3.fill();
		
		//Canvas.pause();
		

		
	}

}
