package Simulacro;

public class ElementoMatriz {

	//Atributos
	private int fila;
	private int columna;
	private double valor;
	//Constructor
	public ElementoMatriz(int columna, int fila, double valor){
		this.fila=fila;
		this.columna=columna;
		this.valor=valor;
	}
	//Accesadores	
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	//Método auxiliar
	@Override
	public String toString() {
		return "El ElementoMatriz esta formado por: (" + columna + fila + valor + ")" ;
	}


}
