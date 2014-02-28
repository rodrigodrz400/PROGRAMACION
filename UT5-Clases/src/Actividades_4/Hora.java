package Actividades_4;
/*
 Ejercicio 2 Añade los métodos tick, incrementarMinuto e incrementarHora que incrementan la 
 hora en 1 segundo, 1 minuto y 1 hora respectivamente. Crea un programa que prueba el 
 funcionamiento de estos métodos. Has de asegurarte de que funcionan bien los siguientes casos:

  a. incremento al siguiente minuto, b. incremento a la siguiente hora, c. incremento al siguiente día.
 */
public class Hora {
	//Atributos de la clase
	//private int dia;
	private int hora;
	private int min;
	private int seg;
	//Constructores
	 public Hora(){
		 this.hora=0;
		 this.min=0;
		 this.seg=0;
	 }
	 public Hora(int hora, int min, int seg){
		 this.hora=hora;
		 this.min=min;
		 this.seg=seg;
	 }
	//Métodos auxiliares
	@Override
	public String toString() {
		
		return String.format("Hora: %02d:%02d:%02d",hora,min,seg);
		
	    /*
		      return (hora<10? "0" : "") + hora +
		             (min<10? "0" : "" ) + ":" + min +
				     (seg<10? "0" : "") + ":" + seg;		*/
	     
			  
	}
	//Métodos
	private void comprobarHora(){
		if (this.hora >= 24){
			this.hora = this.hora - 24;
			
		}
	}
	private void comprobarMin(){
		if (this.min >= 60){
			this.min = this.min -60;
			this.hora += 1;
		}
	}
	private void comprobarSeg(){
		if (this.seg >= 60){
			this.seg = this.seg -60;
			this.min += 1;
		}
	}
	
	public void suma(Hora otro){
		this.hora += otro.getHora();
		comprobarHora();
		this.min += otro.getMin();
		comprobarMin();
		this.seg += otro.getSeg();
		comprobarSeg();
	}
	public void incrementarSeg()	{
		this.seg += 1;
		comprobarSeg();
	}
	public void incrementarMin()	{
		this.min += 1;
		comprobarMin();
	}
	public void incrementarHora(){
		this.hora += 1;
		comprobarHora();
	}
	//Accesadores
	public int getHora() {
		return hora;
	}
	public int getMin() {
		return min;
	}
	public int getSeg() {
		return seg;
	}	
	public void setHora(int hora) {
		this.hora = hora;
	}
	public static void main(String[] args) {
		Hora sinhora;
		Hora mihora;
		Hora otrahora;
		
		sinhora = new Hora();
		mihora=new Hora(12,45,32);
		otrahora=new Hora(1,15,0);
		
		System.out.println("Mi hora es: ");
		sinhora.suma(mihora);
		System.out.println(sinhora.toString());
		System.out.println("Si a mi hora actual le sumo mi otra hora: "+  otrahora + 
							"\nMi hora actual sería: "  );
		sinhora.suma(otrahora);
		System.out.println(sinhora.toString());
		System.out.println("Le incrementamos una hora.");
		sinhora.incrementarHora();
		System.out.println(sinhora.toString());
		System.out.println("Le sumamos 12 horas, 45 minutos, y 32 segundos.");
		sinhora.suma(mihora);
		System.out.println(sinhora.toString());
		System.out.println("Le incrementamos un minuto.");
		sinhora.incrementarMin();
		System.out.println(sinhora.toString());
		System.out.println("Le incrementamos una hora.");
		sinhora.incrementarHora();
		System.out.println(sinhora.toString());
		
		System.out.println("\nImprimo mi hora. \t " + mihora + "\nImprimo mi otra hora. \t " + otrahora + "\n");
		
		System.out.println("Probando incrementos de tiempo");
		Hora prueba;
		prueba= new Hora(0,0,0);
		
		for(int i=0; i<65;i++,prueba.incrementarSeg()){
			System.out.println(prueba);
		}

	}

}
