package EjerciciosIniciales;

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numeroOculto = 0;
		int numeroIntroducido = 0;
		int numeroIntentos = 0;
		int numeroOcultoR;
		int numeroOcultoP;
		int maximo = 0;
		int minimo = 0;

		int opcion = 0;
		do {
			System.out.println("\n*  Adivina el número oculto  *");
			numeroIntentos = 0;
			for (int k = 0; k < 31; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out
						.println(" Pulse 1. Para jugar con un número aleatorio entre 1 y 100");
				System.out
						.println(" Pulse 2. Para jugar con un número comprendido entre unos valores,"
								+ "máximos y mínimos introducidos por usted.");
				System.out.println(" Pulse 3. Para salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3);

			OcultoE5 juego1 = new OcultoE5(numeroOculto);

			switch (opcion) {
			case 1:
				numeroOcultoR = (int) (Math.random() * 100 + 1);
				numeroOculto = numeroOcultoR;
				juego1.getNumeroOculto();
				System.out.println("(El número oculto es: " + numeroOculto+ " )");
				System.out
						.println("Dime un número del 1 al 100, a ver si aciertas el número oculto: ");

				break;
			case 2:
				System.out.println("Introduzca un valor máximo.");
				maximo = teclado.nextInt();
				System.out.println("Introduzca un valor mínimo:");
				minimo = teclado.nextInt();
				numeroOcultoP = (int) (Math.random() * maximo + minimo);
				numeroOculto = numeroOcultoP;
				juego1.getNumeroOculto();
				System.out.println("(El número oculto es: " + numeroOculto+ " )");
				System.out.println("Dime un número del " + minimo + " al "
						+ maximo + ", a ver si aciertas el número oculto: ");

				break;
			case 3:
				System.out.println("---FIN DEL PROGRAMA---\n"
						+ " Gracias por jugar al juego del \"Numero Oculto\".");
				break;
			}

			for (int i = 1; i <= 100 && numeroOculto != numeroIntroducido; i++) {

				numeroIntroducido = teclado.nextInt();
				numeroIntentos++;

				OcultoE5.numerosMayorMenor(numeroOculto, numeroIntroducido,
						numeroIntentos);
				OcultoE5.compararNumeros(numeroOculto, numeroIntroducido,
						numeroIntentos);

				for (int j = 0; j < 61; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} while (opcion != 3);

		teclado.close();
	}

}
