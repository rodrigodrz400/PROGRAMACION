package cadenas;

import java.util.Scanner;

public class Ejercicio2b {
	// combrobar si una fase es palindromo
	// mejorar el ejercicio prescindiendo de los espacios en blanco ni
	// mayusculas ni minusculas
	// ej: Daba la zorra arroz al abad... alli ves Sevilla
	public static boolean palinsimple(String sujeto) {
		boolean res = true;
		for (int i = 0; i < (sujeto.length() / 2); ++i) {
			// System.out.println("indice i="+i+" "+sujeto.charAt(i)+" vs "+sujeto.charAt(sujeto.length()-1-i));
			if (sujeto.charAt(i) != sujeto.charAt(sujeto.length() - 1 - i)) {
				res = false;
				i = sujeto.length();
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String fija = "";
		StringBuilder auxiliar;
		Scanner teclado = new Scanner(System.in);
		System.out.println("dime la cadena para añalizar si es palindromo");
		fija = teclado.nextLine();

		auxiliar = new StringBuilder(fija);
		for (int i = 0; i < auxiliar.length(); i++) {
			if (auxiliar.charAt(i) == ' ') {
				auxiliar.deleteCharAt(i);
			}
		}
		System.out.println("la frase <<"
				+ fija
				+ ">>  "
				+ auxiliar.toString()
				+ "  "
				+ (palinsimple(auxiliar.toString().toLowerCase()) ? "es"
						: "no es") + " Palindromo");
	}
}
