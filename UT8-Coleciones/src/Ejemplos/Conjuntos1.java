package Ejemplos;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos1 {

	public static void main(String[] args) {
		
		HashSet <String> misCadenas= new HashSet <String>();
		
		misCadenas.add("Daw");
		misCadenas.add("Asir");
		
		System.out.println(misCadenas);
		
		if (misCadenas.contains("Daw")) {
			System.out.println("Daw es un ciclo");
		}
		misCadenas.add("Daw");
		System.out.println(misCadenas);
		
		Iterator <String> i =misCadenas.iterator();
		while (i.hasNext()){
			String dato = i.next();
		}
		
		misCadenas.remove("Daw");
		System.out.println(misCadenas);
		
	}

}
