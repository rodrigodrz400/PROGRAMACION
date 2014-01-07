package Prueba131129.src;

import java.util.Scanner;

import Graficos.Librerias.Graficos.*;


public class Ej2 {

	public static void main(String[] args) throws InterruptedException {
		Rectangle tablero;
		int tama�o,num_figuras;
		int figura;
		Color[] colores={Color.GREEN,Color.RED,Color.BLACK,Color.BLUE};
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tama�o del lienzo: ");
		tama�o=input.nextInt();
		System.out.print("N�mero de figuras: ");
		num_figuras=input.nextInt();
		
		tablero=new Rectangle(0,0,tama�o,tama�o);
		tablero.draw();
		
		for(int i=0;i<num_figuras;i++){
			Thread.sleep(10); // no necesario, pero para que se vea dibujar
			figura=(int)(Math.random()*4);
			Color color = colores[(int)(Math.random()*4)];
			int ancho_figura=(int)(Math.random()*(tama�o/2));
			int x=(int)(Math.random()*(tama�o-ancho_figura));
			int y=(int)(Math.random()*(tama�o-ancho_figura));
			
			switch(figura){
				case 0:
					Rectangle cuadrado;
					cuadrado=new Rectangle(x,y,ancho_figura,ancho_figura);
					cuadrado.setColor(color);
					cuadrado.fill();
					break;
				case 1:
					Ellipse circulo;
					circulo=new Ellipse(x,y,ancho_figura,ancho_figura);
					circulo.setColor(color);
					circulo.fill();
					break;
				case 2:
					Line linea;
					linea=new Line(x+(int)(Math.random()*ancho_figura),
							y+(int)(Math.random()*ancho_figura),
							x+(int)(Math.random()*ancho_figura),
							y+(int)(Math.random()*ancho_figura));
					linea.setColor(color);
					linea.draw();
					break;
				case 3:
					Text texto;
					texto = new Text(x,y,"DAW");
					texto.setColor(color);
					int topx,topy;
					topx=x+texto.getWidth();
					topy=y+texto.getHeight();
					if (topx>tama�o) texto.translate(tama�o-topx, 0);
					if (topy>tama�o) texto.translate(tama�o-topy, 0);
					texto.draw();
					
					break;
			}
		}

	}

}
