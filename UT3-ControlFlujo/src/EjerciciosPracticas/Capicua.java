package EjerciciosPracticas;

import java.util.Scanner;

public class Capicua {

	//Lee un número por consola y comprueba si es palíndromo (capicúa).
	//Pista: si creas un número con los dígitos en orden inverso al leido, 
	//y al compararlos resulta que son iguales, será capicúa.
	public static void main(String[] args) {
	long numero= 0;
	
	System.out.println("Inserte un número para comprobar si es o no capicúa");
	Scanner teclado = new Scanner (System.in);
	numero = teclado.nextLong();
	
	//1.Para obtener el último dígito del número lo haremos con el resto de una división entre diez. 
    //2.Del número original hay que quitarle el último dígito. En este caso utilizamos la división entre 10.
	
	long numeroRestante;
	long numeroInvertido;
	long resto;

	while(numero<=0);
	 numeroRestante=numero;
	 numeroInvertido=0;
	 resto=0;

	// El código que viene a continuación da la vuelta a un numero
	while(numeroRestante!=0)
		{
		 resto=numeroRestante%10;
		 numeroInvertido=numeroInvertido*10+resto;
		 numeroRestante=numeroRestante/10;		 		 
		}
	
	// Si el número origen y el destino son el mismo, es que es capicua
		if(numeroInvertido==numero)
		 System.out.println("El número " + numeroInvertido + ", SÍ es capicua.");
			else
			 System.out.println("El número " + numero + ", NO es capicua.");
	
	teclado.close();
				
}

}

		
		
