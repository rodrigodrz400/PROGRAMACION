package SimulacroPapas;

import java.util.Scanner;

/*
 3. (3 pts) Crea un programa que permita introducir una clave. La
 clave debe tener al menos 6 caracteres (letras mayúsculas o
 minúsculas o números). Si no es así debe volver a pedir la clave.
 Una vez introducida una clave buena, debe pedir reintroducir la
 clave y comprobar que es la misma. Si este último paso falla se
 vuelve a comenzar el proceso.
 */
public class Clave {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String clave;
		String reintroClave;
		boolean comprobarCaracteres = false;
		boolean comprobarIguales = false;

		do {
			do {
				System.out.println("Introduzca una clave con al menos 6 caracteres: ");
				clave = teclado.next();
				if (clave.length()>=6) {
					comprobarCaracteres = true;
				} else {
					System.out.println("Formato incorrecto, la clave debe contener"
										+ " 6 caracteres alfanuméricos.\n");
					comprobarCaracteres = false;
				}

			} while (comprobarCaracteres == false);
			System.out.println("Introduzca nuevamente la clave para validarla: ");
			reintroClave = teclado.next();
			if (clave.equals(reintroClave)){
				System.out.println("****La clave se ha validado correctamente.****");
				comprobarIguales=true;
			}else{
				System.out.println("Error, la clave introducida no coincide con la clave anterior\n");
				comprobarIguales=false;
			}
			
		} while (comprobarIguales==false);

		teclado.close();
	}

}
