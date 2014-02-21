package EjerciciosIniciales.ConcesionarioCoches;
/*
 Ejercicio 2. Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí.
  Los dos constructores inicializarán los atributos marca y modelo de la clase. 
  Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona 
  correctamente.
 */
public class Coche {
	
	private String marca;
	private String modelo;
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		Coche other = (Coche) obj;
		if (this.marca.equals(other.getMarca()) && this.modelo.equals(other.getModelo()))
		return true;
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}


	public Coche(){
		this.marca= "Seat";
		this.modelo= "Ibiza";
	}
	public Coche(String marca, String modelo){
		this.marca=marca;
		this.modelo=modelo;
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
	

	
	
}
