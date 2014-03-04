package Actividades_4;

public class FechaB {

		private int mes; // 1-12
		private int dia; // 1-31 con base en el mes
		private int anio; // cualquier a�o

		private static final int[] diasPorMes = // d�as en cada mes
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// constructor: llama a comprobarMes para confirmar el valor apropiado para
		// el mes;
		// llama a comprobarDia para confirmar el valor apropiado para el d�a
		public FechaB(int elMes, int elDia, int elAnio) {
			mes = comprobarMes(elMes); // valida el mes
			anio = comprobarAnio(elAnio); // pudo validar el a�o
			dia = comprobarDia(elDia); // valida el d�a

			System.out.printf("Constructor de objeto Fecha para la fecha %s\n",
					this);
		} // fin del constructor de Fecha

		// m�todo utilitario para confirmar el valor apropiado del mes
		private int comprobarMes(int mesPrueba) {
			if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
				return mesPrueba;
			else
				// mes es inv�lido
				throw new IllegalArgumentException("el mes debe ser 1 a 12");
		} // fin del m�todo comprobarMes

		// m�todo utilitario para confirmar el valor apropiado del d�a, con base en
		// el mes y el a�o
		private int comprobarDia(int diaPrueba) {
			// comprueba si el d�a est� dentro del rango para el mes
			if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
				return diaPrueba;

			// comprueba si es a�o bisiesto
			if (mes == 2 && diaPrueba == 29
					&& (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
				return diaPrueba;

			throw new IllegalArgumentException(
					"dia fuera de rango para el mes y anio especificados");
		} // fin del m�todo comprobarDia

		// m�todo utilitario para confirmar el valor apropiado del anio
		private int comprobarAnio(int anioPrueba) {

			if (anioPrueba > 1492 && anioPrueba <= 3000)
				return anioPrueba;
			else
				throw new IllegalArgumentException("el anio no es correcto, loco");
		} // fin del m�todo comprobarAnio

		// devuelve un objeto String de la forma mes/dia/anio
		public String toString() {
			return String.format("%d/%d/%d", dia, mes, anio);
		} // fin del m�todo toString

		private void siguienteAnio() {
			this.anio++;
			comprobarAnio(this.anio);
		}

		private void siguienteMes() {
			this.mes+=1;
			try {
				comprobarMes(this.mes);
			}catch (IllegalArgumentException iae) {
				this.mes=1;
				siguienteAnio();
			}
		}

		public void siguienteDia() {
			this.dia += 1;
			try {
				comprobarDia(this.dia);
			}catch (IllegalArgumentException iae) {
				this.dia=1;
				siguienteMes();
			}
		}

		public static void main(String[] args) {

			Fecha calendario = new Fecha(12, 29, 1988);
			Fecha calendario2 = new Fecha(5, 12, 1493);
			Fecha calendario3 = new Fecha(2, 29, 2012);
			System.out.print(calendario3 + " + 1 d�a = " );
			calendario3.siguienteD�a();
			System.out.println(calendario3);

			System.out.print(calendario);
			for(int i=0;i<10;i++) {
				calendario.siguienteD�a();
				System.out.println("\t"+ calendario);
			}

			System.out.println("un d�a mas " + calendario3.toString());
			Fecha calendario4 = new Fecha(2, 29, 2012);

		}
}