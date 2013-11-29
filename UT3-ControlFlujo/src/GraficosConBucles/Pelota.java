package GraficosConBucles;


import Graficos.Librerias.Graficos.*;


public class Pelota {
//dibujar una pelota
	public static void main(String[] args) throws InterruptedException {
		Ellipse pelota;
		Rectangle tablero;
		Color color;
		int movimiento_x,movimiento_y;
		
		tablero=new Rectangle(0,0,400,400);
		tablero.draw();
		pelota=new Ellipse(200,200,40,40);//x y ancho alto
		color=new Color(((int)Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));//generar un color
		//pelota.setColor(Color.LIGHT_GRAY);//elegir un color de la clase Color
		pelota.setColor(color);
		pelota.fill();
		
		//movimiento_x=7;//mueve x 4 pixeles
		//movimiento_y=8;//mueve y 4 pixeles
		
		//(int)Math.random() * (max-min)) + min
		movimiento_x= (int) (Math.random()*7) -3; //mueve entre cero y siete
		movimiento_y= (int) (Math.random()*7) -3; //mueve entre cero y siete
		if (movimiento_x == 0) movimiento_x++;
		if (movimiento_y == 0) movimiento_y++;
		
		while(true){
			pelota.translate(movimiento_x, movimiento_y);//mueve un pixel en la x y otro en la y
			if(((pelota.getX()+40)>=400 || pelota.getX()<=0)){
				movimiento_x=-movimiento_x;
			}
			if((pelota.getY()+40)>=400 || pelota.getY()<=0){
				movimiento_y=-movimiento_y;
			}
			Thread.sleep(7);//se espera 100 milisegundos
		}

	}

}
