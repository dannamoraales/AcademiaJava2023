package Compra;

public class Inyector {
public static void inyectarProducto(ShoppingCart cart, String producto) {
		
		Sephora makeup = new Makeup();
		Sephora skincare = new Skincare();
		Sephora hair = new Cabello();

		switch(producto){
			
			case "Makeup":
				cart.setProducto(makeup);
				break;
			case "Skincare":
				cart.setProducto(skincare);
				break;
			default:
				cart.setProducto(hair);			
		}
	}
}
