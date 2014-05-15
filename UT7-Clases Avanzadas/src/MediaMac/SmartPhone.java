package MediaMac;

import java.util.Arrays;
import java.util.Scanner;

import ejerciciosHerencia2.TecnologiaRepetidaException;

public class SmartPhone extends Aparato {

	// Debe tener adem�s como atributo la tecnolog�a de transmisi�n soportada,
	// que ser� una
	// lista de cadenas, como por ejemplo [�GPRS�,�EDGE�,�HSDPA�].

	private String[] tecTransm;
	private int numTecnologias;

	public SmartPhone(String numProducto, String numSerie, String nombre,
			String so, double precioBase, int numTecnologias) {
		super(numProducto, numSerie, nombre, so, precioBase);
		this.tecTransm = new String [10];
		this.numTecnologias=0;
	}
	public String[] getTecTransm() {
		return tecTransm;
	}


	public void setTecTransm(String[] tecTransm) {
		this.tecTransm = tecTransm;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSmartPhone [tecTransm="
				+ Arrays.toString(tecTransm) + "]";
	}

	// A�adir el m�todo addTecnolog�a en la clase SmartPhone que tome como
	// par�metro una cadena
	// con el nombre de una tecnolog�a inal�mbrica y lo incluya en la lista de
	// tecnolog�as soportada.
	// Debe ser independiente de may�scular/min�sculas y controlar que la misma
	// tecnolog�a no se repita.
	private boolean repetida(String tecnologia) {
		boolean repetida = false;
		for(int i=0; i < this.numTecnologias; ++i) {
			if(this.tecTransm[i].equalsIgnoreCase(tecnologia)) {
				repetida = true;
				i = this.numTecnologias;
			}			
		}
		
		return repetida;		
	}
	public void addTecnologia(String tecnologia){
		
		if(!this.repetida(tecnologia)) {
			this.tecTransm[this.numTecnologias] = tecnologia;
			++this.numTecnologias;
		} else 
			System.out.println("La tecnolog�a ya est� definida.");
		
				
	}

	
	
}
