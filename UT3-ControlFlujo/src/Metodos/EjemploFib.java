package metodos;

public class EjemploFib {

	
	public static int fib(int n) {
		if (n<2)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		
	  System.out.println(fib(1));

	}

}
