package Actividades_4;

import EjerciciosIniciales.NumerosRacionales.Racional;

/*
 Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y 
 los segundos (números enteros). Un constructor inicializará estos datos a 0 y otro los 
 inicializará a valores pasados por parámetro. Un método de la clase devolverá la cadena 
 con formato: 12:45:32. Otro método, que tendrá un argumento de tipo Hora, sumará dicha
  hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32
Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. 
Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas 
y el resultante.
 */
public class Ejer1_Hora {
	private int hora;
	private int min;
	private int seg;
	
	 public Ejer1_Hora(){
		 this.hora=0;
		 this.min=0;
		 this.seg=0;
	 }
	 public Ejer1_Hora(int hora, int min, int seg){
		 this.hora=hora;
		 this.min=min;
		 this.seg=seg;
	 }
	 
	@Override
	public String toString() {
		return hora + ":" + min + ":" + seg;
	}

	public void suma(Ejer1_Hora otro){
		this.hora += otro.getHora();
		if (this.hora >= 24){
			this.hora = this.hora - 24;
		}
		this.min += otro.getMin();
		if (this.min >= 60){
			this.min = this.min -60;
			this.hora += 1;
		}
		this.seg += otro.getSeg();
		if (this.seg >= 60){
			this.seg = this.seg -60;
			this.min += 1;
		}
			
	}
	public int getHora() {
		return hora;
	}
	public int getMin() {
		return min;
	}
	public int getSeg() {
		return seg;
	}
	
	public static void main(String[] args) {
		Ejer1_Hora sinhora;
		Ejer1_Hora mihora;
		Ejer1_Hora otrahora;
		
		sinhora = new Ejer1_Hora();
		mihora=new Ejer1_Hora(12,45,32);
		otrahora=new Ejer1_Hora(1,15,0);
		
		System.out.println("Mi hora es: ");
		sinhora.suma(mihora);
		System.out.println(sinhora.toString());
		System.out.println("Si a mi hora actual le sumo "+  otrahora + ", mi hora actual sería: "  );
		sinhora.suma(otrahora);
		System.out.println(sinhora.toString());

	}

}
