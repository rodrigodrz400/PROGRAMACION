package SimulacroPapas;

import java.util.Scanner;

/*
 2. (2 pts) Crear el m�todo est�tico pregunta_continuar() que
muestra la t�pica pregunta ��Desea continuar (s/n)?�. El m�todo
mostrar� el mensaje y controlar� que el usuario introduce una �s�
o �n�. Si el usuario introduce otra cosa lo avisar� y volver�
apreguntar. Finalmente devolver� un car�cter con valor �s� o �n�
dependiendo de lo que el usuario eligiera.
 */
public class Continuar {

	public static String preguntaContinuar(){
		Scanner teclado = new Scanner (System.in);
		String resp = teclado.nextLine();
		

			System.out.println("�Desea continuar (s/n)?");
			resp = teclado.next().toLowerCase();
			if( (!resp.equals("s"))  && (!resp.equals("n")) ){
				System.out.println("Respuesta incorrecta, utilice solamente los "
									+ "caracteres indicados en la parte superior \n");
			}
		teclado.close();
		return resp;
	}
	public static void main(String[] args) {
		
		do{
			System.out.println("Texto escrito otra vez");
		}while(!preguntaContinuar().equals("s"));
		
		
	}

}
