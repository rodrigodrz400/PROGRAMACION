package EjerciciosIniciales;
/*
 Crear la clase Producto, que tiene como atributos el código del producto (numérico),
  el precio y el tanto por ciento del descuento. Deben realizarse todos los métodos get/set. 
  Deben añadirse además los métodos getPrecioTotal, que tiene en cuenta el descuento, y 
  getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual para que 
  aplicándoselo al precio, devuelva este 'nuevoPrecio'.
 */
public class ProductoE4 {

	int codProducto;
	double precio;
	double nuevoPrecio;
	int descuento;
	
	public ProductoE4(int codProducto, double precio){
		this.codProducto=codProducto;
		this.precio=precio;
	}
	public ProductoE4(int codProducto, double precio, int descuento){
		this.codProducto=codProducto;
		this.precio=precio;
		this.descuento=descuento;
	}
	public double getPrecioTotal(){
		precio = precio - (precio*descuento /100.0);
		return precio;	
	}
	public double getPrecioTotal(double precio){
		this.precio = precio - (precio*descuento /100.0);
		return this.precio;	
	}
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}
