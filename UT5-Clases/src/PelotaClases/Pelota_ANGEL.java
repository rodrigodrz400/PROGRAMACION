package PelotaClases;

import graphics2.Color;
import graphics2.Ellipse;

public class Pelota_ANGEL {
	private int dirección_x,dirección_y;
	private int min_x,max_x,min_y,max_y;
	private int radio;
	private Color color;
	private Ellipse pelota;
	
	public Pelota_ANGEL() {
		dirección_x=aleatorio(-10,10);
		dirección_y=aleatorio(-10,10);
		radio = aleatorio(20,50);
		color = new Color(aleatorio(0,255),aleatorio(0,255),aleatorio(0,255));
	}
	
	public Pelota_ANGEL(int radio){
		this.radio = radio;
		dirección_x=aleatorio(-10,10);
		dirección_y=aleatorio(-10,10);
		color = new Color(aleatorio(0,255),aleatorio(0,255),aleatorio(0,255));
	}

	public Pelota_ANGEL(int radio, Color color){
		this.radio = radio;
		this.color = color;
		dirección_x=aleatorio(-10,10);
		dirección_y=aleatorio(-10,10);
	}
	
	public Pelota_ANGEL(int radio, Color color,int dir_x, int dir_y){
		this.radio = radio;
		this.color = color;
		this.dirección_x=dir_x;
		this.dirección_y=dir_y;
	}
	
	public void setLimites(int min_x,int min_y,int max_x,int max_y) {
		this.min_x=min_x;
		this.max_x=max_x;
		this.min_y=min_y;
		this.max_y=max_y;
	}
	
	public void dibuja() {
		if (pelota==null) crearPelota();
		pelota.fill();
	}
	
	public void borra() {
		if (pelota==null) return;
		pelota.undraw();
		pelota=null;
	}
	
	public int getDirecciónX() {
		return dirección_x;
	}

	public void setDirecciónX(int dirección_x) {
		this.dirección_x = dirección_x;
	}

	public int getDirecciónY() {
		return dirección_x;
	}

	public void setDirecciónY(int dirección_x) {
		this.dirección_x = dirección_x;
	}	
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
		if (pelota!=null) {
			int x=this.getX();
			int y=this.getY();
			
			crearPelota(x,y);
			dibuja();
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		if (pelota!=null) {
			pelota.setColor(color);
		}
	}

	public int getX() {
		if (pelota==null) return 0;
		else return pelota.getX()+radio;
	}
	
	public int getY() {
		if (pelota==null) return 0;
		else return pelota.getY()+radio;
	}
	
	public void setX(int x) {
		if (pelota!=null)
			pelota.translate(x-getX(), 0);
	}
	
	public void setY(int y) {
		if (pelota!=null)
			pelota.translate(0, y-getY());
	}
	
	public void mueve() {
		if (pelota==null) crearPelota();
		if ((pelota.getX()+radio*2+dirección_x)>max_x) dirección_x=-dirección_x;
		if ((pelota.getX()+dirección_x)<min_x) dirección_x=-dirección_x;
		if ((pelota.getY()+radio*2+dirección_y)>max_y) dirección_y=-dirección_y;
		if ((pelota.getY()+dirección_y)<min_y) dirección_y=-dirección_y;
		pelota.translate(dirección_x, dirección_y);
	}
	
	private void crearPelota() {
		crearPelota(aleatorio(min_x+radio,max_x-radio),aleatorio(min_y+radio,max_y-radio));
	}
	
	private void crearPelota(int x,int y) {
		pelota = new Ellipse(x-radio,y-radio,radio*2,radio*2);
		pelota.setColor(color);
	}
	
	private int aleatorio(int min, int max) {
		// (int)(Math.random() *((max - min) + 1)) + min;
		int aleatorio;
		
		aleatorio =(int)(Math.random() *((max - min) + 1)) + min;
		
		return aleatorio;
	}
}
