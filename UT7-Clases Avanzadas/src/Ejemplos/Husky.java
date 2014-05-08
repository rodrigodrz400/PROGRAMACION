package Ejemplos;

public class Husky extends Perro{
	
	boolean blanco;
	
	public void cerrarVentana(){
		System.out.println("Znnnnn");
	}

	@Override
	public void ladrar() {
		super.ladrar();
		System.out.println("Auuuuu!!");
	}
	
	

}
