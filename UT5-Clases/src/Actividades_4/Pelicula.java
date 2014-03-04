package Actividades_4;

import java.util.Scanner;

/*
 Ejercicio 5 Imagina que quieres crear un programa que te permita organizar tus películas. 
 Crearemos una clase Película donde recogemos toda la información relacionada con un film.
  Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres),
   fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: 
   insertar, modificar, eliminar, buscar o visualizar una película.
 */
public class Pelicula {
	private String titulo;
	private String [] actores;
	private String [] directores;
	private String fechaEstreno;
	private String formato;
	

	public Pelicula(String titulo, String []actores, String []directores, String fechaEstreno, String formato){
	
		this.titulo=titulo;
		this.actores=actores;
		this.directores=directores;
		this.fechaEstreno=fechaEstreno;
		this.formato=formato;
	}
	
	//Métodos auxiliares
		public String visualizar() {
			
			 String actores = "";

			for (int i = 0; i < actores.length(); ++i) {

				actores += getActores()[i] + "\n";

			}

			String directores = "";

			for (int i = 0; i < directores.length(); ++i) {

				directores += getDirectores()[i] + "\n";

			}
			 
			
			return String.format( "Título: %s\n Actores:\n%s Directores:\n%s Fecha de estreno: %s\n Formato: %s\n", 
			             			this.getTitulo(),actores,directores,this.getFechaEstreno(),this.getFormato());
	}

	//Accesadores
	
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String[] getActores() {
			return actores;
		}

		public void setActores(String[] actores) {
			this.actores = actores;
		}

		public String[] getDirectores() {
			return directores;
		}

		public void setDirectores(String[] directores) {
			this.directores = directores;
		}

		public String getFechaEstreno() {
			return fechaEstreno;
		}

		public void setFechaEstreno(String fechaEstreno) {
			this.fechaEstreno = fechaEstreno;
		}

		public String getFormato() {
			return formato;
		}

		public void setFormato(String formato) {
			this.formato = formato;
		}
		//Filmoteca	
			public static int contadorPeliculas = 0;
			public static Pelicula[] peliculas = new Pelicula[100];
			public static Scanner teclado;
			
			
			public static void menuPrincipal() {
				
				boolean finalizar = false;
				
				System.out.println("==== BIENVENIDO A FILMOTECA 1.0 ====");
				
				do {	
					
					System.out.println("Elija una opción:");
					System.out.println("1.Añadir una película");
					System.out.println("2.Modificar una película");
					System.out.println("3.Eliminar una película");
					System.out.println("4.Buscar una película");
					System.out.println("5.Visualizar una película");
					System.out.println("6.Salir");
					
					int opcion = teclado.nextInt();
					
					switch (opcion) {
					case 1: añadir(); break;
					case 2: modificar(); break;
					case 3: eliminar(); break;
					case 4: buscar(); break;
					case 5: mostrar(); break;
					case 6: break;				
					}
					
					System.out.print("Desea realizar alguna otra operación[s/n]");
					String respuesta = teclado.next();
					if(respuesta.equalsIgnoreCase("n")) finalizar = true;
					
				} while (!finalizar);
				
				System.out.println("---------Gracias por utilizar FILMOTECA 1.0-----------");
			}
			
			public static void añadir() {
				
				System.out.print("Introduzca el Título: ");
				String titulo = teclado.next();
				
				System.out.print("Introduzca el nº de actores: ");
				int numActores = teclado.nextInt();
				String[] actores = new String[numActores];
				for (int i = 0; i<actores.length;++i) {
					System.out.printf("Introduzca nombre del actor nº %d: ",(i+1));
					actores[i] = teclado.next();
				}
				
				System.out.print("Introduzca el nº de directores: ");
				int numDirectores = teclado.nextInt();
				String[] directores = new String[numDirectores];
				for (int i = 0; i<directores.length;++i) {
					System.out.printf("Introduzca nombre del director nº %d: ",(i+1));
					directores[i] = teclado.next();
				}
				
				System.out.print("Introduzca la fecha de estreno: ");
				String fechaEstreno = teclado.next();
				System.out.print("Introduzca formato: ");
				String formato = teclado.next();	
				
				peliculas[contadorPeliculas] = new Pelicula(titulo,actores,directores,fechaEstreno,formato);
				++contadorPeliculas;
				
			}
			
			public static void modificar() {
				
				if(contadorPeliculas == 0) System.out.println("No hay películas en la filmoteca");
				else {
					
					boolean encontrada = false;
					
					System.out.println("Introduzca el título de la película: ");
					String titulo = teclado.next();
					
			        do {
			        	
						for ( int i = 0; i <= contadorPeliculas - 1; ++i ) {
							
							if(peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
								
								encontrada = true;
								
								System.out.println("Introduzca los parámetros que quiere modificar: ");
								System.out.println("1.Título");
								System.out.println("2.Actores");
								System.out.println("3.Directores");
								System.out.println("4.Fecha de estreno");
								System.out.println("5.Formato");
								System.out.println("6.Salir");
								
								int opcion = teclado.nextInt();
								
								switch (opcion) {
								
								case 1: System.out.println("Título actual: " + peliculas[i].getTitulo());
										System.out.println("Introduzca nuevo título: ");
										titulo = teclado.next();
										peliculas[i].setTitulo(titulo);
										System.out.println("------Título modificado-----");
										break;
										
								case 2: String[] actores = new String[peliculas[i].getActores().length];
										
										for ( int j = 0; j < peliculas[i].getActores().length; ++j ) {
											
											System.out.println("Actor actual: " + peliculas[i].getActores()[j]);
											System.out.println("Introduzca nuevo nombre: ");
											actores[j] = teclado.next();							
									
										}
										
										peliculas[i].setActores(actores);
										System.out.println("------Actores modificados-----");
										break;
								case 3: String[] directores = new String[peliculas[i].getDirectores().length];
								
										for ( int j = 0; j < peliculas[i].getDirectores().length; ++j ) {
									
											System.out.println("Director actual: " + peliculas[i].getDirectores()[j]);
											System.out.println("Introduzca nuevo nombre: ");
											directores[j] = teclado.next();					
										}
								
										peliculas[i].setDirectores(directores);
										System.out.println("------Directores modificados-----");
										break;
										
								case 4: System.out.println("Fecha estreno actual: " + peliculas[i].getFechaEstreno());
										System.out.println("Introduzca nueva fecha: ");
										String fecha = teclado.next();
										peliculas[i].setFechaEstreno(fecha);
										System.out.println("------Fecha modificada-----");
										break;
										
								case 5: System.out.println("Formato actual: " + peliculas[i].getFormato());
										System.out.println("Introduzca nuevo formato: ");
										String formato = teclado.next();
										peliculas[i].setFormato(formato);
										System.out.println("------Formato modificado-----");
										break;
								case 6: i = contadorPeliculas - 1;
										
								}
								
							} else {
								
								teclado.nextLine();
								
								System.out.println("Película no encontrada.");
								encontrada = true;
								
							}
						}
			        	
			        	
			        } while (!encontrada);		
				}	
				
			}
			
			public static void eliminar() {
				
				if(contadorPeliculas == 0) System.out.println("No hay películas en la filmoteca.");
				else {
					
					boolean encontrada = false;
					
					System.out.println("Introduzca el título de la película: ");
					String titulo = teclado.next();
					
			        do {
			        	
						for ( int i = 0; i <= contadorPeliculas - 1; ++i ) {
							
							if(peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
								
								encontrada = true;
								System.out.println("Se va a eliminar: " + peliculas[i].getTitulo());
								System.out.println("¿Está seguro de eliminar esta película [s/n]?");
								String respuesta = teclado.next();
								if(respuesta.equalsIgnoreCase("n")) i = contadorPeliculas - 1;
								peliculas[i] = null;
								--contadorPeliculas;
								System.out.println("------Película eliminada-----");			
								
							} else {
								
								teclado.nextLine();						
								System.out.println("Película no encontrada.");	
								encontrada = true;
							}
						}	        	
			        	
			        } while (!encontrada);		
				}		
			}
			
			public static void buscar() {
				
				if(contadorPeliculas == 0) System.out.println("No hay películas en la filmoteca.");
				else {
					
					boolean encontrada = false;
					
					System.out.println("Introduzca el título de la película: ");
					String titulo = teclado.next();
					
			        do {
			        	
						for ( int i = 0; i <= contadorPeliculas - 1; ++i ) {
							
							if(peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
								
								encontrada = true;
								System.out.println("Se ha encontrado la película en el archivo nº " + i);
								System.out.println("¿Desea visualizar su contenido [s/n]?");
								String respuesta = teclado.next();
								if(respuesta.equalsIgnoreCase("n")) i = contadorPeliculas - 1;
								else System.out.println(peliculas[i].visualizar());			
								
							} else {
								
								teclado.nextLine();
								System.out.println("Película no encontrada.");
								encontrada = true;
							}
						}	        	
			        	
			        } while (!encontrada);		
				}		
			}
			
			public static void mostrar() {
				
				if(contadorPeliculas == 0) System.out.println("No hay películas en la filmoteca.");
				else {
					
					boolean encontrada = false;
					
					System.out.println("Introduzca el título de la película: ");
					String titulo = teclado.next();
					
			        do {
			        	
						for ( int i = 0; i <= contadorPeliculas - 1; ++i ) {
							
							if(peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
								
								encontrada = true;						
								System.out.println(peliculas[i].visualizar());			
								
							} else {
								
								teclado.nextLine();						
								System.out.println("Película no encontrada.");
								encontrada = true;
							
							}
						}	        	
			        	
			        } while (!encontrada);		
				}		
			}	

			public static void main(String[] args) {		
				
				teclado = new Scanner(System.in);
				menuPrincipal();
				teclado.close();
			}

		}


	


