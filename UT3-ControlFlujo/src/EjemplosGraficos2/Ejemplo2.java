package EjemplosGraficos2;

import java.awt.Point;

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

public class Ejemplo2 {

	public static void main(String[] args) {
			Rectangle cuadrado;
			
			cuadrado = new Rectangle(100,100,300,300);
			cuadrado.setThickness(20);
			cuadrado.setColor(Color.RED);
			cuadrado.draw();
			
			Ellipse circulo;
			
			circulo = new Ellipse(150,150,60,60);
			circulo.setThickness(20f);
			circulo.setColor(Color.BLUE);
			circulo.fill();
			
			
			/* Canvas.getInstance().waitMouseClick();*/
			Canvas c;
			
			c=Canvas.getInstance();
			
			c.waitMouseClick();
			
			circulo.undraw();
			
			Text coordenadas = new Text(10,10,"-");
			coordenadas.draw();
			
			circulo.fill();
			while(true) {
			  Point pulsacion = c.waitMouseClick();
			  circulo.undraw();
			  
			  coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
			  
			  circulo =  new Ellipse(pulsacion.x-30, pulsacion.y-30, 60, 60);
			  circulo.setColor(Color.BLUE);
			  circulo.fill();
			
			  System.out.println("Has pulsado en: " + pulsacion.x + "-" + pulsacion.y);
			  
			}
		

	}

}
