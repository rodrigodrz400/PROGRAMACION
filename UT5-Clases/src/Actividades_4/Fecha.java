package Actividades_4;
/*
 Ejercicio 4 Mejora la clase Fecha a partir del siguiente c�digo:
 
 A�ade la comprobaci�n de errores en los valores de inicializaci�n de a�o. 
 A�ade un m�todo llamado siguienteD�a para incrementar el d�a en uno. 
 El objeto fecha siempre tendr� un valor con sentido.
 Escribe un programa para probar el funcionamiento del m�todo, para lo que imprimir� la secuencia de
  	varios d�as en los que cambie el mes y el a�o.
 */
public class Fecha {
	   private int mes; // 1-12
	   private int dia;   // 1-31 con base en el mes
	   private int anio;  // cualquier a�o

	   private static final int[] diasPorMes = // d�as en cada mes  
	      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
	   // llama a comprobarDia para confirmar el valor apropiado para el d�a
	   public Fecha( int elDia, int elMes, int elAnio )
	   {
		  anio = comprobarAnio (elAnio); // pudo validar el a�o
		  mes = comprobarMes ( elMes ); // valida el mes
		  dia = comprobarDia ( elDia ); // valida el d�a
	     
	      System.out.printf( 
	         "Constructor de objeto Fecha para la fecha %s\n", this );
	   } // fin del constructor de Fecha

	   // m�todo utilitario para confirmar el valor apropiado del a�o
	   private int comprobarAnio( int anioPrueba )
	   {
	      if ( anioPrueba > 1500 && anioPrueba <= 3000 ) // valida el a�o
	         return anioPrueba;
	      else // el a�o es inv�lido
	         throw new IllegalArgumentException ( "el a�o debe estar comprendido entre 1500 d.c y el 3000 d.c."); 
	   } // fin del m�todo comprobarMes
	   
	   // m�todo utilitario para confirmar el valor apropiado del mes
	   private int comprobarMes( int mesPrueba )
	   {
		   
	      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
	         return mesPrueba;
	      else // mes es inv�lido
	         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
	   } // fin del m�todo comprobarMes

	   // m�todo utilitario para confirmar el valor apropiado del d�a, con base en el mes y el a�o
	   private int comprobarDia( int diaPrueba )
	   {
	      // comprueba si el d�a est� dentro del rango para el mes
	      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
	         return diaPrueba;

	      // comprueba si es a�o bisiesto
	      if ( mes == 2 && diaPrueba == 29 && ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) 
	    	 // ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	            return diaPrueba; 

	         throw new IllegalArgumentException(
	            "dia fuera de rango para el mes y anio especificados" );
	   } // fin del m�todo comprobarDia

	   // devuelve un objeto String de la forma mes/dia/anio
	   public String toString()
	   { 
	      return String.format( "%02d/%02d/%d", dia, mes, anio ); 
	   } // fin del m�todo toString
	 // fin de la clase Fecha
	   public void siguienteD�a(){
		   this.dia++;
		   try{
			   comprobarDia(this.dia);
		   }catch(IllegalArgumentException iae){
			   this.dia=1;
			   this.mes +=1;
			   if (this.mes >= 12){
				   this.mes = 1;
				   this.anio ++;
				   comprobarAnio(this.anio);
			   }
		   }
		   
	   }
	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(29,2,2012);
		System.out.println("Sumamos un d�a a la fecha " + fecha1);
		fecha1.siguienteD�a();
		System.out.println(fecha1);
		Fecha fecha2 = new Fecha(1,1,2014);
		Fecha fecha3 = new Fecha(31,12,2000);
		Fecha fecha4 = new Fecha(30,9,2020);



	}

}
