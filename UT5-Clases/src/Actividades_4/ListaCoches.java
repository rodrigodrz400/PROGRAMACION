package Actividades_4;
/*
  Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.
  La clase ListaCoches contendr� el array de coches y los m�todos necesarios para hacer un 
  programa principal que pueda hacer lo siguiente:

Devolver el coche que se encuentra en una posici�n dada. Si la posici�n aportada no es v�lida 
devolver� null.
Devolver la posici�n del coche cuya matr�cula coincide con una dada. En caso de no encontrar 
esta devolver� -1.
Devuelve la lista de coches que son de una marca determinada.
 */
public class ListaCoches {

	//Atributos
	private Coche[] coches;
	
	//Constructores
	public ListaCoches() {
		
	}
	public ListaCoches(Coche[] coches) {
		
		this.coches = coches;
		
		
	//Accesadores	
	}
	public Coche[] getCoches() {
		return coches;
	}

	public void setCoches(Coche[] coches) {
		this.coches = coches;
	}
	
	
	//M�todos
	public Coche devolverCoche(int posicion) {
		
		if (posicion < 0 || posicion >= this.getCoches().length)
			return null;
		else 
			return this.getCoches()[posicion];			
	}
	
	public int devolverPosicion(String matricula) {
		
		int respuesta = 0;
		
		for(int i = 0; i < this.getCoches().length; ++i ) {
			
			if (this.getCoches()[i].getMatricula().equalsIgnoreCase(matricula)) {
				
				respuesta = i;
				i = this.getCoches().length;
			}
			else
				respuesta = -1;
		}
		
		return respuesta;
		
	}
	
	public ListaCoches listaPorMarca ( String marca ) {		
		
		Coche[] marcas = new Coche[3];
		int contador = 0;
		
		for(int i = 0; i < this.getCoches().length; ++i ) {
			
			if (this.getCoches()[i].getMarca().equalsIgnoreCase(marca)) {
				
				marcas[contador] = this.getCoches()[i];
				++contador;
			}

		}
		
		Coche[] marcas2 = new Coche[contador];
		
		for ( int i = 0; i < contador; ++i ) {
			
			marcas2[i] = marcas[i];
			
		}
		
		ListaCoches lista = new ListaCoches(marcas2);
	
		return lista;
		
	}

}