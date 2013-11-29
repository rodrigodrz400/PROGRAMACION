package GraficosConBucles;

import Graficos.Librerias.Graficos.*;


public class TableroAjedrez {

	public static void main(String[] args) {
		
		Rectangle tablero;
		int tamaño=40;
		tablero = new Rectangle (0 ,0, tamaño*8, tamaño*8);
		tablero.draw();
		
		
		for (int i=0 ; i<8 ; i++){
			for (int j=0; j<8; j++){
				if (i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
					Rectangle casilla;
					casilla = new Rectangle (j*tamaño, i*tamaño, tamaño, tamaño);
					casilla.fill();

				}
			}
		}
		
		
	}

}
