package SimulacroPapas;

import java.util.Scanner;

/*
 2. (2 pts) Crear el método estático pregunta_continuar() que
muestra la típica pregunta “¿Desea continuar (s/n)?”. El método
mostrará el mensaje y controlará que el usuario introduce una ‘s’
o ‘n’. Si el usuario introduce otra cosa lo avisará y volverá
apreguntar. Finalmente devolverá un carácter con valor ‘s’ o ‘n’
dependiendo de lo que el usuario eligiera.
 */
public class Continuar {

	public static void preguntaContinuar(){
		Scanner teclado = new Scanner (System.in);
		String resp;
		
		do{
			System.out.println("¿Desea continuar (s/n)?");
			resp = teclado.next();
			if( (!resp.equals("s"))  && (!resp.equals("n")) ){
				System.out.println("Respuesta incorrecta, utilice solamente los "
									+ "caracteres indicados en la parte superior \n");
			}
		}while( (!resp.equals("s"))  && (!resp.equals("n")) );
		teclado.close();	
	}
	public static void main(String[] args) {
		
		preguntaContinuar();
		
	}

}
