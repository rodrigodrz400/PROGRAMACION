

	package Graficos.Ejemplos;


	import Graficos.Librerias.imagenes.*;
	

	public class Euribor {

	        public static void main(String[] args) {
	                
	                //CREACION DE BARRAS ENERO - OCTUBRE

	                Rectangle enero = new Rectangle( 200, 300, 100, 575 );
	                Rectangle febrero = new Rectangle( 310, 300 - ( 594 - 575 ), 100, 594 );
	                Rectangle marzo = new Rectangle( 420, 300 + ( 575 - 545 ), 100, 545 );
	                Rectangle abril = new Rectangle( 530, 300 + ( 575 - 528 ), 100, 528 );
	                Rectangle mayo = new Rectangle( 640, 300 + ( 575 - 484 ), 100, 484 );
	                Rectangle junio = new Rectangle( 750, 300 + ( 575 - 507 ), 100, 507 );
	                Rectangle julio = new Rectangle( 860, 300 + ( 575 - 525 ), 100, 525 );
	                Rectangle agosto = new Rectangle( 970, 300 + ( 575 - 542 ), 100, 542 );
	                Rectangle septiembre = new Rectangle( 1080, 300 + ( 575 - 543 ), 100, 543 );
	                Rectangle octubre = new Rectangle( 1190, 300 + ( 575 - 539 ), 100, 539 ); 
	                
	                //CREACION DE EJES DEL GRAFICO
	                
	                Line ejeHorizontal = new Line( 170, 875, 1300, 875 );
	                Line ejeVertical = new Line( 170, 50, 170, 875 );
	                
	                
	                //CREACION DE DIVISIONES DEL EJE VERTICAL
	                
	                Line valor025 = new Line( 170 - 10, 875 - 250, 170 + 10, 875 - 250 );
	                Line valor050 = new Line( 170 - 10, 875 - 500, 170 + 10, 875 - 500 );
	                Line valor075 = new Line( 170 - 10, 875 - 750, 170 + 10, 875 - 750 );
	                
	                
	                //CREACION DE TEXTO DE VALORES DEL EJE VERTICAL
	                
	                Text textoValor0 = new Text( 170 - 50, 875 - 10, "0,00" );
	                Text textoValor025 = new Text( 170 - 50, 875 - 10 - 250, "0,250" );
	                Text textoValor050 = new Text( 170 - 50, 875 - 10 - 500, "0,500" );
	                Text textoValor075 = new Text( 170 - 50, 875 - 10 - 750, "0,750" );
	                
	                
	                
	                //CREACION DE TEXTO DE LEYENDA DE EJE VERTICAL
	                
	                Text textoValorEuribor = new Text( 170 - 140, 875 - 10 - 800, "VALOR EURIBOR 2013" );
	                
	                
	                //CREACION DE TEXTO DE MESES ENERO-OCTUBRE EJE HORIZONTAL
	                
	                Text textoEnero = new Text( 200, 890, "ENERO" );
	                Text textoFebrero = new Text( 310, 890, "FEBRERO" );
	                Text textoMarzo = new Text( 420, 890, "MARZO" );
	                Text textoAbril = new Text( 530, 890, "ABRIL" );
	                Text textoMayo = new Text( 640, 890, "MAYO" );
	                Text textoJunio = new Text( 750, 890, "JUNIO" );
	                Text textoJulio = new Text( 860, 890, "JULIO" );
	                Text textoAgosto = new Text( 970, 890, "AGOSTO" );
	                Text textoSeptiembre = new Text( 1080, 890, "SEPTIEMBRE" );
	                Text textoOctubre = new Text( 1190, 890, "OCTUBRE" );
	                
	                
	                
	                
	                //LLAMADA A METODOS:
	                
	                
	                //Establecer Color de Barras
	                                
	                enero.setColor(Color.BLUE);
	                enero.fill();
	                febrero.setColor(Color.CYAN);
	                febrero.fill();
	                marzo.setColor(Color.DARK_GRAY);
	                marzo.fill();
	                abril.setColor(Color.GRAY);
	                abril.fill();
	                mayo.setColor(Color.GREEN);
	                mayo.fill();
	                junio.setColor(Color.ORANGE);
	                junio.fill();
	                julio.setColor(Color.PINK);
	                julio.fill();
	                agosto.setColor(Color.RED);
	                agosto.fill();
	                septiembre.setColor(Color.MAGENTA);
	                septiembre.fill();
	                octubre.setColor(Color.YELLOW);
	                octubre.fill();
	                
	               
	                
	                //Dibujar Ejes del gráfico
	                
	                ejeHorizontal.draw();
	                ejeVertical.draw();
	                
	                
	                //Divisiones Eje Vertical
	                
	                valor025.draw();
	                valor050.draw();
	                valor075.draw();
	                
	                
	                //Texto Valores Eje Vertical
	                
	                textoValor0.draw();
	                textoValor025.draw();
	                textoValor050.draw();
	                textoValor075.draw();
	                
	                
	                //Texto Leyenda Eje Vertical
	                
	                textoValorEuribor.draw();
	                
	                
	                //Texto meses Enero-Octubre eje horizontal
	                
	                textoEnero.draw();
	                textoFebrero.draw();
	                textoMarzo.draw();
	                textoAbril.draw();
	                textoMayo.draw();
	                textoJunio.draw();
	                textoJulio.draw();
	                textoAgosto.draw();
	                textoSeptiembre.draw();
	                textoOctubre.draw();
	        }

	}