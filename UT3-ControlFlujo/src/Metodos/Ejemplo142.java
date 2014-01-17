package metodos;

public class Ejemplo142 {

	
	public static int multiplica(int a, int b){
		int resultado;
		
		if (b==1)
			resultado=a;
		else
		    resultado = a + multiplica(a,b-1);
		
		return resultado;
	}
	
	public static void main(String[] args) {
		int a, b;
		
		a=4;
		b=7;
		
		System.out.println(multiplica(a,b));
	}

}
