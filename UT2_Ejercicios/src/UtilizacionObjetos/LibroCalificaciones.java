
//Fig 3.7: LibroCalificaciones.java
//Declaración de una clase con un método
//Clase LibroCalificaciones que contiene una variable de instancia nombreDelCurso y métodos para establecer y obtener su valor

package UtilizacionObjetos;

//Declaración de una clase con un método
public class LibroCalificaciones 
{
	
	private String nombreDelCurso; //Declaro la variable,,,,El nombre del curso para este LibroCalificaciones
	
	//El constructor inicializa nombreDelCurso con un argumento String
	public LibroCalificaciones (String nombre) //El nombre del constructor es el nombre de la clase
	{
		nombreDelCurso=nombre; //inicializa el nombreDelCurso
		
	}//fin del constructor
	
	
	//Método para ESTABLECER el nombre del curso
	public void establecerNombreDelCurso (String nombre)
	{
		nombreDelCurso = nombre; //Almacena en nombre del curso en memoria
		
	}//fin del método establecerNombreDelCurso
	
	//Método para OBTENER el nombre del curso
	public String obtenerNombreDelCurso ()
	{
		return nombreDelCurso;
		
	}
	
	//Muestra un mensaje de bienvenida al usuario de LibroCalificaciones
	public  void mostrarMensaje(String nombreCurso)
	{
		//esta instrucción llama a obteneNombreDelCurso para obtener el nombre del curso que representa enste LibroCalificaciones
		System.out.printf("Bienvenido al libro de calificaciones para:\n%s ", obtenerNombreDelCurso());

	} //Fin del método mostrarMensaje

}//Fin de la clase LibroCalificaciones
