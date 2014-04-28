package ClaseString;

public class E1y2_AngelFrasePalindromo {


		public static void main(String[] args) {

			String cadena=BuscarCaracteres.pedirCadena();

			StringBuilder cadenaLimpia=new StringBuilder(cadena.toLowerCase());

			for(int i=0;i<cadenaLimpia.length();i++) {
				if (!Character.isLetterOrDigit(cadenaLimpia.charAt(i))) {
					cadenaLimpia.deleteCharAt(i);
				}
			}

			String original=cadenaLimpia.toString();
			String invertida=cadenaLimpia.reverse().toString();

			System.out.printf("Cadena: %s\nInversa: %s\n",original,invertida);

			if (original.equals(invertida)) {
				System.out.println("¡Es palíndromo!");
			}
		}

	}