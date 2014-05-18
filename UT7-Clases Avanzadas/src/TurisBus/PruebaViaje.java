package TurisBus;

public class PruebaViaje {

	public static void main(String[] args) {
		
		Viaje viaje_1 = new Viaje("001","Menasalbas - Toledo","15:45","17:55",3);
		
		Parada parada_1 = new ParadaLibre("Galvez", "16:00","16:05");
		Parada parada_2 = new ParadaLibre("Polán", "16:35", "16:40");
		Parada parada_3 = new ParadaActividad("Guadamur","16:50","17:30","Visita Castillo Guadamur",25.1);
		
		viaje_1.añadirParada(parada_1);
		viaje_1.añadirParada(parada_2);
		viaje_1.añadirParada(parada_3);
		
		System.out.println(viaje_1);	

	}

}
