package PelotaClases;

import graphics2.Rectangle;

public class PruebaPelota {

	public static void main(String[] args) throws InterruptedException {
		Pelota p;
		
		p = new Pelota();
		p.setLimites(10,10,410,410);
		(new Rectangle(10,10,400,400)).draw();
		//p.setPaso(5);
	    p.colorea();
		p.dibuja();
		
		while(true){
			p.mueve();
			Thread.sleep(10);
		}
	}

}
