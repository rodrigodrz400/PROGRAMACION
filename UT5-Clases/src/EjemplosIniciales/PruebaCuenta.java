package EjemplosIniciales;


public class PruebaCuenta {
	
	//La cuenta también guarda en número de movimientos
	public static void main(String[] args) {
		
		Cuenta mi_cuenta;
		
		mi_cuenta = new Cuenta();
		
		mi_cuenta.ingresar(1000);
		
		System.out.println(mi_cuenta.getSaldo());
		
	

	}

}
