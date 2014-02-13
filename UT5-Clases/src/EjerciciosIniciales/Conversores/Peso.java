package EjerciciosIniciales.Conversores;

/*
 Ejercicio 6. Crea la clase peso, la cual tendrá las siguientes características:

Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
En el constructor se le pasará el peso y la medida en la qué se ha tomado ‘Lb’ para libras, 
‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Deberá tener los siguientes métodos:
getLibras. Devuelve el peso en libras.
getLingotes. Devuelve el peso en lingotes.
getPeso. 
Devuelve el peso en la medida que se pase como parámetro (‘Lb' para libras, ‘Li’ para lingotes, 
‘Oz’ para onzas, ‘P’ para peniques, ‘K' para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Para la realización del ejercicio toma como referencia los siguientes datos: 1 Libra = 16 
onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg. 1 Onza = 0,0625 libras = 28,35 gramos. 
1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
 */
public class Peso {

	private double pesoKg;
	public static String medida;
	public double libras;
	public double lingotes;
	
	public Peso(double peso, String medida){
		this.pesoKg=peso;
		this.medida=medida;
	}
	public void Convertir(String medida){
		if(this.medida.equals(medida)){
				
		}
		
	}
	public double getPeso() {
		return pesoKg;
	}

	public double getLibras() {
		return libras;
	}

	public double getLingotes() {
		return lingotes;
	}

}
