package EjerciciosPracticas;

import java.util.Scanner;

public class Capicua {

	//Lee un n�mero por consola y comprueba si es pal�ndromo (capic�a).
	//Pista: si creas un n�mero con los d�gitos en orden inverso al leido, 
	//y al compararlos resulta que son iguales, ser� capic�a.
	public static void main(String[] args) {
	long numero= 0;
	
	System.out.println("Inserte un n�mero para comprobar si es o no capic�a");
	Scanner teclado = new Scanner (System.in);
	numero = teclado.nextLong();
	
	//1.Para obtener el �ltimo d�gito del n�mero lo haremos con el resto de una divisi�n entre diez. 
    //2.Del n�mero original hay que quitarle el �ltimo d�gito. En este caso utilizamos la divisi�n entre 10.
	
	long numeroRestante;
	long numeroInvertido;
	long resto;

	while(numero<=0);
	 numeroRestante=numero;
	 numeroInvertido=0;
	 resto=0;

	// El c�digo que viene a continuaci�n da la vuelta a un numero
	while(numeroRestante!=0)
		{
		 resto=numeroRestante%10;
		 numeroInvertido=numeroInvertido*10+resto;
		 numeroRestante=numeroRestante/10;		 		 
		}
	
	// Si el n�mero origen y el destino son el mismo, es que es capicua
		if(numeroInvertido==numero)
		 System.out.println("El n�mero " + numeroInvertido + ", S� es capicua.");
			else
			 System.out.println("El n�mero " + numero + ", NO es capicua.");
	
	teclado.close();
				
}

}

		
		
