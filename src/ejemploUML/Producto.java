package ejemploUML;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {//constructor
		this.nombre=nombre;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	
}
