package Compra;

interface Sephora{
	void agregarCarrito();
}

class Makeup implements Sephora{
	@Override
	public void agregarCarrito() {
		System.out.println("Se agrego maquillaje al carrito");
	}
}

class Skincare implements Sephora{
	@Override
	public void agregarCarrito() {
		System.out.println("Se agrego skincare al carrito");
	}
}

class Cabello implements Sephora{
	@Override
	public void agregarCarrito() {
		System.out.println("Se agrego shampoo al carrito");
	}
}

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart("Carrito 1", 1);
		Inyector.inyectarProducto(cart, "Makeup");
		
		boolean addProd = cart.addPro();
		
		if(addProd)
			System.out.println("El produto se agrego a su carrito.");
		else {
			System.out.println("El producto no se pudo agregar a su carrito.");
			System.out.println("Pruebe con otro producto.");
		}
		
		
	}

}
