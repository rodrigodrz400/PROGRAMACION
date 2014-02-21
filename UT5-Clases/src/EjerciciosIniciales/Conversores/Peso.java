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
	private double peso;
	public String medida;
	public double libras;
	public double lingotes;
	
	public Peso(double peso, String medida){
		this.peso=peso;
		this.medida=medida;
	}
	/*
	private double peso; 
	
	public Peso2(double peso, String unidad){
	this.peso = peso * factorConversion(unidad)
	} 
	
	private dobule factorConversion(String unidad){
	double factor;
	
		switch(unidad)
		case "lb" : factor= 453/1000; break;
		case "li" : factor= 14.59; break; 
		case "oz" : factor= (28.35/1000); break;
		case "P"  : factor= (1.55/1000); break;
		case "k"  : factor= 1; break;
		case "g"  : factor= 1000; break;
		case "q"  : factor= 43.3; break;
		default   : factor=1
	}
	
	public double getLibras() {
	return peso/factorConversion("lb");
	}
	public double getLingotes() {
	return peso/factorConversion("li");
	}
	public double getPeso (String medida) {
	return peso/factorConversion(medida)
	}
	 */
	
	public double getPeso() {
		if(this.medida.equalsIgnoreCase("lb")){
			this.pesoKg = this.peso * 453/1000;
		}else if (medida.equalsIgnoreCase("li")){
			this.pesoKg = this.peso * 14.59;
		}else if (this.medida.equalsIgnoreCase("oz")){
			this.pesoKg = this.peso * 28.35/1000;
		}else if (this.medida.equalsIgnoreCase("P")){
			this.pesoKg = this.peso * 1.55/1000;
		}else if (this.medida.equalsIgnoreCase("k")){
			this.pesoKg = this.peso * 1;
		}else if (this.medida.equalsIgnoreCase("g")){
			this.pesoKg = this.peso * 1000;
		}else if (this.medida.equalsIgnoreCase("q")){
			this.pesoKg = this.peso * 43.3;
		}
		
		return Math.rint(pesoKg*100)/100;
	}

	public double getLibras() {
		libras = this.peso * 2.20;
		return Math.rint(libras*100)/100;
	}

	public double getLingotes() {
		lingotes = this.peso / 14.59;
		return Math.rint(lingotes*100)/100;
	}
	

}
