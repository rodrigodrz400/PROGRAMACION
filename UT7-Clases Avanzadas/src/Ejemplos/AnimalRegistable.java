package Ejemplos;

public class AnimalRegistable implements Registrable {
	
	public int registrar(){
		int num_registro=(int)Math.random()*1000;
		System.out.println("Registrado con n�mero: " + num_registro);
		
		return num_registro;
	}

}
