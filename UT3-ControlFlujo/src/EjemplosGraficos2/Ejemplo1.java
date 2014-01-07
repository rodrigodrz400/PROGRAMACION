package EjemplosGraficos2;

import java.awt.Point;

import graphics2.*;

public class Ejemplo1 {

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
		  
		  coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
		  
		  circulo.translate(pulsacion.x-circulo.getX()-circulo.getWidth()/2,
				  pulsacion.y-circulo.getY()-circulo.getHeight()/2);
		
		  System.out.println("Has pulsado en: " + pulsacion.x + "-" + pulsacion.y);
		  
		}

	}

}








