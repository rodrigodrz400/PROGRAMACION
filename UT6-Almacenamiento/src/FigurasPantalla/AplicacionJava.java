package FigurasPantalla;

import java.util.Scanner;

public class AplicacionJava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Menu menu;
		Pantalla pantalla;
		int filas;
		int columnas;
		int tama�o;
		
		pantalla= new Pantalla(10,10);

		menu = new Menu();
		
		menu.a�adirOpcion("Elegir car�cter");
		menu.a�adirOpcion("Cuadrado.");
		menu.a�adirOpcion("Rect�ngulo.");
		menu.a�adirOpcion("Tri�ngulo.");
		menu.a�adirOpcion("C�rculo..");
		menu.a�adirOpcion("Mostrar pantalla.");
		menu.a�adirOpcion("Limpiar pantalla.");
		menu.a�adirSalir ("Salir");
		
		menu.mostarMenu();
		
		while(menu.obtenerOpcionElegidaUsuario() !=0){

			
			switch(menu.getOpcion()){
			case 1: 
					System.out.println("Introduzca el caracter con el cual se imprimira la figura: ");
					pantalla.setCaracter(teclado.next().charAt(0));
					System.out.print("\n");
					break;
					
			case 2: 
					System.out.print("Introduzca el comienzo de fila: ");
					filas = teclado.nextInt();
					System.out.print("Introduzca el comienzo de columna: ");
					columnas = teclado.nextInt();
					System.out.print("Introduzca el tama�o del cuadrado: ");
					tama�o = teclado.nextInt();
					System.out.println("Ha creado una matriz  en las coordenadas: "
							+ "x:" + columnas + ", y:" + filas);
							
					
					pantalla.imprimeCuadrado(filas, columnas, tama�o);
					pantalla.imprimir();
					System.out.print("\n");
					break;
			case 7: 
					pantalla.inicializarPantalla();
					pantalla.imprimir();
					System.out.print("\n");
					break;
			}

			menu.mostarMenu();
			System.out.print("\n");
		}
		

	}

}
