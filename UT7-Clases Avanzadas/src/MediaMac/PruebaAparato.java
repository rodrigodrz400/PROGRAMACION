package MediaMac;

public class PruebaAparato {

	/*
	 Aunque no está incluido en los ejercicios, deberás crear el código necesario para probar
	 el buen funcionamiento de tu jerarquía de clases: crear un Array de aparatos, poblarlo 
	 con algunos ejemplos de SmartPhone y Tableta, vender y comprar (añadir o quitar de la lista).
	 Esto se tendrá en cuenta como un apartado e).
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
