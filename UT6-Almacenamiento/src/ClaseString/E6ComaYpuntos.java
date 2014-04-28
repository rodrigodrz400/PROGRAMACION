package ClaseString;

public class E6ComaYpuntos {

	/*
	 Escribe un métodos que reciva un numero double y devuelva a una cadena con comas y punto decimal. 
	 Por ejemplo, pasándole 1235689,45 dará "1.235.689,45".
	 */
	private static StringBuilder cadenaComas(double numero){
		
		StringBuilder cadena;
		int pos;
		
		cadena= new StringBuilder (Double.toString(numero).replace("." ,","));
		
		pos = cadena.indexOf(",");
		
		while(pos>3){
			try{
				cadena.insert(pos-3, ".");
				pos = pos-3;
			}catch(StringIndexOutOfBoundsException e){
				return cadena;
			}
			
		}
		return cadena;
		
		
		/*
		String cadena;
		int pos;
		
		cadena = Double.toString(numero).replaceAll(".", ",");
		pos = cadena.indexOf(",");
		
		cadena = new StringBuilder(cadena).insert(cadena.length()-pos, ".").toString();
		*/
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(cadenaComas(1251476.458));

	}

}
