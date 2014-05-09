package EjerciciosIniciales.FiguraCuadrado;

public class PruebaFigura {

	
	public static void main(String[] args) {
		Rectangulo rectangulo;
		Cuadrado cuadrado;
		
		cuadrado = new Cuadrado(5);
		System.out.println("CUADRADO de (filas por columnas): " + cuadrado.getAncho()+" x "
							+ cuadrado.getAncho());
		cuadrado.dibujar();
		System.out.println("El area del cuadrado es: " + cuadrado.areaCuadrado());
		System.out.println("El perímetro del cuadrado es: " + cuadrado.perimetroCuadrado());
		
		System.out.println("\n");
		
		rectangulo = new Rectangulo(3,13);
		System.out.println("RECTANGULO de (filas por columnas): "+ rectangulo.getAncho() +" x "
							+rectangulo.getLargo());
		rectangulo.dibujar();
		System.out.println("El area del rectangulo es: " + rectangulo.areaRectangulo());
		System.out.println("El perímetro del rectangulo es: " + rectangulo.perimetroRectangulo());
		System.out.println(rectangulo.orientacion());
		
		
		
		

	}

}
