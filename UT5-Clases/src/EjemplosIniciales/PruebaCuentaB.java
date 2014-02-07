package EjemplosIniciales;

import java.util.Scanner;

public class PruebaCuentaB {

	public static void main(String[] args) {
		CuentaB mi_cuenta, otraCuenta;
		double cantidad;
		String numeroCuenta;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte su número de cuenta: ");
		numeroCuenta= teclado.next();
		mi_cuenta = new CuentaB(numeroCuenta);
		//otraCuenta = new CuentaB("2222222222", 200);

		int opcion = 0;
		do {
			System.out.println("\n*  Menú Cuenta  *");
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
				System.out.println("Indique la cantidad de dinero que desea retirar de su cuenta: ");
				try{
					cantidad = teclado.nextDouble();
					mi_cuenta.sacar(cantidad);
				}catch(SaldoInsuficienteExcep si){
					System.out.println("Operación no permitida, el saldo de su cuenta es insuficiente.");
				}
				
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
