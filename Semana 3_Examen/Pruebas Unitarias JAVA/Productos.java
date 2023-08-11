package main;

import java.util.Objects;

public class Productos {
final int id;
final String nombre;

public Productos(int id, String nombre) {
	this.id=id;
	this.nombre=nombre;
}

public int getId() {
	return id;
}

public String getNombre() {
	return nombre;
}

@Override
public boolean equals(Object o) {
	if(this==o)return true;
	if(o==null || getClass() != o.getClass()) return false;
	Productos that=(Productos)	o;
	return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
}

@Override
public int hashCode() {
	return Objects.hash(id,nombre);
}
}
