package EjercicosVectoresYmatrices;

public class E3cicloDaw {

	/*
	 Ejercicio 3. Queremos guardar en la memoria del ordenador el número de alumnos matriculados (por módulos) 
	 en el ciclo de DAW. Sabemos que los alumnos matriculados por cada módulo son:

		21 alumnos matriculados en Sistemas Informáticos.
		17 alumnos matriculados en Base de Datos.
		30 alumnos matriculados en Programación.
		14 alumnos matriculados en Lengaje de Marcas.
		12 alumnos matriculados en Entornos de Desarrollo.
		25 alumnos matriculados en Acceso a Datos.
	 */
	public static void main(String[] args) {
		
		String [] modulos ={"Sistemas Informáticos.","Base de Datos.","Programación.","Lengaje de Marcas.",
							"Entornos de Desarrollo.","Acceso a Datos."};
		int [] alumnos = {21,17,30,14,12,25};
		
		for(int i=0; i<modulos.length; i++){
			System.out.println(alumnos[i] + " alumnos matriculados en " + modulos[i]);
		}
		
		
		

	}

}
