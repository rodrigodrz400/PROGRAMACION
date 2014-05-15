package Ejemplos;

public class Contacto {


		private String nombre;
		private String dirección;
		private String DNI;
		private String email;
		private String telefono;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {

			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contacto other = (Contacto) obj;
			if (DNI == null) {
				if (other.DNI != null)
					return false;
			} else if (DNI.equals(other.DNI) || email.equals(other.email))
				   return true;
				else 
				   return false;
			return true;

			/*
			if ( DNI.equals(((Contacto)obj).getDNI()) ||
					email.equals(((Contacto)obj).getEmail())) 
				return true;
			else return false;*/
		}

		public Contacto(String nombre, String dirección, String dNI, String email,
				String telefono) {
			this.nombre = nombre;
			this.dirección = dirección;
			DNI = dNI;
			this.email = email;
			this.telefono = telefono;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDirección() {
			return dirección;
		}

		public void setDirección(String dirección) {
			this.dirección = dirección;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public static void main(String[] args) {

			Contacto antonio=new Contacto("Antonio", "", "44", "44@gmail", "4567");
			Contacto juan =new Contacto("Juan", "", "45", "45@gmail", "4567");

			if (antonio.equals(juan)) System.out.println("Son iguales");

			System.out.println(antonio.hashCode());
			System.out.println(juan.hashCode());

			Contacto[] agenda;

			agenda=new Contacto[5];

		}

	}
