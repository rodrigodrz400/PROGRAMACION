package EjemplosIniciales;

public class Cuenta {

	private double saldo = 0;
	
	public void ingresar (double cantidad){
		saldo= cantidad + saldo;
	}
	
	public void sacar (double cantidad){
		if (saldo > 0){
			saldo = saldo - cantidad;
		}else{
			System.out.println("Su cuenta esta en números rojos.");
		}
	}
	public double getSaldo(){
		
		return saldo;
	}

}
