package Actividades_4;
/*
 Ejercicio 4 Mejora la clase Fecha a partir del siguiente código:
 
 Añade la comprobación de errores en los valores de inicialización de año. 
 Añade un método llamado siguienteDía para incrementar el día en uno. 
 El objeto fecha siempre tendrá un valor con sentido.
 Escribe un programa para probar el funcionamiento del método, para lo que imprimirá la secuencia de
  	varios días en los que cambie el mes y el año.
 */
public class Fecha {
	   private int mes; // 1-12
	   private int dia;   // 1-31 con base en el mes
	   private int anio;  // cualquier año

	   private static final int[] diasPorMes = // días en cada mes  
	      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
	   // llama a comprobarDia para confirmar el valor apropiado para el día
	   public Fecha( int elDia, int elMes, int elAnio )
	   {
		  anio = comprobarAnio (elAnio); // pudo validar el año
		  mes = comprobarMes ( elMes ); // valida el mes
		  dia = comprobarDia ( elDia ); // valida el día
	     
	      System.out.printf( 
	         "Constructor de objeto Fecha para la fecha %s\n", this );
	   } // fin del constructor de Fecha

	   // método utilitario para confirmar el valor apropiado del año
	   private int comprobarAnio( int anioPrueba )
	   {
	      if ( anioPrueba > 1500 && anioPrueba <= 3000 ) // valida el año
	         return anioPrueba;
	      else // el año es inválido
	         throw new IllegalArgumentException ( "el año debe estar comprendido entre 1500 d.c y el 3000 d.c."); 
	   } // fin del método comprobarMes
	   
	   // método utilitario para confirmar el valor apropiado del mes
	   private int comprobarMes( int mesPrueba )
	   {
		   
	      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
	         return mesPrueba;
	      else // mes es inválido
	         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
	   } // fin del método comprobarMes

	   // método utilitario para confirmar el valor apropiado del día, con base en el mes y el año
	   private int comprobarDia( int diaPrueba )
	   {
	      // comprueba si el día está dentro del rango para el mes
	      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
	         return diaPrueba;

	      // comprueba si es año bisiesto
	      if ( mes == 2 && diaPrueba == 29 && ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) 
	    	 // ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	            return diaPrueba; 

	         throw new IllegalArgumentException(
	            "dia fuera de rango para el mes y anio especificados" );
	   } // fin del método comprobarDia

	   // devuelve un objeto String de la forma mes/dia/anio
	   public String toString()
	   { 
	      return String.format( "%02d/%02d/%d", dia, mes, anio ); 
	   } // fin del método toString
	 // fin de la clase Fecha
	   public void siguienteDía(){
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
		System.out.println("Sumamos un día a la fecha " + fecha1);
		fecha1.siguienteDía();
		System.out.println(fecha1);
		Fecha fecha2 = new Fecha(1,1,2014);
		Fecha fecha3 = new Fecha(31,12,2000);
		Fecha fecha4 = new Fecha(30,9,2020);



	}

}
