package ahorcado;

import javax.xml.parsers.DocumentBuilder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.XPatherException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Palabras {
	// Atributos de clase
	private static final int max_intentos = 7;
	private static int intentos = 0;
	private static boolean restar_intento = false;
	private static boolean encontrada = false;
	private static char letra = 0;
	public static ArrayList<Character> palabra_introducida = new ArrayList<Character>();
	public static ArrayList<Character> palabra_guardada = new ArrayList<Character>();
	public static Scanner teclado = new Scanner(System.in);
	public static String miPalabra;

	public static String palabra() {
		String urlPalabraAleatoria = "http://www.palabrasque.com/palabra-aleatoria.php";

		// Clean Builder
		CleanerProperties props = new CleanerProperties();
		// set some properties to non-default values
		props.setTranslateSpecialEntities(true);
		props.setTransResCharsToNCR(true);
		props.setOmitComments(true);

		// Object[]
		// palabra=tagNode.evaluateXPath("/html/body/center/font[1]/strong");
		Object[] palabra = null;
		try {
			URL url = new URL(urlPalabraAleatoria);
			HttpURLConnection httpcon = (HttpURLConnection) url
					.openConnection();
			httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
			TagNode tagNode = new HtmlCleaner(props).clean(httpcon
					.getInputStream());

			// guardar una copia
			// new PrettyXmlSerializer(props).writeToFile(
			// tagNode, "archivos/palabra.xml", "utf-8");

			palabra = tagNode.evaluateXPath("//strong");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ((StringBuilder) ((TagNode) palabra[0]).getText()).toString();
	}

	/**
	 * FunciÛn que elimina acentos y caracteres especiales de una cadena de
	 * texto.
	 * 
	 * @param input
	 * @return cadena de texto limpia de acentos y caracteres especiales.
	 */
	public static String sinAcentos(String input) {
		// Cadena de caracteres original a sustituir.
		String original = "·‡‰ÈËÎÌÏÔÛÚˆ˙˘uÒ¡¿ƒ…»ÀÕÃœ”“÷⁄Ÿ‹—Á«";
		// Cadena de caracteres ASCII que reemplazar·n los originales.
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		String output = input;
		for (int i = 0; i < original.length(); i++) {
			// Reemplazamos los caracteres especiales.
			output = output.replace(original.charAt(i), ascii.charAt(i));
		}// for i
		return output;
	}

	// METODO PARA MOSTRAR EL MENU
	public static void menu() {
		int opcion = 0;
		do {
			System.out.println("\n*  Menu  *");
			for (int k = 0; k < 10; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" 1.Jugar al juego del ahorcado");
				System.out.println(" 2. Salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3);

			switch (opcion) {

			case 1:
				iniciarJuegoPalabra();
				break;
			case 2:
				System.out.println("Gracias por jugar al <<JUEGO DEL AHORCADO>>");
				break;
			}
		} while (opcion != 2);
	}

	// METODO Iniciar juego con la opciÛn: 1 palabra introducida
	public static void iniciarJuegoPalabra() {
		palabra_introducida.clear();
		palabra_guardada.clear();
		definirPalabra();
		do {
			mostarPalabraEspacios();
			ingresarLetra();
			buscaLetraEnPalabra(letra);
			compararPalabra();
			intentosUsados();
		} while (intentos < max_intentos && !encontrada);
		finJuego();
	}

	// METODO Guardar palabra diccionario en caracteres
	public static void definirPalabra() {

		String miPalabra = sinAcentos(palabra().toLowerCase());
		System.out.println("La palabra a adivinar es: " + miPalabra);
		int tamaÒoPalabra = miPalabra.length();
		for (int i = 0; i < tamaÒoPalabra; i++) {
			palabra_introducida.add(miPalabra.charAt(i));
			palabra_guardada.add('_');
		}
		System.out.println("La palabra se ha guardado correctamente");
	}

	// METODO Mostrar palabra: espacios o caracteres acertados
	public static void mostarPalabraEspacios() {
		System.out.println("\n");

		for (char l : palabra_guardada) {
			if ((int) l != 0) {
				System.out.print(" " + l);
			}
		}
	}

	// METODO ingresar letra por teclado
	public static char ingresarLetra() {
		System.out.print(" \n\n Ingrese una letra : ");
		letra = new String(teclado.next()).charAt(0);
		intentos++;
		return letra;
	}

	// METODO Busca letra en la palabra_introducida y la guarda en su posicion
	// correspondiente en palabra_guardada
	public static void buscaLetraEnPalabra(char letra) {
		System.out.println(" Letra ingresada: " + letra);
		letra = Character.toLowerCase(letra);
		restar_intento = false;
		for (int i = 0; i < palabra_introducida.size(); i++) {
			if (letra == palabra_introducida.get(i)) {
				palabra_guardada.set(i, letra);
				restar_intento = true;
			}
		}
		if (restar_intento == true) {
			intentos--;
		}
	}

	// METODO Compara los caracteres de palabra_introducida con los de
	// palabra_guardada en todas sus posiciones
	public static void compararPalabra() {
		for (int i = 0; i < palabra_introducida.size(); i++) {
			if ((int) palabra_introducida.get(i) != 0) {
				if (palabra_introducida.get(i) == palabra_guardada.get(i)) {
					encontrada = true;
				} else {
					encontrada = false;
					break;
				}
			}
		}
	}

	// METODO Muestra el n˙mero de intentos usados y el m·ximo
	public static void intentosUsados() {
		System.out.println(" Intentos " + intentos + ". N∫ m·ximo de intentos "
				+ max_intentos);
	}

	// METODO juego finalizado y muestra los mensajes
	public static void finJuego() {
		if (intentos < max_intentos && encontrada) {

			System.out.println("\n \t \t \t " + ">> PALABRA ENCONTRADA <<");
			for (int i = 0; i < 25; i++) {
				System.out.print(" * ");
			}
			System.out.println("\n \t \t "
					+ " - ENHORABUENA, te has librado por los pelos - ");
			for (int i = 0; i < 25; i++) {
				System.out.print(" * ");
			}
			System.out.print("\n" + " N˙mero de intentos empleados : "
					+ intentos + "\n");
		} else {
			for (int i = 0; i < 25; i++) {
				System.out.print(" *");
			}
			System.out
					.println("\n \t \t  NO LO HAS CONSEGUIDO \n \t MORIRAS ENTRE TERRIBLE SUFRIMIENTO ");
			for (int i = 0; i < 25; i++) {
				System.out.print(" *");
			}
		}
	intentos = 0;
	}

	public static void main(String[] args) throws IOException, XPatherException {

		menu();
	}

}
