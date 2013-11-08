//Fig. 3.14 Pruebacuenta.java
//entrada y salida de n�meros de punto flotante con objetos Cuenta

package UtilizacionObjetos;

import java.util.Scanner;

//METODOS UTILIZADOS EN LA CLASE "CUENTA"
//abonar (double ingreso)
//obtenerSaldo ()

public class PruebaCuenta {
	
	//cl m�todo main empieza la ejecuci�n de la palicaci�n java
	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta (50.00); //Crea el objeto cuenta
		Cuenta cuenta2 = new Cuenta (-7.53); //Crea el objeto cuenta
		
		System.out.println("El saldo actual en su \"Cuenta n�1\" es de : " + cuenta1.obtenerSaldo() + " Euros");
		System.out.println("El saldo actual en su \"Cuenta n�2\" es de : " + cuenta2.obtenerSaldo() + " Euros");
		
		//crea un Objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner (System.in);
		
		double ingresoDeposito; //deposita el ingreso escrito por el usuario		
		
		//CUENTA N�1
		System.out.println("Indique el Ingreso a realizar en la Cuenta n�1:"); //indicador
		ingresoDeposito= entrada.nextDouble();
		System.out.println("Sumando el valor de " + ingresoDeposito + " Euros al saldo de su cuenta n�1");
		cuenta1.abonar(ingresoDeposito);
		
		//Muestra los saldos
		System.out.println("Su saldo en la cuenta n�1 es de: " +  cuenta1.obtenerSaldo() + " Euros");
		System.out.println("Su saldo en la cuenta n�2 es de: " +  cuenta2.obtenerSaldo() + " Euros");
		
		//CUENTA N�2
		System.out.println("Indique el Ingreso a realizar en la Cuenta n�2:"); //indicador
		ingresoDeposito= entrada.nextDouble();
		System.out.println("Sumando el valor de " + ingresoDeposito + " Euros al saldo de su cuenta n�2");
		cuenta2.abonar(ingresoDeposito);
		
		//Muestra los saldos
		System.out.println("Saldo cuenta n�1: " +  cuenta1.obtenerSaldo() + " Euros");
		System.out.println("Saldo cuenta n�2 " +  cuenta2.obtenerSaldo() + " Euros");
		
	}

}
