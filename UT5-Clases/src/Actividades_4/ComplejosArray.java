package Actividades_4;

public class ComplejosArray {

	public static int aleatorio10(){
		//(Math.random() * (max - min) + min);
		return (int) (Math.random()* (10 - 0) + 0);
	}
	
	private static Complejo sumatorio(Complejo numeros[]){
		Complejo sumatorio = new Complejo();
		
		for (int i=0; i<numeros.length;i++) {
			sumatorio.suma(numeros[i]);
		}
		
		return sumatorio;
	}
	
	private static Complejo[] crearVector(int num_elementos){
		Complejo[] vector;
		
		vector = new Complejo[num_elementos];
		
		for (int i=0;i<vector.length;i++){
			vector[i]=new Complejo(aleatorio10(),aleatorio10());
		}
		
		return vector;
		
	}
	public static void main(String[] args) {
		/*
		 Ejer3_Complejo vector [];
		
		vector = new Ejer3_Complejo [40];
		
		for (int i=0;i<vector.length;i++){
			vector[i]=new Ejer3_Complejo(aleatorio10(),aleatorio10());
		}
		System.out.println("Complejo de la posición 0: " + vector[0].toString() );	
		System.out.println("Complejo de la posición 5: " + vector[5].toString() );
		System.out.println("Complejo de la posición 15: " + vector[15].toString() );
		System.out.println("Complejo de la posición 25: " + vector[25].toString() );
		
		//Sumatorio de todos los números
		Ejer3_Complejo sumatorio = new Ejer3_Complejo();
		
		for (int i=0; i<vector.length; i++){
			sumatorio.suma(vector[i]);
		}
		
		System.out.println("El sumatorio de TODOS los números almacenados es: " + sumatorio.toString()); 
		 */
		
		Complejo vector[];
		
		vector = crearVector(40);
		
		System.out.println("Sumatorio: " + sumatorio(vector));

	}

}
