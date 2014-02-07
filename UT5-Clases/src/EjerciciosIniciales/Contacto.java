package EjerciciosIniciales;

/*
 Vamos a hacer una Agenda, necesitamos la clase Contacto, que tiene:
	Nombre
	Apellido 1
	Apellido 2
	Dirección
	telFijo
	telMovil
	mail

	// constructores
	Contacto(Nombre,Apellido 1,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,dir,movil,fijo,correo)

	// métodos
	Métodos get/set para todos los atributos
 */
public class Contacto {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String telFijo;
	private String telMovil;
	private String mail;
	
	public Contacto(String nombre, String apellido1, String movil){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.telMovil=movil;
	}
	
	public Contacto(String nombre, String apellido1, String apellido2, String movil){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.telMovil=movil;
	}
	
	public Contacto(String nombre, String apellido1, String apellido2, String dir, String movil,
					String fijo, String correo){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.direccion=dir;
		this.telMovil=movil;
		this.telFijo=fijo;
		this.mail=correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getTelMovil() {
		return telMovil;
	}

	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
