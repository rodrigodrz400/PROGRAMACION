package FigurasPantalla;

import java.util.Scanner;

public class AplicacionJava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Menu menu;
		Pantalla pantalla;
		int filas;
		int columnas;
		int tamaño;
		
		pantalla= new Pantalla(10,10);

		menu = new Menu();
		
		menu.añadirOpcion("Elegir carácter");
		menu.añadirOpcion("Cuadrado.");
		menu.añadirOpcion("Rectángulo.");
		menu.añadirOpcion("Triángulo.");
		menu.añadirOpcion("Círculo..");
		menu.añadirOpcion("Mostrar pantalla.");
		menu.añadirOpcion("Limpiar pantalla.");
		menu.añadirSalir ("Salir");
		
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
					System.out.print("Introduzca el tamaño del cuadrado: ");
					tamaño = teclado.nextInt();
					System.out.println("Ha creado una matriz  en las coordenadas: "
							+ "x:" + columnas + ", y:" + filas);
							
					
					pantalla.imprimeCuadrado(filas, columnas, tamaño);
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
