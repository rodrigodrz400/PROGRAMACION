package ClaseString;

public class ejemploStringBuilder {

	public static void main(String[] args) {
		StringBuilder nombre;
		
		nombre= new StringBuilder ("Angel");
		
		nombre.append(" Ca�adas");
		
		nombre.insert(5, "Mart�nez");
		
		System.out.println(nombre);
		
		nombre.delete(nombre.indexOf(" C"), nombre.length());
		
		System.out.println(nombre);
		
		String aux = new String(nombre);
	}

}
