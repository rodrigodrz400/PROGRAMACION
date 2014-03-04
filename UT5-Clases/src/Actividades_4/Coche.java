package Actividades_4;
/*
 La clase Coche tendrá los atributos privados modelo, matrícula, marca y color. 
 Crea los constructores que estimes necesarios, los get/set necesarios y el método toString().
 */
public class Coche {
	private String marca;
	private String modelo;	
	private String color;
	private String matricula;	
	
	
	public Coche() {
		
		this.marca = "Marca por defecto.";
		this.modelo = "Modelo por defecto.";		
		this.color = "Color por defecto.";
		this.matricula = "Matricula por defecto.";
		
	}
	
	public Coche(String marca, String modelo, String color, String matricula) {
		
		this.marca = marca;
		this.modelo = modelo;		
		this.color = color;
		this.matricula = matricula;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString(){
		
		return String.format("======================================\n"
				           + "Marca: %s\nModelo: %s\nColor: %s\nMatrícula: %s\n"
				           + "======================================\n", 
				           this.getMarca(),this.getModelo(),this.getColor(),this.getMatricula());
	}

}
