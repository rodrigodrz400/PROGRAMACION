package EjerciciosIniciales;

public class PruebaAgenda {

	public static void main(String[] args) {
		Contacto rodrigo, daniel;
		
		rodrigo = new Contacto("Rodrigo", "Fern�ndez", "646-565-320");
		
		System.out.println("Nombre: "+ rodrigo.getNombre()+" "+rodrigo.getApellido1()+". M�vil: "
		+rodrigo.getTelMovil());
		
		rodrigo = new Contacto("RodrigoMOD", "Fern�ndezMod", "Guzm�n", "C/Solanilla,n�34", 
				"646-565-320Mod", "925-65-89-74", "azarquiel.372775@gmail.com");
		
		rodrigo.setApellido1("FernadezMOD2");
		
		System.out.println("Nombre: "+ rodrigo.getNombre()+" "+rodrigo.getApellido1()+". M�vil: "+
							rodrigo.getTelMovil()+" Calle: "+ rodrigo.getDireccion()+" Tel�fino Fijo: "+
							rodrigo.getTelFijo()+" E-mail: "+ rodrigo.getMail());
					
		
		daniel = new Contacto ("Daniel", "Garc�a", "653-251-125");
		System.out.println("Nombre: "+ daniel.getNombre()+" "+daniel.getApellido1()+". M�vil: "+daniel.getTelMovil());

	}

}
