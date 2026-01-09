package ejemploUML;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private EstadoPedido estado;
	private ArrayList <String> productos= new ArrayList(); //esto es un arraylist en vd, REVISAR
	
	public Pedido(int numero){//constructor
		numero=0;
	}
	
	public enum EstadoPedido {
		Pendiente,
		En_Proceso,
		Enviado
	}
	
	public void agregarProducto(String producto) {
		
	}
	
	public double calcularTotal() {
		
	}
	
	public int getNumero() {
		return numero;
	}

	public EstadoPedido getEstado() {
		return estado;
	}



	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", estado=" + estado + ", producto=" + producto + "]";
	}
	
	
	
	
	
}

