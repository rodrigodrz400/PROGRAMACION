package PrimerosEjercicios;
/*

6. Indica cual es el resultado de las siguientes expresiones y más tarde comprueba en Java el resultado:

((4-2)*(5+1)/2)>2-(4+3)
(6+3)>8 && (6-1)* 2 < 8 || 2* 3==8
(1.0 < X) && (X < Z+7.0) //donde X=7 y Z=2
PI * X^X > Y || 2* PI* X <= Z //donde X=1, Y=4, Z=10, PI=3.14
X>3 && Y==4 || X + Y <= Z //donde X=1, Y=4, Z=10
X>3 && (Y==4 || X + Y <= Z) //donde X=1, Y=4, Z=10

*/


public class Ejercicio6 {

	public static void main(String[] args) {
		
	int X=0;
	int Z=0;
	int Y=0;
	final double PI;
		
	System.out.println(((4-2)*(5+1)/2)>2-(4+3));
	System.out.println((6+3)>8 && (6-1)* 2 < 8 || 2* 3==8);
	
	X=7;
	Z=2;
	
	System.out.println((1.0 < X) && (X < Z+7.0) );//donde X=7 y Z=2
	
	X=1;
	Y=4;
	Z=10;
	PI = Math.PI;
	
	System.out.println(PI * Math.pow(X, X) > Y || 2* PI* X <= Z) ;//donde X=1, Y=4, Z=10, PI=3.14
	
	X=1;
	Y=4;
	Z=10;
	
	System.out.println(X>3 && Y==4 || X + Y <= Z ); //donde X=1, Y=4, Z=10
	
	X=1;
	Y=4;
	Z=10;
	
	System.out.println(X>3 && (Y==4 || X + Y <= Z) ); //donde X=1, Y=4, Z=10
	
	

	}

}
