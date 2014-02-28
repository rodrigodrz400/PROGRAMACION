package PelotaClases;

import graphics2.Rectangle;

public class PruebaPelota_ANGEL {

	public static void multiple() throws InterruptedException {
		Pelota[] pelotas;
		
		pelotas = new Pelota[200];
				
		for(int i=0;i<pelotas.length;i++) pelotas[i]=new Pelota();
		for(Pelota p: pelotas)
			p.setLimites(10, 10, 810, 810);
		(new Rectangle(10, 10, 800, 800)).draw();
		for(Pelota p: pelotas)
			p.dibuja();
		
		while(true) {
			for(Pelota p: pelotas)
				p.mueve();
			Thread.sleep(50);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		/*Pelota p;
		
		p = new Pelota();
		
		p.setLimites(10, 10, 410, 410);
		(new Rectangle(10, 10, 400, 400)).draw();
		//p.setPaso(5);
		p.dibuja();
		
		while(true) {
			p.mueve();
			Thread.sleep(50);
		}*/
		
		multiple();
	}
}
