package GraficosConBucles;

import Graficos.Librerias.Graficos.*;


public class TableroAjedrez {

	public static void main(String[] args) {
		
		Rectangle tablero;
		int tama�o=40;
		tablero = new Rectangle (0 ,0, tama�o*8, tama�o*8);
		tablero.draw();
		
		
		for (int i=0 ; i<8 ; i++){
			for (int j=0; j<8; j++){
				if (i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
					Rectangle casilla;
					casilla = new Rectangle (j*tama�o, i*tama�o, tama�o, tama�o);
					casilla.fill();

				}
			}
		}
		
		
	}

}
