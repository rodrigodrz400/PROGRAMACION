package Actividades_4;

public class FechaB {

		private int mes; // 1-12
		private int dia; // 1-31 con base en el mes
		private int anio; // cualquier año

		private static final int[] diasPorMes = // días en cada mes
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// constructor: llama a comprobarMes para confirmar el valor apropiado para
		// el mes;
		// llama a comprobarDia para confirmar el valor apropiado para el día
		public FechaB(int elMes, int elDia, int elAnio) {
			mes = comprobarMes(elMes); // valida el mes
			anio = comprobarAnio(elAnio); // pudo validar el año
			dia = comprobarDia(elDia); // valida el día

			System.out.printf("Constructor de objeto Fecha para la fecha %s\n",
					this);
		} // fin del constructor de Fecha

		// método utilitario para confirmar el valor apropiado del mes
		private int comprobarMes(int mesPrueba) {
			if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
				return mesPrueba;
			else
				// mes es inválido
				throw new IllegalArgumentException("el mes debe ser 1 a 12");
		} // fin del método comprobarMes

		// método utilitario para confirmar el valor apropiado del día, con base en
		// el mes y el año
		private int comprobarDia(int diaPrueba) {
			// comprueba si el día está dentro del rango para el mes
			if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
				return diaPrueba;

			// comprueba si es año bisiesto
			if (mes == 2 && diaPrueba == 29
					&& (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
				return diaPrueba;

			throw new IllegalArgumentException(
					"dia fuera de rango para el mes y anio especificados");
		} // fin del método comprobarDia

		// método utilitario para confirmar el valor apropiado del anio
		private int comprobarAnio(int anioPrueba) {

			if (anioPrueba > 1492 && anioPrueba <= 3000)
				return anioPrueba;
			else
				throw new IllegalArgumentException("el anio no es correcto, loco");
		} // fin del método comprobarAnio

		// devuelve un objeto String de la forma mes/dia/anio
		public String toString() {
			return String.format("%d/%d/%d", dia, mes, anio);
		} // fin del método toString

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
			System.out.print(calendario3 + " + 1 día = " );
			calendario3.siguienteDía();
			System.out.println(calendario3);

			System.out.print(calendario);
			for(int i=0;i<10;i++) {
				calendario.siguienteDía();
				System.out.println("\t"+ calendario);
			}

			System.out.println("un día mas " + calendario3.toString());
			Fecha calendario4 = new Fecha(2, 29, 2012);

		}
}