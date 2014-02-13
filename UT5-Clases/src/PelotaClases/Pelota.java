package PelotaClases;

import graphics2.*;
import graphics2.Ellipse;

public class Pelota {
	int radio = 40;
	int limites;
	int color;
	int direccion;
	double posX;
	double posY;
	double ancho;
	double alto;
	int movimiento_x = (int) (Math.random()*7) -3;
	int movimiento_y = (int) (Math.random()*7) -3;
	Ellipse pelota;
	Color colorPelota;
	
	
	public void colorea(){
	   int rojo = (int)(Math.random() * 255);
       int verde = (int)(Math.random() * 255);
       int azul = (int)(Math.random() * 255);    

       colorPelota= new Color( rojo, verde, azul );
	}
	public void dibuja(){
		pelota=new Ellipse(20,20,radio,radio);
		pelota.setColor(colorPelota);
		pelota.fill();
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getLimites() {
		return limites;
	}

	public void setLimites(double posX, double posY, double ancho, double alto) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public void mueve(){
		
		
		pelota.translate(movimiento_x, movimiento_y);
		
		if(((pelota.getX()+radio)>=410 || pelota.getX()<=10)){
			movimiento_x=-movimiento_x;
		}
		if((pelota.getY()+radio)>=410 || pelota.getY()<=10){
			movimiento_y=-movimiento_y;
		}

		
	}

}
