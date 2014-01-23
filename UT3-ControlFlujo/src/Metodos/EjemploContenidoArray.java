package Metodos;

public class EjemploContenidoArray {

	//dentro de un m�todo si se utilizan vectores, se cambia en contenido del vector dentro del m�tododo
	//tambi�n cambia en el "main"
	public static void imprime(int [] vector){
		System.out.print("[ ");
		for(int i=0; i<vector.length-1; i++){
			System.out.print(vector[i] + ", ");
		}
		System.out.print(vector[vector.length-1] + "]");
		
	}
	public static String a�adePunto(String frase){
		if (frase.charAt(frase.length()-1)!='.'){
			return  frase + ".";
		}else{
			return frase;
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] prueba = {1,2,3,4,5};
		
		imprime(prueba);
		System.out.println();
		
		
		String fraseMain;
		
		fraseMain = "Hola cadena";
		
		fraseMain=a�adePunto(fraseMain);
		
		System.out.println(fraseMain);
		
	}

}
