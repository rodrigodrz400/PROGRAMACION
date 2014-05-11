package Ejemplos;

import EjerciciosIniciales.Puntos.*;

public class PolilmorfismoPuntos {
	public static void main(String[] args) {

		PuntoP[] puntos;

		puntos = new PuntoP[3];

		puntos[0] = new PuntoP();
		puntos[1] = new PuntoP3D();
		puntos[2] = new PuntoP();

		for (int i = 0; i < 3; ++i) {
			System.out.println(puntos[i]);
		}

	}

}
