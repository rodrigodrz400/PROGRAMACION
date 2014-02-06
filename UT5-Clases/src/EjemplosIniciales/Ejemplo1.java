package EjemplosIniciales;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		Persona angel, manolo;
		
		angel = new Persona();
		
		angel.nombre="Angel";
		angel.edad=23;
		
		angel.imprimirNombre();
		//System.out.println(angel.nombre);
		//System.out.println(angel);
		
		manolo=new Persona();
		
		manolo.nombre="Manolo";
		manolo.edad=angel.edad;
		
		manolo.imprimirNombre();
	}

}
