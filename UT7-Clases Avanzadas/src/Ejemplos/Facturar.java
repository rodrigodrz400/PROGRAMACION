package Ejemplos;

import java.lang.invoke.SwitchPoint;

public class Facturar {

	public static double sumarPrecios(Precio[] elementos){
		double suma=0;
		
		for (Precio precio : elementos) {
			suma+=precio.getPrecio();
		}
		return suma;
	}
	public static void main(String[] args) {
		//Object[] lineas;
		
		Precio[] lineas = new Precio[3];
		
		lineas[0]=new Producto("Tomate",0.40,10.0);
		lineas[1]=new Producto("Patriot",40000,0.0);
		lineas[2]=new Trabajo("Configurar Patriot",0.25,400);
		
		for (Precio objeto : lineas) {
			System.out.println(objeto);
		}
		System.out.println("Total: " + sumarPrecios(lineas));
	}
	
}
