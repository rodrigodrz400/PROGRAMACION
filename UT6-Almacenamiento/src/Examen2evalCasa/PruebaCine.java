package Examen2evalCasa;

import java.util.Scanner;

public class PruebaCine {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Menu menuCine;
		Cine cinesRodrigo;

		String[] opciones = { "Añadir película", "Borrar película", "Ver películas disponibles", "Salir" };

		menuCine = new Menu(opciones, 4);
		cinesRodrigo = new Cine("Cines Rodrigo", 8);

			int respuesta;

			do {
				System.out.println("\n*  " + cinesRodrigo.getNombreCine()+"  *");
				do {
					respuesta = menuCine.imprimirYPreguntar();
				} while (respuesta != 1 && respuesta != 2 && respuesta != 3
						&& respuesta != 4);

				switch (respuesta) {
				case 1:
					System.out.println("Introduzca el nombre de la película que desea añadir:");
					String P=teclado.nextLine();
					cinesRodrigo.addPelicula(P);				
					break;
				case 2:
					 System.out.println("Introduzca el nombre de la película que desea eliminar:");
					 String nombre =teclado.nextLine();
					 cinesRodrigo.delPelicula(nombre);	
					break;
				case 3:
					cinesRodrigo.getPeliculas();
					break;
				case 4:
					System.out.println("FIN DEL PROGRAMA");
				}
			} while (respuesta != 4);
			
		}

		
		
		
		
	}

