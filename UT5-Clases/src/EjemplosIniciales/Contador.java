package EjemplosIniciales;

public class Contador {

	private double acumulador=1;
	
	
	public long getContador(){
		return (long) acumulador;
	}
	
	public void setContador(int acumulador){
		this.acumulador=acumulador;
	}
	
	public void incrementar(){
		this.acumulador++;
		
	}
}
