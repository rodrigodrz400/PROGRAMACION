package EjerciciosIniciales;

import java.util.Scanner;

/*
 Crea la clase Oculto que contiene un número oculto. Cuando se crea un objeto de esta clase,
 se crea internamente un número aleatorio entre 1 y 100, o entre los números que se le pasan
 por parámetros (mínimo y máximo). Esta clase entrá el método: pruebaNumero(int n), que 
 devolverá 0 si el número es el oculto, -1 si el número oculto es menor y +1 si el número
 oculto es mayor. Utiliza esta clase para crear la aplicación Adivina el número.
 */
public class OcultoE5 {
	int maximo;
	int minimo;
	int numeroOculto;
	int numeroIntroducido;
	int numeroIntentos;

	public static void numerosMayorMenor(int numeroOculto,
			int numeroIntroducido, int numeroIntentos) {

		if (numeroOculto != numeroIntroducido) {
			if (numeroOculto > numeroIntroducido) {
				System.out
						.println("El número oculto es más grande que el que has introducido.");
			} else {
				System.out
						.println("El número oculto es más pequeño que el que has introducido.");
			}
		}
	}

	public static void compararNumeros(int numeroOculto, int numeroIntroducido,
			int numeroIntentos) {
		if (numeroOculto == numeroIntroducido) {
			System.out.println("ENHORABUENA!!! has acertado, y solo has necesitado " 
								+ (numeroIntentos -1) + " intentos." );
		} else {
			System.out.println("Llevas utilizados " + numeroIntentos
					+ " intentos");
		}
	}

	public OcultoE5(int numeroOculto) {
		this.numeroOculto = numeroOculto;
	}

	public int getNumeroOculto() {
			
		return numeroOculto;
	}

	public void setNumeroIntroducido(int numeroIntroducido) {
		this.numeroIntroducido = numeroIntroducido;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

}
