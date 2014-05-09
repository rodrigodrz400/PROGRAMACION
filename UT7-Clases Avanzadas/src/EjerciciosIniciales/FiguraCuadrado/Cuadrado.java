package EjerciciosIniciales.FiguraCuadrado;

/*
 Escribe una clase llamada Cuadrado, que posee un atributo de tipo entero llamado ancho.

La clase debe poseer los siguientes métodos:

Un constructor que no recibe ningún parámetro y que inicialice las dimensiones del cuadrado con un número por defecto.
Otro método constructor que reciba el ancho como parámetros. Se debe comprobar que el valor es positivo antes de asignarlo.
 En caso contrario, se asignarán valores por defecto
Métodos get y set para la clase.
Un método que calcule y retorne el área del cuadrado.
Método que calcule y retorne el perímetro del cuadrado.
Otro método que dibuje en pantalla el cuadrado mediante asteriscos, utilizando tantas columnas y filas como valor
 tenga el ancho.

* * *

* * *

* * *

 */
public class Cuadrado {

	private int ancho;
	
	public Cuadrado (){
		this.ancho=3;
	}
	public Cuadrado (int ancho){
		if(ancho>0){
			this.ancho=ancho;
		}else{
			this.ancho=3;
		}	
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int areaCuadrado(){
		return (int)Math.pow(this.ancho, 2);			
	}
	public int perimetroCuadrado(){
		return this.ancho*4;
	}
	public void dibujar(){
		for(int i=0; i<this.ancho; i++){
			for(int j=0; j<this.ancho; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	
}
