package GraficosConBucles;

import Graficos.Librerias.Graficos.*;


public class CocheBucle {

	public static void main(String[] args) throws InterruptedException {
		 //Creo los elementos del coche
        //Techo
        Rectangle techo,cuerpo;
        Ellipse rueda1,rueda2;
        Line carretera;
        Text texto;
        
        techo=new Rectangle(70,155,130-70,180-155);
        techo.setColor(Color.GRAY);
        techo.fill();
        
        //Cuerpo
        cuerpo=new Rectangle(40,180,170-40,210-180);
        cuerpo.setColor(Color.BLUE);
        cuerpo.fill();

        //Ruedas
        rueda1=new Ellipse(60,210,15,15);
        rueda1.setColor(Color.BLACK);
        rueda1.fill();

        rueda2=new Ellipse(145,210,15,15);
        rueda2.setColor(Color.BLACK);
        rueda2.fill();

        //Carretera
        carretera=new Line(0,225,550,225);
        carretera.draw();
        
        texto=new Text(75,50,"Bucle coche de derecha a izquierda");
        texto.grow(50, 10);
        texto.draw();
        
        int x = 0;
		
	    for (int i=0; i>=0 ; i++ ) {
	    	
	    	while (x<35){
				 //Muevo el coche hacia la derecha
				Thread.sleep(150);
		        techo.translate(10, 0);
		        cuerpo.translate(10, 0);
		        rueda1.translate(10, 0);
		        rueda2.translate(10, 0);
	
		        x++;
	        }
	    	while (x!=1){
	    		//Muevo el coche hacia la izquierda
				Thread.sleep(150);
		        techo.translate(-10, 0);
		        cuerpo.translate(-10, 0);
		        rueda1.translate(-10, 0);
		        rueda2.translate(-10, 0);
			
		        x--;
	    	}
			 
	    }
	       
       

	}

}
