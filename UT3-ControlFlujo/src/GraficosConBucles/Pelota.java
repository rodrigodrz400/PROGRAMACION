package GraficosConBucles;

import Graficos.Librerias.graficos.Color;
import Graficos.Librerias.graficos.Ellipse;
import Graficos.Librerias.graficos.Rectangle;

public class Pelota {

	// Crea un programa que dibuje un círculo en la pantalla. 
	//Haz que el círculo se mueva por la pantalla, rebotando en sus bordes.
	public static void main(String[] args) {
		
		//VARIABLES DE LA PELOTA
		int pelota_x = 50;
		int pelota_y = 50;
		int anchoPelota = 40;
		int altoPelota = 40;
		
		Ellipse pelota = new Ellipse (pelota_x, pelota_y, anchoPelota, altoPelota);
		
		pelota.draw();
		pelota.fill();
		pelota.setColor(Color.BLUE);
		
		//VARIABLES DE LA PANTALLA
		int pantalla_x= 25 ;
		int pantalla_y = 25;
		int anchoPantalla = 500;
		int altoPantalla = 500;
		
		
		
		Rectangle pantalla = new Rectangle (pantalla_x ,pantalla_y , anchoPantalla, altoPantalla);
		
		pantalla.draw();
		

	}

}
