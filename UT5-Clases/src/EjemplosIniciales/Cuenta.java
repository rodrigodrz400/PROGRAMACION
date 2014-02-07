package EjemplosIniciales;

public class Cuenta {

	private double saldo = 0;
	private int numeroMovimientos = 0;
	
	public  void ingresar (double cantidad){
		saldo= cantidad + saldo;
		numeroMovimientos++;
	}
	
	public void sacar (double cantidad){
		
		if (saldo >= cantidad){
			saldo = saldo - cantidad;
			numeroMovimientos++;
		}else{
			System.out.println("No se le permite sacar más dinero que el que tiene en la cuenta.");
		}
	}
	public double getSaldo(){
		
		return saldo;
	}

	public int getNumeroMovimientos(){
		
		return numeroMovimientos;
	}
	

}
