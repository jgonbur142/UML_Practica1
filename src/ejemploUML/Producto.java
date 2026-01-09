package ejemploUML;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto() {//constructor
		nombre="¿?";
		precio=0.0;
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
