package FigurasPantalla;

public class Pantalla {
	// Atributos
	private int alto = 0;
	private int ancho = 0;
	private char caracter;
	private char[][] pixeles;

	// Constructor
	public Pantalla(int alto, int ancho, char caracter) {
		this.pixeles = new char[alto][ancho];
		this.alto = alto;
		this.ancho = ancho;
		this.caracter = caracter;
		inicializarPantalla();
	}

	public Pantalla(int alto, int ancho) {
		this.pixeles = new char[alto][ancho];
		this.alto = alto;
		this.ancho = ancho;
		this.caracter = '@';
		inicializarPantalla();
	}

	// Accesadores
	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	// Métodos auxiliares
	@Override
	public String toString() {
		return "El tamaño de la pantalla es de: " + alto + "x " + ancho + ".";
	}

	// Métodos o Servicios
	
	public void inicializarPantalla() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixeles[i][j] = '@';
			}
		}
	}
	public void imprimir() {
		for (int i = 0; i < pixeles.length; i++) {
			for (int x = 0; x < pixeles[i].length; x++) {
				System.out.print(pixeles[i][x] + " ");
			}
			System.out.print("\n");
		}
	}

	public void imprimeCuadrado(int fila1, int columna1, int tamaño) {
		int fila2 = fila1 + tamaño - 1;
		int columna2 = columna1 + tamaño - 1;
		
		// Con esto pinto dos lineas verticales paralelas.
		for (int i = fila1; i <= fila2; i++) {
			pixeles[i][columna1] = 	this.caracter;
			pixeles[i][columna2] = 	this.caracter;
		// me queda pintar las lineas horinzontales paralelas.
		for (int j = fila1; j < columna2; j++) {
			pixeles[fila1][j] = this.caracter;
			pixeles[fila2][j] = this.caracter;
		}
		System.out.print("\n");
		}
	}

	public void imprimeRectangulo(int fila1, int columna1, int ancho, int alto) {
			
		int fila2 = fila1 + ancho - 1;
		int columna2 = columna1 + alto - 1;
		
		//inicializarPantalla();
		// Con esto pinto dos lineas verticales paralelas.
		for (int i = fila1; i <= fila2; i++) {
			pixeles[i][columna1] = caracter;
			pixeles[i][columna2] = caracter;
		}
		// me queda pintar las lineas horinzontales paralelas.
		for (int i = fila1; i < columna2; i++) {
			pixeles[fila1][i] = caracter;
			pixeles[fila2][i] = caracter;
		}
		System.out.print("\n");
	}

	public void imprimeTriangulo() {

	}

	public void imprimeCiruclo() {

	}


	public static void main(String[] args) {
		
		Pantalla pantalla = new Pantalla(10, 10, '#');
		
		
		pantalla.setCaracter(' ');
		//pantalla.imprimeCuadrado(1, 1, 6);
		pantalla.imprimeCuadrado(2, 4, 3);
		//pantalla.imprimeRectangulo(1,3,2,4);
		pantalla.imprimir();

	}
}