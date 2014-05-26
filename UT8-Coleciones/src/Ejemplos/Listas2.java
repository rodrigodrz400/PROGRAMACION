package Ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {

	public static void main(String[] args) {
		ArrayList <String> c = new ArrayList<String>();
		
		String cadena="Asir";
		
		c.ensureCapacity(1000);
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		
		c.add(2, "Inserción");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepción");
		c.add(c.size()-1, "Inserción al Final");
		//c.add("Inserción");
		c.remove("Inserción");
		
		System.out.println(c.size());

		System.out.println(c);
		
		
		

	}

}
