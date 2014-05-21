package Interfaces.Persona;

import java.util.Scanner;

/*
 añadiendo además los datos que estimes oportunos. 
 Prueba a crear objetos Cliente y Empleado, dale valores y visualiza sus datos. 
 Intenta también cambiar el nombre de la empresa (dato de la interfaz).
 */
public class Cliente implements Persona {

	private String nombre;
	private String direccion;
	private String poblacion;
	private String provincia;
	private int codigoPostal;
	private int edad;
	private String email;
	private String nombreEmpresa;
	
	
	public Cliente(){
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.edad = edad;
		this.email = email;
		this.nombreEmpresa=nombreEmpresa();
	}
	public Cliente(String nombre, String direccion, String poblacion,
			String provincia, int codigoPostal, int edad, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.edad = edad;
		this.email = email;
		this.nombreEmpresa=nombreEmpresa();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String nombreEmpresa() {
		
		return "Restaurante Tan Dao Vien";
	}

	@Override
	public void pedirDatos() {
	
	}

	@Override
	public String visualizarDatos() {
		return 	"Empresa:\t" +nombreEmpresa + "\nCliente: \n\tNombre-->\t" + nombre 
				+ "\n\tDireccion-->\t" + direccion
				+ "\n\tPoblacion-->\t" + poblacion + "\n\tProvincia-->\t" + provincia
				+ "\n\tCodigo Postal-->" + codigoPostal + "\n\tEdad-->\t\t" + edad
				+ "\n\tE-mail-->\t" + email;
		
	}
	public static void main(String[] args) {
		Cliente rodrigo = new Cliente("Rodrigo","C/ Mayor, 43","Menasalbas","Toledo",45128,31,"rodrigo@gmail.com");
		
		System.out.println(rodrigo.visualizarDatos());
	
	}
}
