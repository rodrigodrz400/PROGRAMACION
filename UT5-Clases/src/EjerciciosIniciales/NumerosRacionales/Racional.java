package EjerciciosIniciales.NumerosRacionales;
/*
 Numeros racionales
 	Clase Racional
 
 Constructores:
 	Por defecto 1
 	Con los valores que le pase por parámetro
 Metodos:
 	get/set
 	Static Racional.sumar(Racional a, Racional b)
 	minumero.sumar(Racional otro)
 	restar
 	dividir
 	multiplicar
 	toString() "1/2"
 	toFloatString() "0.5"
 	
 Método privado:
 	reducir()
 	
 Clase para blobarlo: leer dos números racionales, mostrar unmenú para (sumar/restar/multiplicar/dividir)
 	hacer la operación y mostrarla.
 */
public class Racional {

	private int num;
	private int den;
	
	public Racional (){
		this.num= 1;
		this.den=1;	
	}
	public Racional(int n, int d)
	    {
	        if (d == 0)
	        { num = 0; den = 1;}
	        else
	        { num = n; den = d;}
	    }
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	
	public void Sumar(Racional otro){
		this.num = (num*otro.getNum()) + (den*otro.getNum());
		this.den = den*otro.getDen();
	}
	public static Racional suma (Racional uno, Racional dos){
		Racional resultado;
		
		resultado = new Racional (uno.getNum()*dos.getDen()+(uno.getDen()*dos.getNum()),(uno.getDen()*dos.getDen()));
		
		return resultado;
	}
	public void Restar (Racional otro){
		this.num = (num*otro.getDen() - den*otro.getNum());
		this.den = den * otro.getDen();
	}
	public void Dividir (Racional otro){
		this.num = num*otro.getDen();
		this.den = den * otro.getNum();
	}
	public void Multiplicar (Racional otro){
		this.num = num*otro.getNum();
		this.den = den * otro.getDen();
	}
	@Override
	public String toString() {
		return ( num + "/" + den );
	}
	public String toFloatString(){
	        return Float.toString(num/den);
	       
	}
	private void reducir(){
		int actualMCM = mcm(this.num, this.den);
		this.den /= actualMCM;
		this.num /= actualMCM;
	}

	private int mcm(int a, int b){ 
		int temp; 
		if(a<b){ 
			temp = a;
			a = b;
			b = temp; 
		} 
		do{ 
			temp = b;
			b = a % b;
			a = temp; 
		}while(b != 0); 
		return a;
	} 
}
