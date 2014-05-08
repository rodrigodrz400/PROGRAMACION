package EjerciciosIniciales.Puntos;


/*
Crea la clase Punto, que contiene los atributos x e y (números enteros, públicos). Crea la clase Punto3D 
que hereda de la clase Punto, y además tiene otro atributo, llamado z para almacenar una tercera coordenada. 
Crea un objeto Punto3D, dale valores a sus coordenadas.
*/

public class E1Punto3D extends E1Punto{

	//Atributos
	public int z;
	
	
	public static void main(String[] args) {
		
		E1Punto p1 = new E1Punto();
		
		E1Punto3D p2 = new E1Punto3D();
		
		p1.x=5;
		p1.y=4;
		
		p2.x=5;
		p2.y=6;
		p2.z=5;

	}

}
