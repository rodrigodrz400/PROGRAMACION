package EjercicosVectoresYmatrices;

import java.util.Scanner;

public class E6letraDNI {

	/*
	   Ejercicio 6. 
	   Escribe un programa que obtenga la letra del DNI. El procedimiento para obtener la letra
	   consiste en dividir el número del DNI por 23. La parte entera del resultado obtenido se multiplica por 23.
	   Seguidamente, al DNI original se le resta el último resultado obtenido. Como resultado final de esta última 
	   operación dará un número que estará siempre comprendido entre 0 y 23. Según el valor de este último, 
	   se aplicará la siguiente tabla: 0=T 1=R 2=W 3=A 4=G 5=M 6=Y 7=F 8=P 9=D 10=X 11=B 12=N 13=J 14=Z 
	   15=S 16=Q 17=V 18=H 19=L 20=C 21=K 22=E 23=O
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String [] DNI = {"T","R","W","A","G","M","Y","F","P","D","X",
						 "B","N","J","Z","S","Q","V","H","L","C",
						 "K","E"};
		int numDNI = 0;
		int res=0;
		int letraDNI=0;
		
		/*
		  System.out.println("Introduzca los números del DNI para calcular su letra: ");
		 for (int i=0; i<8; i++){
			 numDNI=teclado.nextInt();
			 sumaDNI += numDNI;
		 }
		res=sumaDNI/23;
		res=res*23;
		letraDNI=sumaDNI-res;
		
		System.out.println("La letra que le corresponde a su número de DNI es: " + DNI[letraDNI]);
		 */
		
		 System.out.println("Introduzca los números del DNI para calcular su letra: ");
		 numDNI=teclado.nextInt();
		 
		 res=numDNI/23;
		 res=res*23;
		 letraDNI=numDNI-res;
			
		System.out.println("La letra que le corresponde a su número de DNI es: " + DNI[letraDNI]);
	}

}
