package EjercicosVectoresYmatrices;

public class E2notasAlumnos {
	/*
	 * Ejercicio 2. Declara y crea un tipo de variable que sea capaz de contener
	 * la nota que han obtenido 4 alumnos en los diferentes módulos en los que
	 * están matriculados. Sabemos que el primer alumno está matriculado en 4
	 * módulos; el segundo, en 7 módulos; el tercero, en 3 módulos, yel cuarto,
	 * en 2 módulos.
	 */
	public static void main(String[] args) {
		int alumnos = 4;

		int[][] notas;

		notas = new int[alumnos][];

		notas[0] = new int[4];
		notas[0][0] = 5;
		notas[0][1] = 5;
		notas[0][2] = 5;
		notas[0][3] = 5;
		notas[1] = new int[7];
		notas[1][0] = 5;
		notas[1][1] = 5;
		notas[1][2] = 5;
		notas[1][3] = 5;
		notas[1][4] = 5;
		notas[1][5] = 5;
		notas[1][6] = 5;
		notas[2] = new int[3];
		notas[2][0] = 5;
		notas[2][1] = 5;
		notas[2][2] = 5;
		notas[3] = new int[2];
		notas[3][0] = 5;
		notas[3][1] = 5;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print("\t" + notas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
