package GraficosConBucles;
import Graficos.Librerias.graficos.Color;
import Graficos.Librerias.graficos.Ellipse;
import Graficos.Librerias.graficos.Rectangle;

public class SemaforoBucle {

	//Semaforo: El semáforo tiene un ciclo y vuelve a verde después del rojo, indefinidamente, hasta que cierre la aplicación.
	public static void main(String[] args) throws InterruptedException {
	
					Rectangle caja,palo;
					Ellipse verde,ambar,rojo,apagado = null;
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
					
					//Inicializar las variables
					
					boolean inicial = true;
					
					do {
						verde= new Ellipse (centro_x -25, centro_y -110, diametro_disco, diametro_disco);
						verde.draw();
						verde.fill();
						verde.setColor(Color.GREEN);
						Thread.sleep(1000);
						apagado = new Ellipse (centro_x -25, centro_y -110, diametro_disco, diametro_disco);
						apagado.draw();
						apagado.fill();
						apagado.setColor(Color.GRAY);
						
					
						ambar= new Ellipse (centro_x -25, centro_y-25, diametro_disco, diametro_disco);
						ambar.draw();
						ambar.fill();
						ambar.setColor(Color.ORANGE);
						Thread.sleep(1000);
						apagado = new Ellipse (centro_x -25, centro_y-25, diametro_disco, diametro_disco);
						apagado.draw();
						apagado.fill();
						apagado.setColor(Color.GRAY);
					
						rojo= new Ellipse (centro_x -25, centro_y +60, diametro_disco, diametro_disco);
						rojo.draw();
						rojo.fill();
						rojo.setColor(Color.RED);
						Thread.sleep(1000);
						apagado = new Ellipse (centro_x -25, centro_y +60, diametro_disco, diametro_disco);
						apagado.draw();
						apagado.fill();
						apagado.setColor(Color.GRAY);
						
					}while (inicial = true);
						
					

	}

}
