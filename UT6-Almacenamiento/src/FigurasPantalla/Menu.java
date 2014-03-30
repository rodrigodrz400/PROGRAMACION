package FigurasPantalla;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  Crear la clase Menu. Permitirá crear objetos que gestionen un menú. Menu mimenu;

		mimenu = new Menu("Menu Filmoteca");
		
		mimenu.añadirOpcion("Crear Pelicula");
		mimenu.añadirOpcion("Listar Filmoteca");
		mimenu.añadirOpcion("Salir");
		
		int resultado = mimenu.mostrarMenu();
 */
public class Menu {
	
	//Atributos de clase
		//¿Qué va a tener nuestro MenuGeneral?
	protected String[] opciones;
	protected int indice;
	protected String elijaUnaOpcion;
	protected int opcion;
	protected Scanner teclado;
	
	protected static final int MAX_OPCIONES = 15;
	
	//Constructores
		//¿Qué atributos y con que valores iniciales, queremos que nuestro MenuGeneral se muestre?
	public  Menu(){
		this.opciones = new String[MAX_OPCIONES];
		this.elijaUnaOpcion = "-->Elija una Opción:";
		this.indice=0;
		this.opcion = 0;
		this.teclado = new Scanner (System.in);
	}
	public Menu(int dim, String textoIndicadorDeOpciones){
		this.opciones = new String[dim];
		this.elijaUnaOpcion = textoIndicadorDeOpciones;
		this.indice = 0;
		this.opcion = 0;
		this.teclado = new Scanner (System.in);
	}
	
	//Accesadores (Generar Get´s and Set´s)
	
	public String[] getOpciones() {
		return opciones;
	}
	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}
	public String getSalida() {
		return elijaUnaOpcion;
	}
	public void setSalida(String textoIndicadorDeOpciones) {
		this.elijaUnaOpcion = textoIndicadorDeOpciones;
	}
	public int getNumeroOpciones() {
		return indice;
	}
	public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	//Métodos de clase o Servicios que presta nuestro MenuGeneral
	/*
	protected String[] opciones;
	protected int indice;
	protected String elijaUnaOpcion;
	protected int opcion;
	protected Scanner teclado;
	 */
	//Crearemos el método para añadir "opciones" (de tipo String) a nuestro MenuGeneral
	public void añadirOpcion(String opcion){
		if (this.opciones.length > this.indice){
		this.opciones[this.indice] =  opcion;
		this.indice++;
		}
	}
	//Crearemos un método de "Salir" para diferenciarlo un poco del resto de opciones del MenuGeneral
	public void añadirSalir(String textoIndicadorDeSalir){
		this.añadirOpcion(textoIndicadorDeSalir);
	}
	//Crearemos un método para  mostrar todas las opciones del Menu, que mostrará a través del array
	//opciones[], y mostrará el "prompt" -->Elija una opcion
	public void mostarMenu(){
		for(int i = 0; i < this.indice; ++i){
			System.out.println(""+ (i + 1) +".-" +this.opciones[i]);
		}
		System.out.print(this.elijaUnaOpcion);
	}
	//Crear un método que gestione la opción elegida por el usuario y que reinicie nuestro MenuGeneral
	public int obtenerOpcionElegidaUsuario(){
		int respuesta = 0;
		do{
			try{
				respuesta = teclado.nextInt();
				if(respuesta < 0 || respuesta > this.indice){
					System.out.println("Ha introducido un valor que se encuentra "
							+ "fuera del rango de opciones disponibles \n");
				}
			}catch(InputMismatchException e){
				System.out.println("Error: No ha introducido un valor númerico \n");
				teclado.nextLine();
			}	
		}while(respuesta <= 0 || respuesta > this.indice);
		if (respuesta == this.indice){
			respuesta = 0;
			System.out.println("Fin del Programa");
		}
		this.opcion = respuesta;
		return respuesta;
	}
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		menu.añadirOpcion("Listar libros");
		menu.añadirOpcion("Añadir libro");
		menu.añadirOpcion("Borrar libro");
		menu.añadirSalir("Salir");
		
		menu.mostarMenu();
		while(menu.obtenerOpcionElegidaUsuario() !=0){
			
			System.out.println("Se ha introducido la opción: " + menu.getOpcion() + "\n");
			menu.mostarMenu();
		}
		
		

	}

}
