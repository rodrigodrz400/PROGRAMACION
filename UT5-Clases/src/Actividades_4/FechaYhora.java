package Actividades_4;

public class FechaYhora {

	/*
	 Ejercicio 5 Crea la clase FechaYHora. La clase utiliza la clase Hora definida en el ejercicio 1,
	  	y la clase Fecha del ejercicio anterior, ya que queremos que almacene tanto la fecha como la hora.
	   	Crea un nuevo método siguienteHora que incrementa la hora pero que también llame al métodosiguienteDía
	    si es necesario porque se avanza un día. Crea el método aCadena (toString()) que muestre la fecha y
		la hora de forma conjunta. Escribe un programa que pruebe la nueva clase, especialmente el incremento de de
		hora que cambia el día.
	 */
	
	//Atributos de clase
	private Hora hora;
	private Fecha fecha;
	
	//Constructores
	public FechaYhora() {

		this.fecha = new Fecha(28,2,2014);
		this.hora = new Hora(0,0,0);
	}

	public FechaYhora(int dia, int mes, int anio, int hora, int minutos, int segundos) {

		this.fecha = new Fecha(dia,mes,anio);
		this.hora = new Hora(hora,minutos,segundos);
	}
	//Métodos auxiliares
	@Override
	public String toString() {
		return String.format("%s - %s", this.fecha, this.hora);
	}

	//Métodos
	public void siguenteHora(){
		if(hora.getHora()==23){
			hora.setHora(0);
			fecha.siguienteDía();
		}else{
			hora.incrementarHora();
		}
	}
	public static void main(String[] args) {
		
		FechaYhora fechaYhora = new FechaYhora();
		System.out.println(fechaYhora);
		
		System.out.println("Incrementamos la fecha en UNA hora: ");
		fechaYhora.siguenteHora();
		System.out.println(fechaYhora);
		
		System.out.println("Incrementamos la fecha en CINCO horas: ");
		for(int i=0; i<5; i++){
			fechaYhora.siguenteHora();
			System.out.println(fechaYhora);	
		}
		
		FechaYhora fechaYhora2 = new FechaYhora(28,2,2012,21,30,30);
		System.out.println(fechaYhora2);
		System.out.println("Incrementamos la fecha en CINCO horas: ");
		for(int i=0; i<5; i++){
			fechaYhora2.siguenteHora();
			System.out.println(fechaYhora2);	
		}
		System.out.println("Incrementamos la fecha en VEINTICUATRO horas: ");
		for(int i=0; i<24; i++){
			fechaYhora2.siguenteHora();
			System.out.println(fechaYhora2);	
		}
		
	}

}
