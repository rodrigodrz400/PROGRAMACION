package Interfaces.Remunerada;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 Crea la clase Cuenta, que tiene los siguientes atributos:

nombre: nombre del cliente propietario.
cuenta: número de la cuenta (es una cadena).
saldo: saldo en euros de la cuenta.

La clase Cuenta también tendrá los métodos:

get/set para los atributos nombre y cuenta.
estado: devuelve el saldo de la cuenta.
ingreso(cantidad): permite ingresar la cantidad de euros en la cuenta.
reintegro(cantidad): permite sacar la cantidad de euros de la cuenta.
 */
public class Cuenta implements Remunerada{

	private String nombreCliente;
	private String numCuenta;
	private double saldo;
	private String fechaApertura;
	private double tipoInteres;
	
	
	public Cuenta(String nombreCliente, String numCuenta, double saldo, double tipoInteres, String fechaApertura) {
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.tipoInteres=tipoInteres;
		this.fechaApertura= fechaApertura;
		
	}
	
	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	
	
	public String estado(){
		return String.format ("El saldo actual de su cuenta es de: %.2f€.",  this.saldo);
	}
	public void ingreso(double cantidad){
		this.saldo+=cantidad;
	}
	public void reintegro(double cantidad){
		this.saldo-=cantidad;
	}

	@Override
	public void asignarTipoInteres(double tipo) {
		//asignarTipoInteres(tipo): asigna el tipo de interes de la cuenta.
		this.tipoInteres = tipo;
	}

	@Override
	public double obtenerTipoInteres() {
		//obtenerTipoInteres(): devuelve el tipo de interes de la cuenta.
		return tipoInteres;
	}

	@Override
	public String intereses(int dias) {
		//intereses(días): calcula los intereses producidos por la cuenta en el número de días especificado.
		
		double acreedores=this.saldo*dias;
		double divisorFijo=360/(this.tipoInteres/100);
		
		return String.format("%.2f€.",acreedores/divisorFijo );
	}
	
	
	//Diferencias entre dos fechas
	 public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

	        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
	        String fechaInicioString = df.format(fechaInicial);
	        try {
	            fechaInicial = df.parse(fechaInicioString);
	        } catch (ParseException ex) {
	        }

	        String fechaFinalString = df.format(fechaFinal);
	        try {
	            fechaFinal = df.parse(fechaFinalString);
	        } catch (ParseException ex) {
	        }

	        long fechaInicialMs = fechaInicial.getTime();
	        long fechaFinalMs = fechaFinal.getTime();
	        long diferencia = fechaFinalMs - fechaInicialMs;
	        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
	        return ((int) dias);
	    }
	 
	 public Date DeStringADate(String fecha){
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        String strFecha = fecha;
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(strFecha);
	                        System.out.println(fechaDate.toString());
	            return fechaDate;
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	            return fechaDate;
	        }
	    }
}
