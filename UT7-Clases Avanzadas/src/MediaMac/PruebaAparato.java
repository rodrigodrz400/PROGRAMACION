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
		iphone4.setPrecioBase(250);
		
		iphone4.addTecnologia("GPRS");
		iphone4.addTecnologia("3G");
		iphone4.addTecnologia("5G");
		
		SmartPhone XperiaJ = new SmartPhone("5","002","Sony Xperia J St26i Blanco","Android",119.5,5);
		XperiaJ.preciopPVPRebajado(15);
		XperiaJ.addTecnologia("GPRS");
		XperiaJ.addTecnologia("3G");
		XperiaJ.addTecnologia("gprs");
		
		Tableta nexus = new Tableta ("34","003","Nexus 7","Adroid 4.4",340,7.0,400);
		Tableta ipad = new Tableta ("36","004","iPAD air","iOS",700,9.7,250);

		aparatos[0]=iphone4;
		aparatos[1]=nexus;
		aparatos[2]=XperiaJ;
		aparatos[3]=ipad;
		
		for (int i=0; i<4;i++){
			System.out.println();
			System.out.println(aparatos[i]);
			System.out.println("Precio del articulo (15%-):");
			System.out.println(Math.rint(aparatos[i].preciopPVPRebajado(15)*100/100)+"€");
		}
		
		//SmartPhone XperiaJ= new SmartPhone("5","002","Sony Xperia J St26i Blanco","Android",119);
		//SmartPhone HiesenseHS = new SmartPhone("2","003","Hisense HS-U980 Blanco","Android",179);
		//SmartPhone SamsungGalaxy = new SmartPhone("2","004","Samsung Galaxy I9082 Blanco","Android",189.99);
		
		
		
		

	}

}
