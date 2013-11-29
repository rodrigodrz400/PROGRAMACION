package Arrays;

import Graficos.Librerias.Graficos.*;


public class DianaArrays {

	public static void main(String[] args) {
		Color[] colores;
		int centro_x=200,centro_y=200;
		int distancia=15;
		int anterior = -1;
		
		colores=new Color[5];
		
		colores[0]=new Color(255,0,0);
		colores[1]=Color.CYAN;
		colores[2]=Color.DARK_GRAY;
		colores[3]=Color.YELLOW;
		colores[4]=Color.BLACK;
		
		for(int i=10;i>0;i--){
			Ellipse circulo;
			int color_actual=0;
			
			circulo=new Ellipse(centro_x-i*distancia,centro_y-i*distancia,distancia*i*2,distancia*i*2);
			do{
				color_actual=(int)(Math.random()*5);
			}while(anterior==color_actual);
			circulo.setColor(colores[color_actual]);
			anterior=color_actual;
			
			circulo.fill();
		}

	}

}

