package MediaMac;

public class PruebaAparato {

	/*
	 Aunque no est� incluido en los ejercicios, deber�s crear el c�digo necesario para probar
	 el buen funcionamiento de tu jerarqu�a de clases: crear un Array de aparatos, poblarlo 
	 con algunos ejemplos de SmartPhone y Tableta, vender y comprar (a�adir o quitar de la lista).
	 Esto se tendr� en cuenta como un apartado e).
	 */
	public static void main(String[] args) {
	
		Aparato [] aparatos;
		aparatos = new Aparato [100];
		
		SmartPhone iphone4 = new SmartPhone("10","001","Iphone 4 negro","IOS",300,2);
		iphone4.addTecnologia("GPRS");
		iphone4.addTecnologia("3G");
		
		//SmartPhone XperiaJ= new SmartPhone("5","002","Sony Xperia J St26i Blanco","Android",119);
		//SmartPhone HiesenseHS = new SmartPhone("2","003","Hisense HS-U980 Blanco","Android",179);
		//SmartPhone SamsungGalaxy = new SmartPhone("2","004","Samsung Galaxy I9082 Blanco","Android",189.99);
		
		
		
		

	}

}
