package Ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {
		
		List <String> c = new ArrayList<String>();
		String cadena="Asir";
		
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		
		c.add(2, "Inserci�n");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepci�n");
		c.add(c.size()-1, "Inserci�n al Final");
		//c.add("Inserci�n");
		
		System.out.println(c);

	}

}
