package Prueba131129.src;



import java.util.Scanner;

public class Pruebas {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		do{
			generarHaiku();
			System.out.println("\nGenerar otro Haiku? [s/n]: ");
		}while("s".equals(teclado.nextLine()));
			
		teclado.close();
	}

	private static void generarHaiku() {
		int	min = 3,
			max = 40,
			largoHaiku = 3,
			n = 0;
		String[] frases = new String[max];
		
		System.out.println("Bienvenido al Haiku Generator (Sin repetición)\n\nPara terminar escribe: *\n");
		
		while(n++<max){
			System.out.print("Introduce un verso: ");
			frases[n] = teclado.nextLine();
			if(n>=min && frases[n].equals("*"))  break;
		}
		
		System.out.println("\n\nHaiku\n************");
		
		// El array contiene los números de las frases usadas
		int[] usadas = new int[largoHaiku];
		for(int i=0; i<largoHaiku; i++){
			int r;
			while(arrayContiene(usadas, r = (int)(Math.random() * n)));
			usadas[i] = r;
			System.out.println(frases[r]);
		}

	}

	private static boolean arrayContiene(int[] usadas, int n) {
		boolean existe = false;
		for(int i=0; i<usadas.length && !existe; i++){
			if(usadas[i] == n) existe = true;		
		}
		return existe;
	}

}
