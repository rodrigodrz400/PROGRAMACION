package EjemplosIniciales;

import java.util.Scanner;

public class PruebaCuenta {

	// La cuenta tambi�n guarda en n�mero de movimientos
	//La cuenta no adminte que saques m�s del dinero que tienes
	public static void main(String[] args) {

		Cuenta mi_cuenta;
		double cantidad;
		

		Scanner teclado = new Scanner(System.in);
		mi_cuenta = new Cuenta();

		int opcion = 0;
		do {
			System.out.println("\n*  Men� Cuenta  *");
			for (int k = 0; k < 15; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" Pulse 1. Para realizar un ingreso en cuenta.");
				System.out.println(" Pulse 2. Para sacar dinero de su cuenta.");
				System.out.println(" Pulse 3. Para conocer su saldo actual. ");
				System.out.println(" Pulse 4. Para salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

			switch (opcion) {
			case 1:

				System.out.println("Indique el importe que desea ingresar en su cuenta: ");
				cantidad = teclado.nextDouble();
				mi_cuenta.ingresar(cantidad);
				break;
			case 2:
				System.out
						.println("Indique la cantidad de dinero que desea retirar de su cuenta: ");
				cantidad = teclado.nextDouble();
				mi_cuenta.sacar(cantidad);
				break;
			case 3:
				System.out.println("El saldo actual de su cuenta es: "
						+ mi_cuenta.getSaldo());
				break;

			case 4:
				System.out
						.println("---FIN DEL PROGRAMA---\nSe han realizado un total de "
								+ mi_cuenta.getNumeroMovimientos()
								+ " movimientos en su cuenta.\nGracias por su visita");
				break;
			}
		} while (opcion != 4);

		teclado.close();
	}

}
