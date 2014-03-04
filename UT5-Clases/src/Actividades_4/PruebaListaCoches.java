package Actividades_4;

public class PruebaListaCoches {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Marca1","Modelo1","Color1","1111");
		Coche coche2 = new Coche("Marca2","Modelo2","Color2","2222");
		Coche coche3 = new Coche("Marca3","Modelo3","Color3","3333");
		Coche coche4 = new Coche("Marca1","Modelo4","Color4","4444");
		Coche coche5 = new Coche("Marca1","Modelo5","Color5","5555");
		
		Coche[] coches = {coche1,coche2,coche3,coche4,coche5};
		
		ListaCoches lista = new ListaCoches(coches);
		
		System.out.println(lista.devolverCoche(0));
		System.out.println("Posición del coche con matrícula 3333: " + lista.devolverPosicion("3333"));	
		
		
		System.out.println("----LISTADO DE COCHES DE LA MARCA \"MARCA1\"----");
		
		for ( int i = 0; i < lista.listaPorMarca("Marca1").getCoches().length; ++i) {
			
			System.out.println(lista.listaPorMarca("Marca1").getCoches()[i]);
		}		

	}

}
