package EjerciciosIniciales.Conversores;

public class Consumo {

		private double kms;			
		private double litros;		
		private double velMedia;		
		private double pvpGasolina;		

		public Consumo(double kmRecorridos, double litros, double velocidadMedia, double precioGasolina){
			this.kms = kmRecorridos;
			this.litros = litros;
			this.velMedia = velocidadMedia;
			this.pvpGasolina = precioGasolina;
		}

		public String getTiempo(){
			return redondeo(60 / this.velMedia * this.kms, 2) + "\t[minutos]";
		}

		private double getDoubleConsumoMedio(){
			return this.litros / this.kms * 100;
		}

		public String getConsumoMedio(){
			return redondeo(getDoubleConsumoMedio(), 2) + "\t[l/100km]";
		}

		public String getConsumoEuros(){
			return redondeo(getDoubleConsumoMedio() *  this.pvpGasolina, 2) + "\t[€/100km]";
		}

		public void setKms(double kmRecorridos){
			this.kms = kmRecorridos;
		}
		public void setLitros(double listros){
			this.litros = listros;
		}
		public void setVmed(double velocidadMedia){
			this.velMedia = velocidadMedia;
		}
		public void setPgas(double precioGasolina){
			this.pvpGasolina = precioGasolina;
		}


		private double redondeo(double n, int decimales){
			double mult = Math.pow(10, decimales);
			return Math.round(n * mult) / mult;
		}
	}