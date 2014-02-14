package EjerciciosIniciales.PruebaEjercicios;

import EjerciciosIniciales.Conversores.Peso;

public class PruebaPeso {

	public static void main(String[] args) {
		
		Peso peso = new Peso(100, "lb");

		System.out.println(peso.getPeso());
		System.out.println(peso.getLibras());
		System.out.println(peso.getLingotes());
		

	}

}
