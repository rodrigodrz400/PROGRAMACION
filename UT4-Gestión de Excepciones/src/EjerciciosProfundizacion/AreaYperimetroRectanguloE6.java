package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaYperimetroRectanguloE6 {

	/*
	 * Escribe un programa que calcule el área y el perímetro de una superficie
	 * rectangular. Para ello, se pedirá el valor de los lados del rectángulo.
	 * Valida que los datos que inserta el usuario sean mayores o iguales a 0.
	 * Si no es así, se pedirá de nuevo el lado indicado incorrectamente.
	 * También se validará que el usuario inserte números y no letras. Hay que
	 * usar un método que se encargue de pedir el valor de uno de los lados.
	 */
	private static Scanner teclado;

	public static double areaRectangulo(double base, double altura) {
		double resultado = 0;

		resultado = base * altura;

		return resultado;
	}

	public static double perimetroRectangulo(double base, double altura) {
		double resultado = 0;

		resultado = ((2 * base) + (2 * altura));

		return resultado;
	}

	public static double introduceBase() throws InputMismatchException {
		teclado = new Scanner(System.in);
		double base = 0;

		System.out
				.println("Introduzca la BASE del rectángulo para calcular su área y su perímetro: ");

		try {
			base = teclado.nextDouble();
		} catch (InputMismatchException ime) {
			throw ime;
		}

		return base;
	}

	public static double introduceAltura() throws InputMismatchException  {
		teclado = new Scanner(System.in);
		double altura = 0;

		System.out
				.println("Introduzca la ALTURA del rectángulo para calcular su área y su perímetro: ");

		try {
			altura = teclado.nextDouble();
		} catch (InputMismatchException ime) {
			throw ime;
		}

		return altura;
	}

	public static void main(String[] args) {
		double base = 0;
		double altura = 0;
		boolean hayErrores = false;

		do {
			try {
				base = introduceBase();
				if (base < 0) {
					System.out
							.println("Error: el número introducido es negativo.");
					hayErrores = true;
				}else{
					hayErrores = false;
				}
			} catch (InputMismatchException ime) {
				System.out.println("ERROR: Debe introducir números y no caracteres.");
				hayErrores = true;
			}
		} while (hayErrores == true);

		
		do {
			try {
				altura= introduceAltura();
				if (altura < 0) {
					System.out
							.println("Error: el número introducido es negativo.");
					hayErrores = true;
				}else{
					hayErrores = false;
				}
			} catch (InputMismatchException ime) {
				System.out.println("ERROR: Debe introducir números y no caracteres.");
				hayErrores = true;
			}
		} while (hayErrores);
		

		System.out.println("\n-------------RESULTADO-------------");
		System.out.println("El ÁREA del rectangulo es: "
				+ areaRectangulo(base, altura));
		System.out.println("El PERÍMETRO del rectangulo es: "
				+ perimetroRectangulo(base, altura));

		teclado.close();
	}

}
