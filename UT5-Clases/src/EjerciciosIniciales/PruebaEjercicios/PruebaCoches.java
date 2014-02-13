package EjerciciosIniciales.PruebaEjercicios;

import EjerciciosIniciales.ConcesionarioCoches.Coche;

public class PruebaCoches {

	public static void main(String[] args) {
		
		Coche coche1;
		Coche coche2;
		
		coche1 = new Coche();
		System.out.println(coche1.getMarca()+ " " +coche1.getModelo());
		
		coche2 = new Coche("Audi", "A3");
		System.out.println(coche2.getMarca()+ " " +coche2.getModelo());
		
	}

}
