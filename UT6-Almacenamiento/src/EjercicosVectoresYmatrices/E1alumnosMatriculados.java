package EjercicosVectoresYmatrices;

public class E1alumnosMatriculados {
/*
 Ejercicio 1. Declara y crea un tipo de variable que sea capaz de contener el número de alumnos matriculados en
  4 institutos en 5 niveles de estudios: ESO, BACHILLERATO, CGM, CGS, PCPI.
 */
	
	
	public static void main(String[] args) {
		int institutos=4;
		int estudios=5;
		
		int [][] matriculados;
		/*
		String [] instituto ={"Instituto 1","Instituto 2","Instituto 3","Instituto 4"};
		String [] estudio ={"ESO","BACHILLERATO","CGM","CGS","PCPI"};
		
		for(int i=0; i<instituto.length;i++) 
 			System.out.println(instituto[i]);
		*/
		matriculados = new int [institutos][estudios];
		
		for(int i=0; i<matriculados.length;i++){
			for(int j=0; j<matriculados[i].length;j++){
				System.out.print("\t" + matriculados[i][j] +" ");	
			}
			System.out.println();
		}
		
		

	}
	
}
