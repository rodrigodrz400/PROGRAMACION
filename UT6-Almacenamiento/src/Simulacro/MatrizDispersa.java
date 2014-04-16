package Simulacro;

public class MatrizDispersa {

	// Atributos
	private int filas;
	private int columnas;
	private ElementoMatriz[] elementos;
	private int numElementosNoCero;

	// Constructores
	public MatrizDispersa(int columnas, int filas, double tantoPorCiento) {
		this.filas = filas;
		this.columnas = columnas;

		int tamaño;
		tamaño = columnas * filas;
		tamaño = (int) (tamaño * tantoPorCiento / 100);

		elementos = new ElementoMatriz[tamaño];
		numElementosNoCero = 0;
	}

	public MatrizDispersa(double[][] matriz, double tantoPorCiento){
		this.filas=matriz.length;
		this.columnas=matriz[0].length;
		
		int tamaño;
		tamaño = columnas * filas;
		tamaño = (int) (tamaño * tantoPorCiento/100);
		
		elementos = new ElementoMatriz[tamaño];
		numElementosNoCero=0;
		
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[i].length;j++){
				if(matriz[i][j] !=0){
					setValor(j,i,(matriz[i][j]));
				}
			}
		}
		
	}
	public double getValor(int columna, int fila) {
		for (int i = 0; i < numElementosNoCero; i++) {
			if (elementos[i].getColumna() == columna
					&& elementos[i].getFila() == fila)
				return elementos[i].getValor();
		}
		return 0.0;
	}
	public void setValor(int columna, int fila, double valor){
		boolean encontrado=false;
		for(int i=0; i<numElementosNoCero; i++){
			if (elementos[i].getColumna() == columna
					&& elementos[i].getFila() == fila){
				elementos[i].setValor(valor);
			}
		}
		if(!encontrado){
			elementos[numElementosNoCero]= new ElementoMatriz(columna, fila, valor);
			numElementosNoCero++;
		}
	}
	public void imprimir(){
		for(int i=0; i<filas;i++){
			for(int j=0; j<columnas;j++){
				System.out.printf("%.2f ", getValor(j,i));
			}
			System.out.println();
		}
	}
	
	
	
}
