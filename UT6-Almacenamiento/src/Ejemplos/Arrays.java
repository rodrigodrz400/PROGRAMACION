package Ejemplos;

public class Arrays {

	public static void main(String[] args) {
		//Declaración
		
		int [] enteros;
		int enteros2 [];
		String [] cadenas;
		
		//Creación
		
		enteros = new int[40];
		cadenas = new String [40];

		//Inicialización
		int [] enteros3={1,2,3,7};
		String[] cadenas2={"Uno","Dos","Tres"};
 		String[] cadenas3={new String ("uno"),new String ("Dos")};
 		
 		for(int i=0; i<enteros.length;i++) enteros[i]=i;
 		for(int i=0; i<cadenas.length;i++) cadenas[i]=new String(Integer.toString(i));
 		
 		//Recorridos
 		for(int i=0; i<enteros.length;i++) 
 			System.out.println(cadenas[i]);
 		for (String c: cadenas2)
 			System.out.println(c);
 		
 		//Array bidimensional
 		int [][] enteros4;
 		
 		int [][] enteros5 = {{1,2},{3,3}};
 		
 		System.out.println(enteros5 [0] [1]);
 		System.out.println(enteros5 [1] [0]);
 		
 		enteros4 = new int [3][3];
 		enteros4[1][1]=1;
 		enteros4[2][2]=2;
 		enteros4[1][2]=3;
 		
 		System.out.println(enteros4[1].length);
 		
	}

}
