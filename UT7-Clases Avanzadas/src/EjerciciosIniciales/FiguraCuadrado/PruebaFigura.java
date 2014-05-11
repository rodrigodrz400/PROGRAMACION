package EjerciciosIniciales.FiguraCuadrado;

public class PruebaFigura {

	
	public static void main(String[] args) {
		Rectangulo rectangulo;
		Cuadrado cuadrado;
		
		cuadrado = new Cuadrado(5);
		System.out.println("CUADRADO de (filas por columnas): " + cuadrado.getAncho()+" x "
							+ cuadrado.getAncho());
		cuadrado.dibujar();
		System.out.println("El area del cuadrado es: " + cuadrado.area());
		System.out.println("El per�metro del cuadrado es: " + cuadrado.perimetro());
		
		System.out.println("\n");
		
		rectangulo = new Rectangulo(3,13);
		System.out.println("RECTANGULO de (filas por columnas): "+ rectangulo.getAncho() +" x "
							+rectangulo.getLargo());
		rectangulo.dibujar();
		System.out.println("El area del rectangulo es: " + rectangulo.area());
		System.out.println("El per�metro del rectangulo es: " + rectangulo.perimetro());
		System.out.println(rectangulo.orientacion());
		System.out.println("�El rectangulo es horizontal? "+rectangulo.esHorizontal());
		


	}

}
