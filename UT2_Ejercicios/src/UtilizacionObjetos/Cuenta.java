//Fig. 3.13: Cuenta.java
//la clase Cuenta con un constructor para validar e inicializar la variable de instancia saldo y de tipo double

package UtilizacionObjetos;


public class Cuenta {
	
	private double saldoactual;
	
	//CONSTRUCTOR
	public Cuenta (double saldoinicial)
	{
		//valida que saldo inicial sea mayor que 0.0;
		//si no lo es, saldo se inicializa con el valor predeterminado 0.0;
		if (saldoinicial > 0.0)
			saldoactual = saldoinicial;
	}//fin del constructor Cuenta
	
	
	//METODO
	//abona (suma) un monto a la cuenta
	public void abonar (double ingreso)
	{
		saldoactual = saldoactual + ingreso; //suma el ingreso al saldo
	}//fin del método abonar
	
	
	//METODO
	//devuelve el saldo de la clase Cuenta
	public double obtenerSaldo ()
	{
	return saldoactual; //proporciona el valor del saldo al método que hizo la llamada
	}//fin del método obtenersaldo

}//fin de la clase Cuenta
