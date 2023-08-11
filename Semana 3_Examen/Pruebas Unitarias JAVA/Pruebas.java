package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Cafeteria;
import main.Productos;

class Pruebas {
private Cafeteria cafeteria;

@BeforeEach
public void setUp() {
	cafeteria = new Cafeteria();
	cafeteria.pedirProducto(1, "Capuccino");
	cafeteria.pedirProducto(2, "Chocolate");
}
	@Test
	public void test1() {
		Productos esperado = new Productos(1,"Cocolate");
		Cafeteria cafe= new Cafeteria();
		final Productos res = cafe.pedirProducto(2, "Cocolate");
		Assertions.assertEquals(esperado.getId(), res.getId());
	}
	
	@Test
	public void test2() {
		Productos esperado = new Productos(1, "Capuccino");
		Cafeteria cafeteria = new Cafeteria();
		final Productos resultado = cafeteria.pedirProducto(1, "Chocolate");
		Assertions.assertEquals(esperado, resultado);
		Assertions.assertNotEquals(esperado.getNombre(), resultado.getNombre());
		Assertions.assertNotEquals(esperado, resultado);
	}
	
	@Test
	public void test3() {
		Cafeteria cafeteria= new Cafeteria();
		final Productos resultado= cafeteria.obtenerCafe(1);
		Assertions.assertEquals(null, resultado);
	}
	
	@Test
	public void test4() {
		Productos esperado = new Productos(1, "Chocolate");
		final Productos resultado= cafeteria.obtenerCafe(0);
		Assertions.assertEquals(esperado, resultado);
	}
}
