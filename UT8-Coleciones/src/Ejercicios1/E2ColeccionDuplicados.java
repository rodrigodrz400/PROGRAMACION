package Ejercicios1;


import java.util.*;
import java.util.List;
import java.util.Scanner;

/*
 2.Crea una colección de caracteres que se irán introduciendo por teclado, hasta que se introduzca un *.
   Decir si hay algún caracter duplicado.
 */
public class E2ColeccionDuplicados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		HashSet <Character> caracteres = new HashSet <Character>();//Conjunto en vez de Lista
		
		char leido=' ';
		boolean repetidos=false;
		
		do{
			System.out.println("Introduzca otro caracter: ");
			if(caracteres.contains(leido)) repetidos=true;
			caracteres.add(leido);
			leido=teclado.next().charAt(0);
		}while(leido!='*');
		
		if (repetidos) System.out.println("Se introdujeron carateres repetidos");
		System.out.println(caracteres);
		
		
		
		
		
		
	}

}
