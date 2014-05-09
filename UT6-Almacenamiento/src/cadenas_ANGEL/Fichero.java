package cadenas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Fichero {

	public static void main(String[] args) throws IOException {
		Scanner scn=new Scanner(new File("archivo.txt"));
		
		Scanner scn2=new Scanner(new URL("http://www.ies-azarquiel.es").openStream());
		
		FileWriter otro=new FileWriter("archivo2.txt");
		otro.write("Escrito");
		otro.close();
		
		
		System.out.println(scn.nextLine());
		System.out.println(scn2.nextLine());

	}

}
