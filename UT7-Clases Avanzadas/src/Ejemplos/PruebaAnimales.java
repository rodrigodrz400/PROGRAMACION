package Ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		
		Animal miMascota  = new Animal();
		
		miMascota.comer();
		
		Perro miPerro = new Perro();
		
		miPerro.comer();
		miPerro.ladrar();
		
		Husky cañete = new Husky();
		
		cañete.ladrar();
		cañete.cerrarVentana();
		
	}

}
