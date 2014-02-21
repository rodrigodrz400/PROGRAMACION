package EjerciciosIniciales.NumerosRacionales;

public class PruebaRacional {

	public static void main(String[] args) {
		/*
		 Racional fracion1 = new Racional(3,4);
		Racional fracion2 = new Racional (2,5);
		
		System.out.println(Racional.suma(fracion1, fracion2));
		
		//System.out.println(fracion1.toFloatString());
		 */
		
		Racional fracion1 = new Racional(1,8);
		Racional fracion2 = new Racional(1,4);

		System.out.println(fracion1.toString());
		
		System.out.println(Racional.suma(fracion1, fracion2));

		fracion1.Sumar(fracion2);

		System.out.println(fracion1.toString());

		fracion1.Restar(fracion2);

		System.out.println(fracion1.toString());

		fracion1.Multiplicar(fracion1);

		System.out.println(fracion1.toString());

		fracion1.Dividir(fracion2);

		System.out.println(fracion1.toString());
		
		System.out.println(fracion1.toFloatString());
	}

}
