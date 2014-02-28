package Actividades_4;


/*
 Ejercicio 3 Cree una clase llamada Complejo para realizar operaciones aritm�ticas con n�meros complejos. 
 Estos n�meros tienen la forma:

parteReal + parteImaginaria * i
donde i representa la raiz de -1.

Escribe un programa para probar tu clase. Usa variables reales para almacenar los datos privados de la clase. 
Crea un constructor por defecto que inicialice el n�mero a (0,0) y otro que permita inicializar los dos valores al crearlo.

Crea m�todos p�blicos para realizar las siguientes operaciones:

Suma: (a,b)+(c,d)=(a+c,b+d)
Resta: (a,b)-(c,d)=(a-c,b-d)
Producto: (a,b)*(c,d)=(ac-bd,ad-bc)
Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))
Crea un m�todo para imprimir un n�mero complejo de la forma (a,b), donde a es la parte real y b es la parte imaginaria.
 */
public class Complejo {
	//Atributos de clase
	private double parteReal;
	private double parteImaginaria;
	//Constructores
	public Complejo(){
		this.parteReal=0;
		this.parteImaginaria=0;
	}
	public Complejo(double real, double imaginaria){
		this.parteReal=real;
		this.parteImaginaria=imaginaria;
	}
	//Accesadores
	public double getParteReal() {
		return parteReal;
	}
	public double getParteImaginaria() {
		return parteImaginaria;
	}
	//M�todos
		//Suma: (a,b)+(c,d)=(a+c,b+d)
	public void suma(Complejo otro){
		this.parteReal = this.parteReal + otro.getParteReal();
		this.parteImaginaria += otro.getParteImaginaria();
	}
		//Resta: (a,b)-(c,d)=(a-c,b-d)
	public void resta(Complejo otro){
		this.parteReal -= otro.getParteReal();
		this.parteImaginaria -= otro.getParteImaginaria();
	}
		//Producto: (a,b)*(c,d)=(ac-bd,ad+bc)
	public void producto(Complejo otro){
		double parteReal = ((this.parteReal*otro.getParteReal())-(this.parteImaginaria*otro.getParteImaginaria()));
		double parteImaginaria = ((this.parteReal*otro.parteImaginaria)+(this.parteImaginaria*otro.parteReal));
		
		this.parteReal= parteReal;
		this.parteImaginaria=parteImaginaria;
	}
		//Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))
	public void cociente(Complejo otro){
		double parteReal = (((this.parteReal*otro.parteReal)+(this.parteImaginaria*otro.parteImaginaria))
				/((Math.pow(otro.parteReal, 2)+(Math.pow(otro.parteImaginaria,2)))));
		double parteImaginaria = (((this.parteImaginaria*otro.parteReal)-(this.parteReal*otro.parteImaginaria))
				/((Math.pow(otro.parteReal, 2)+(Math.pow(otro.parteImaginaria,2)))));
		
		this.parteReal= parteReal;
		this.parteImaginaria=parteImaginaria;
	}
	//M�todos auxiliares
	
	@Override
	public String toString() {
		return "El Resultado es: [" + parteReal + "+"
				+ parteImaginaria + "i]";
	}
	public static void main(String[] args) {
		
		Complejo n1 = new Complejo(9,5);
		Complejo n2 = new Complejo(7,8);
		
		System.out.println("Operaci�n de SUMA de los n�meros complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "- ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.suma(n2);
		System.out.println(n1+"\n");
		
		
		System.out.println("Operaci�n de RESTA de los n�meros complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "+ ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.resta(n2);
		System.out.println(n1+"\n");
		
		System.out.println("Operaci�n de PRODUCTO de los n�meros complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "* ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.producto(n2);
		System.out.println(n1+"\n");
		
		System.out.println("Operaci�n de COCIENTE de los n�meros complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "* ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.cociente(n2);
		System.out.println(n1+"\n");
	}

}
