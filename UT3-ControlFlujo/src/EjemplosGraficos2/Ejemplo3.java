package EjemplosGraficos2;

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Text;

import java.awt.Point;

public class Ejemplo3 {

	public static void main(String[] args) throws InterruptedException {
		  
		Ellipse circulo;
          
          circulo = new Ellipse(150,150,60,60);
          circulo.setThickness(20f);
          circulo.setColor(Color.BLUE);
          circulo.fill();
          
          Canvas c;
          
          c=Canvas.getInstance();
          
          Text coordenadas = new Text(10,10,"-");
          coordenadas.draw();
          
          circulo.fill();
          while(true) {
            Point pulsacion = c.getMousePosition();
            circulo.undraw();
            
            coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
            
            circulo =  new Ellipse(pulsacion.x-30, pulsacion.y-30, 60, 60);
            circulo.setColor(Color.BLUE);
            circulo.fill();
          
            Thread.sleep(1);
            //System.out.println("Has pulsado en: " + pulsacion.x + "-" + pulsacion.y);
            
          }
  
  }

}