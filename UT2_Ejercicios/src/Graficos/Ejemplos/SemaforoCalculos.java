package Graficos.Ejemplos;


import Graficos.Librerias.graficos.Color;
import Graficos.Librerias.graficos.Ellipse;
import Graficos.Librerias.graficos.Rectangle;

public class SemaforoCalculos {
		

		public static void main(String[] args) {
			Rectangle caja,palo;
			Ellipse verde,ambar,rojo;
			int ancho, alto, centro_x,centro_y, diametro_disco; 
			
			//Inicializamos los valores de dibujo del semaforo
			ancho= 100;
			alto= 300;
			centro_x =300;
			centro_y =300;
			diametro_disco = ancho/2;
			
			caja = new Rectangle (centro_x - ancho/2, centro_y - alto/2, ancho, alto);
			caja.draw();
			caja.fill();
			caja.setColor(Color.GRAY);
			
			palo = new Rectangle (centro_x - ancho/10, centro_y + alto/2, ancho/5, alto);
			palo.draw();
			palo.fill();
			palo.setColor(Color.GRAY);
			
			verde= new Ellipse (centro_x -25, centro_y -110, diametro_disco, diametro_disco);
			verde.draw();
			verde.fill();
			verde.setColor(Color.GREEN);
			
			ambar= new Ellipse (centro_x -25, centro_y-25, diametro_disco, diametro_disco);
			ambar.draw();
			ambar.fill();
			ambar.setColor(Color.ORANGE);
			
			rojo= new Ellipse (centro_x -25, centro_y +60, diametro_disco, diametro_disco);
			rojo.draw();
			rojo.fill();
			rojo.setColor(Color.RED);
			
			
			/*
			caja = new Rectangle(10,10,60,100);
			caja.draw();
			
			palo = new Rectangle(30,120,5,100);
			palo.draw();
			
			palo.fill();
			
			verde=new Ellipse(35,80,20,20);
			verde.setColor(new Color(0,200,0));
			ambar=new Ellipse(35,55,20,20);
			ambar.setColor(new Color(255,255,0));
			rojo=new Ellipse(35,30,20,20);
			rojo.setColor(new Color(255,0,0));

			verde.fill();
			ambar.fill();
			rojo.fill(); 
			*/
		}

	}
