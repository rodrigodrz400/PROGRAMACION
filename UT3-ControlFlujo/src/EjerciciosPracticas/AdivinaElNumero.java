package EjerciciosPracticas;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
	       
               Scanner teclado = new Scanner(System.in);
               int numeroOculto;
               int numeroIntroducido;
               numeroOculto = (int) (Math.random() * 100 +1);
               // System.out.println(numoculto);
               numeroIntroducido = 0;
               System.out.println("Dime un número del 1 al 100, a ver si aciertas el número oculto: ");
               
               //para conocer la hora actual utiliza System.currentTimeMillis()
           long start = System.currentTimeMillis();
           long intervalo;
                           
               for(int i = 1; i<=10 && numeroOculto != numeroIntroducido;i++){
                       System.out.println("Intento " + i);
                       numeroIntroducido = teclado.nextInt();
                       
                       intervalo = (System.currentTimeMillis() - start)/1000;
                       System.out.println("LLevas " + intervalo + " segundos jugados.");
                       
                       if(numeroOculto != numeroIntroducido && i!=10){
                               if(numeroOculto > numeroIntroducido){
                                       System.out.println("El número oculto es más grande que el que has introducido");
                               }else{
                                       System.out.println("El número oculto es más pequeño que el que has introducido");
                               }
                       }
               }
               
               if(numeroOculto == numeroIntroducido){
                       System.out.println("Has acertado");
               }else{
                       System.out.println("No has acertado, y has agotado los 10 intentos");
               }
               teclado.close();

       }

}