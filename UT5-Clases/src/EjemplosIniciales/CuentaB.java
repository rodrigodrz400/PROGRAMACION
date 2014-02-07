package EjemplosIniciales;

public class CuentaB {
	private double saldo;
	private int numeroMovimientos;
	private String numeroCuenta;
	
	public CuentaB(String numeroCuenta){
		this.numeroCuenta=numeroCuenta;
		this.saldo=0;
		this.numeroMovimientos=0;
	}
	
	public CuentaB(String numeroCuenta, double saldo_inicial){
		this.numeroCuenta=numeroCuenta;
		this.saldo=saldo_inicial;
		this.numeroMovimientos=1;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public  void ingresar (double cantidad){
		saldo= cantidad + saldo;
		numeroMovimientos++;
	}
	
	public void sacar (double cantidad) throws SaldoInsuficienteExcep{
		
		if (saldo >= cantidad){
			saldo = saldo - cantidad;
			numeroMovimientos++;
		}else{
			throw new SaldoInsuficienteExcep();
		}
	}
	public double getSaldo(){
		
		return saldo;
	}

	public int getNumeroMovimientos(){
		
		return numeroMovimientos;
	}
	

}
