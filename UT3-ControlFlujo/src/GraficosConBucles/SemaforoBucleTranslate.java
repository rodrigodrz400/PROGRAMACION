package GraficosConBucles;

import Graficos.Librerias.Graficos.*;


public class SemaforoBucleTranslate {

        public static void main(String[] args) throws InterruptedException {
                Rectangle caja, palo;
                Ellipse disco;
                int ancho,alto,centro_x,centro_y,radio_disco;
                
                //Inicializamos los valores de dibujo del semaforo
                ancho=150;
                alto=300;
                centro_x=300;
                centro_y=300;
                radio_disco=ancho/2;

                caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2, ancho, alto);
                caja.draw();

                palo = new Rectangle(centro_x-ancho/10, centro_y+alto/2, ancho/10*2,alto*1.5);
                palo.draw();

                palo.fill();
                disco = new Ellipse(centro_x-radio_disco/2, centro_y-radio_disco/2*3.5, radio_disco, radio_disco);
                while(true){
	               
	                disco.setColor(new Color(0, 200, 0));
	                disco.fill();
	                
	                Thread.sleep(4000);
	                
	                disco.translate(0,radio_disco/2*2.5);
	                disco.setColor(new Color(225, 225, 20));
	                
	                Thread.sleep(2000);
	                
	                disco.translate(0,radio_disco/2*2.5);
	                disco.setColor(new Color(255, 0, 0));
	                
	                Thread.sleep(4000);
	                
	                disco.translate(0, -(radio_disco/2*2.5)*2);
                }
        }


}