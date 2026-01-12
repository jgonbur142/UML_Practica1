package ejemploUML;

public class Main {
	
	public void show() {
		
		Pedido pedido = new Pedido(1);
		
		Producto teclado = new Producto("Teclado",25.50);
		Producto raton = new Producto("Raton",15.00);
		
		pedido.agregarProducto(teclado);
		pedido.agregarProducto(raton);
		
		System.out.printf("Número de pedido: %d\n",pedido.getNumero());
		System.out.printf("Estado: %s\n",pedido.getEstado());
		System.out.printf("Total: %f €\n",pedido.calcularTotal());
		
		pedido.setEstado(EstadoPedido.ENVIADO);
		System.out.printf("Nuevo estado: %s",pedido.getEstado());
		
	}
	
	public static void main(String[] args) {
		new Main().show();
	}

}
