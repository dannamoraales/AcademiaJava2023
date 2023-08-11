package main;

import java.util.HashMap;

public class Cafeteria {
private final HashMap<Integer, Productos> prod = new HashMap<>();

public Productos pedirProducto(int id, String nombre) {
	return prod.put(id, new Productos(id, nombre));
	}
public Productos obtenerCafe(int id) {
	return prod.get(id);
}
public Productos actualizarCafe(int id, String nombre) {
	return prod.put(id, new Productos(id, nombre));
}
}

