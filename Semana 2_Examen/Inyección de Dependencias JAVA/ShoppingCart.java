package Compra;

public class ShoppingCart {

	private String cart;
	private int id;
	private Sephora producto;
	
	public ShoppingCart(String cart, int id) {
		this.cart=cart;
		this.id=id;
	}
	
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Sephora getProducto() {
		return producto;
	}
	public void setProducto(Sephora producto) {
		this.producto = producto;
	}
	
	public boolean addPro() {
		System.out.println("El carrito: "+cart+" con id: "+id);
		//DELEGACION
		producto.agregarCarrito();
		return true;
		
	}
}
