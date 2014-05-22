package Interfaces.Remunerada;

import java.util.Date;
import java.util.Scanner;

//Crea una clase Banco, que mediante un menú permita operar con una cuenta 
//y probar que tu anterior clase funciona.
public class Banco {

	private String nombre;
	
	public Banco(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		//Amblia la clase Banco para cambiar el tipo de interes y también para aplicarle los intereses.
		
		Scanner teclado =  new Scanner (System.in);
		
		Date fechaActual = new Date();
		
		Banco bancoNuevo = new Banco(" Banco Satan-der");
		
		String[] opciones = { "Estado", "Ingreso", "Reintegro","Intereses generados","Salir" };
		Menu menuBanco = new Menu(opciones, 5);

		Cuenta cuentaRodrigo = new Cuenta("Cuenta Rodrigo","12345678912345678912",3000,1.25,"20/05/2013");
		
		cuentaRodrigo.setTipoInteres(3);
		
		int respuesta;

		do {
			System.out.println("\n*  " + bancoNuevo.getNombre()+"  *");
			do {
				respuesta = menuBanco.imprimirYPreguntar();
			} while (respuesta != 1 && respuesta != 2 && respuesta != 3
					&& respuesta != 4 && respuesta != 5);

			switch (respuesta) {
			case 1:
					System.out.println(cuentaRodrigo.estado());	
					System.out.println("El tipo de interes actual es de: " 
										+ cuentaRodrigo.obtenerTipoInteres()+"%.");
				break;
			case 2:
				 System.out.println("Introduzca el importe del ingreso: ");
				 double ingreso =teclado.nextDouble();
				 cuentaRodrigo.ingreso(ingreso);
				 System.out.println(cuentaRodrigo.estado());
				break;
			case 3:
				System.out.println("Introduzca el importe del reintegro: ");
				 double reintegro =teclado.nextDouble();
				 cuentaRodrigo.reintegro(reintegro);
				 System.out.println(cuentaRodrigo.estado());
				break;
			case 4:
				System.out.println("Los intereses generados desde la fecha de apertura, "
									+ "hasta la fecha de hoy ascienden a: \nFecha de apertura:");
				int dias = cuentaRodrigo.diferenciasDeFechas(cuentaRodrigo.DeStringADate(cuentaRodrigo.getFechaApertura()),fechaActual);
				System.out.println(cuentaRodrigo.intereses(dias));
				break;
			case 5:
				System.out.println("===== Hasta pronto. ====");
			}
		} while (respuesta != 5);
		


	}

}
