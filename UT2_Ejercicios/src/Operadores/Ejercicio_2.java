package Operadores;

//2.Completa la siguiente tabla (crea también un programa Java que muestre la tabla realizando cada uno de los cálculos):

public class Ejercicio_2 {

	public static void main(String[] args) {

		boolean a, b ;
		
		System.out.println("a\tb\ta and b\ta or b\tnot a\tnot b");
		
		a= (3>5);
		b= (12 !=8);
		
		System.out.print("(3<5\t(12!=8)\t" + (a && b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print( !a);
		System.out.print("\t");
		System.out.println(!b + "\n");
		
		a= 5>=6;
		b= 3!=3;
		
		System.out.print("(5>=6\t(3!=3)\t" + (a && b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print( !a);
		System.out.print("\t");
		System.out.println(!b + "\n");
		
		/*a= -7==8;
		b= 22; */
		
		System.out.print("(-7==8\t22)\t" + "error");
		System.out.print("\t");
		System.out.print("error");
		System.out.print("\t");
		System.out.print("error");
		System.out.print("\t");
		System.out.println("error" + "\n");
		
		
		a= 21!=12;
		b= true;
		
		System.out.print("21!=12\tTRUE\t" + (a && b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print( !a);
		System.out.print("\t");
		System.out.println(!b + "\n");
		
		a= 4==2;
		b= 7>=-9;
		
		System.out.print("4==2\t7>=-9\t" + (a && b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print( !a);
		System.out.print("\t");
		System.out.println(!b + "\n");
		
		
		
	}

}
