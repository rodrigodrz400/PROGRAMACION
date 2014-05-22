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
	
	
	public Cliente(){
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.edad = edad;
		this.email = email;

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
	public void pedirDatos() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese los datos del cliente:");
	
	System.out.println("Nombre:");
	this.nombre=teclado.nextLine();
	System.out.println("Dirección:");
	this.direccion=teclado.nextLine();
	System.out.println("Población:");
	this.poblacion=teclado.nextLine();
	System.out.println("Provincia:");
	this.provincia=teclado.nextLine();
	System.out.println("Código postal:");
	this.codigoPostal=teclado.nextInt();
	System.out.println("Edad:");
	this.edad=teclado.nextInt();
	System.out.println("E-amil:");
	this.email=teclado.next();
	
	}

	@Override
	public String visualizarDatos() {
		return 	"\n\nEmpresa:\t" +nombreEmpresa + "\nCliente: \n\tNombre----->\t" + nombre 
				+ "\n\tDireccion-->\t" + direccion
				+ "\n\tPoblacion-->\t" + poblacion + "\n\tProvincia-->\t" + provincia
				+ "\n\tCodigo Postal\t" + codigoPostal + "\n\tEdad------->\t" + edad
				+ "\n\tE-mail----->\t" + email;
		
	}
	public static void main(String[] args) {
		//Cliente rodrigo = new Cliente("Rodrigo","C/ Mayor, 43","Menasalbas","Toledo",45128,31,"rodrigo@gmail.com");
		
		Cliente rodrigo= new Cliente();
		
		rodrigo.pedirDatos();
		
		System.out.println(rodrigo.visualizarDatos());
	
	}
}
