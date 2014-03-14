package Actividades_4;

import java.util.Scanner;

/*
  Crear la clase Menu. Permitir� crear objetos que gestionen un men�. Menu mimenu;

		mimenu = new Menu("Menu Filmoteca");
		
		mimenu.a�adirOpcion("Crear Pelicula");
		mimenu.a�adirOpcion("Listar Filmoteca");
		mimenu.a�adirOpcion("Salir");
		
		int resultado = mimenu.mostrarMenu();
 */
public class MenuGeneral {
	
	//Atributos de clase
		//�Qu� va a tener nuestro MenuGeneral?
	protected String[] opciones;
	protected int indice;
	protected String elijaUnaOpcion;
	protected int opcion;
	protected Scanner teclado;
	
	//Constructores
		//�Qu� atributos y con que valores iniciales, queremos que nuestro MenuGeneral se muestre?
	public  MenuGeneral(){
		this.opciones = new String[15];
		this.elijaUnaOpcion = "-->Elija una Opci�n:";
		this.indice=0;
		this.opcion = 0;
		this.teclado = new Scanner (System.in);
	}
	public MenuGeneral(int dim, String textoIndicadorDeOpciones){
		this.opciones = new String[dim];
		this.elijaUnaOpcion = textoIndicadorDeOpciones;
		this.indice = 0;
		this.opcion = 0;
		this.teclado = new Scanner (System.in);
	}
	
	//Accesadores (Generar Get�s and Set�s)
	
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
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	public Scanner getTeclado() {
		return teclado;
	}
	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}
	//M�todos de clase o Servicios que presta nuestro MenuGeneral
	/*
	protected String[] opciones;
	protected int indice;
	protected String elijaUnaOpcion;
	protected int opcion;
	protected Scanner teclado;
	 */
	//Crearemos el m�todo para a�adir "opciones" (de tipo String) a nuestro MenuGeneral
	public void a�adirOpcion(String opcion){
		this.opciones[this.indice] = ""+ (this.indice + 1) +".-" + opcion;
		this.indice++;
	}
	//Crearemos un m�todo de "Salir" para diferenciarlo un poco del resto de opciones del MenuGeneral
	public void a�adirSalir(String textoIndicadorDeSalir){
		this.a�adirOpcion(textoIndicadorDeSalir);
	}
	//Crearemos un m�todo para  mostrar todas las opciones del Menu, que mostrar� a trav�s del array
	//opciones[], y mostrar� el "prompt" -->Elija una opcion
	public void mostarMenu(){
		for(int i = 0; i < this.indice; ++i){
			System.out.println(this.opciones[i]);
		}
		System.out.print(this.elijaUnaOpcion);
	}
	//Crear un m�todo que gestione la opci�n elegida por el usuario y que reinicie nuestro MenuGeneral
	public int obtenerOpcionElegidaUsuario(){
		int respuesta = 0;
		do{
			mostarMenu();
			respuesta = teclado.nextInt();
			if(respuesta < 0 || respuesta > this.indice){
				System.out.println("Ha introducido un valor que no existe "
						+ "entre el rango de opciones disponibles \n");
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
		MenuGeneral menu = new MenuGeneral();
		
		menu.a�adirOpcion("Listar libros");
		menu.a�adirOpcion("A�adir libro");
		menu.a�adirOpcion("Borrar libro");
		menu.a�adirSalir("Salir");
		
		while(menu.obtenerOpcionElegidaUsuario() !=0){
			
			System.out.println("Se ha introducido la opci�n: " + menu.getOpcion() + "\n");
		}
		
		

	}

}
