package Ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		
		Animal miMascota  = new Animal();
		
		miMascota.comer();
		
		Perro miPerro = new Perro();
		
		miPerro.comer();
		miPerro.ladrar();
		
		Husky ca�ete = new Husky();
		
		ca�ete.ladrar();
		ca�ete.cerrarVentana();
		
	}

}
