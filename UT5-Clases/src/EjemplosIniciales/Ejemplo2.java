package EjemplosIniciales;

public class Ejemplo2 {

	public static void main(String[] args) {

		Contador uno;
		
		uno= new Contador();
		
		while(uno.getContador()< 100){
			System.out.println(uno.getContador());
			uno.incrementar();
		}
		
		uno.setContador(100);
		while(uno.getContador() > 0){
			System.out.println(uno.getContador());
			uno.setContador((int)(uno.getContador()-1));
		}
		
	}

}
