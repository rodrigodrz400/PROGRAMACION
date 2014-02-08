package EjerciciosIniciales;

import java.util.Scanner;

public class GestionCocheE2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CocheE2 seatIbiza;
		
		seatIbiza= new CocheE2();
		
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.acelera(25);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.deCelera(5);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.acelera(50);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.acelera(50);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.acelera(12);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		seatIbiza.deCelera(132);
		System.out.println("La velocidad actual es: " + seatIbiza.getVelocidad()+ " Km/h");
		
		teclado.close();
	}

}
