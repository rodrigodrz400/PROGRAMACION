package EjerciciosPracticas;

import java.util.Scanner;

public class Fibonacci {

	//Crea una colección con los primeros X números de la serie de Fibonacci, 
	//donde X es un número que pedirás al usuario. Después pregunta números y di si está en esa serie o no. 
	//El programa terminará cuando el usuario introduzca un 0.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int fibo1 = 1,fibo2 = 1;
        int numero= 1;
        int numeroSerie;
        int [] listaNumeros = new int [numero]; 
		
	
      
       
            System.out.println("Introduce un número para conocer su serie Fibonacci: ");
            numero = teclado.nextInt();
          if (numero !=0){
        	  System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 
		
	
		              System.out.print(fibo1 + " ");
		              for(int i=0;i<=numero;i++){
		                   System.out.print(fibo2 + " ");
		                   fibo2 = fibo1 + fibo2;
		                   fibo1 = fibo2 - fibo1;
		                   listaNumeros [i] = fibo2;
		               	}System.out.println();
		              	do{
		 		            System.out.println("Introduzca otro número para comprobar si esta en la serie");
		 		            numeroSerie = teclado.nextInt();
		 		            for(int j=0;j<=listaNumeros.length;j++)
			 		            if (numeroSerie==listaNumeros.length){
			 		            	System.out.println("El número esta dentro de serie");
			 		            } System.out.println("El número no esta dentro de la serie");
		 		       }while(numeroSerie!=0);
		          	}
	
        if (numero==0){
            System.out.println("Ha introducido el número cero");
            System.out.println("----Fin el programa----");
        	} 
        
        	
		teclado.close();
	}

}
