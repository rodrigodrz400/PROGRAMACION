package Operadores;

public class Ejercicio_operadores {

	public static void main(String[] args) {
		/* (-5^2+10)*3
		 * 35.3-53/10
		 * 1+5%1.5*8/2
		 * -(-2^5+18/5)
		 * 65/3/4.0*3
		 * 44%10+7-25^10-2
		 * 4.0/10.0+3.5*2
		 * 10%4+6/2
		 * (|4-20/3|)^3
		 * sqrt(4.5-5.0)+7*3
		 * 3*10/3+10%3
		 * 3L*^3
		 * (36.0/4)+(5*3)
		 * (28/7)*2
		 * (13*3)%10
		 * (2^3)^3		 
		 */
		double resultado=0;
		
		resultado=(Math.pow(-5, 2)+10)*3;
		System.out.println("El resultado 1 de (-5^2+10)*3 es: "+resultado);
		
		resultado=35.3-53/10;
		System.out.println("El resultado 2 de 35.3-53/10 es: "+resultado);
		
		resultado=1+5%1.5*8/2;
		System.out.println("El resultado 3 de 1+5%1.5*8/23 es: "+resultado);
		
		resultado=-(Math.pow(-2, 5)+18/5);
		System.out.println("El resultado 4 de -(-2^5+18/5) es: "+resultado);
		
		resultado=65/3/4.0*3;
		System.out.println("El resultado 5 de 65/3/4.0*3 es: "+resultado);
		
		resultado=44%10+7-Math.pow(25, 10)-2;
		System.out.println("El resultado 6 de 44%10+7-25^10-2 es: "+resultado);
		
		resultado=4.0/10.0+3.5*2;
		System.out.println("El resultado 7 de 4.0/10.0+3.5*2 es: "+resultado);
		
		resultado=10%4+6/2;
		System.out.println("El resultado 8 de 10%4+6/2 es: "+resultado);
		
		resultado=Math.pow(Math.abs(4-20/3),3);
		System.out.println("El resultado 9 de (|4-20/3|)^3 es: "+resultado);
		
		resultado=Math.sqrt(4.5-5.0)+7*3;
		System.out.println("El resultado 10 de sqrt(4.5-5.0)+7*3 es: "+resultado);
		
		resultado=3*10/3+10%3;
		System.out.println("El resultado 11 de 3*10/3+10%3 es: "+resultado);
		
		resultado=Math.pow(3L, 3);
		System.out.println("El resultado 12 de 3L*^3 es: "+resultado);
		
		resultado=(36.0/4)+(5*3);
		System.out.println("El resultado 13 de (36.0/4)+(5*3) es: "+resultado);
		
		resultado=(28/7)*2;
		System.out.println("El resultado 14 de (28/7)*2 es: "+resultado);
		
		resultado=(13*3)%10;
		System.out.println("El resultado 15 de (13*3)%10 es: "+resultado);
		
		resultado=Math.pow(Math.pow(2, 3), 3) ;
		System.out.println("El resultado 16 de (2^3)^3 es: "+resultado);
		
	}

}
