package Arrays;

import Graficos.Librerias.Graficos.*;



public class ColoresAleatorios {

	public static void main(String[] args) throws InterruptedException {
		
		Color[] colores;
		//Color[] colores ={new Color (255,0,0), Color.CYAN, Color.GREEN, Color.YELLOW,new Color (125,255,0)}
		
		colores = new Color[5];
		
		colores [0] = new Color (255,0,0);
		colores [1] = Color.CYAN;
		colores [2] = Color.GREEN; 
		colores [3] = Color.YELLOW; 
		colores [4] = new Color (125,255,0);
		
		Ellipse circulo = new Ellipse(100,100,300,300);
		while(true){
			circulo.setColor(colores[(int) (Math.random()*5)]);
			circulo.fill();
			Thread.sleep(500);
		}
		
		
		
		
	}

}
