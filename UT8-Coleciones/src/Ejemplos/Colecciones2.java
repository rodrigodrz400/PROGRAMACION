package Ejemplos;

import java.util.*;

public class Colecciones2 {

	public static void main(String[] args) {
		
		
		Collection <String> c = new ArrayList<String>();
		String cadena="Asir";
		
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		
		System.out.println(c.size());
		
		System.out.println(c);
		
		for (String s : c) {
			System.out.println(s);
		}
		
		c.remove(cadena);
		
		System.out.println(c.size());
		System.out.println(c);
		
	}

}
