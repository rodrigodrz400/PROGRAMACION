package EjerciciosIniciales.Puntos;

public class PuntoP3D extends PuntoP {
	public int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	

	@Override
	public String toString() {
		return "Punto3D [z=" + z + ", x=" + getX() + ", y=" + getY()
				+ "]";
	}

	public static void main(String[] args){
		PuntoP p1=new PuntoP();
		PuntoP3D p2=new PuntoP3D();
		
		p1.setX(5);
		p1.setY(4);
		p2.setX(5);
		p2.setY(4);
		p2.setZ(7);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
