package Functional;

public class Alumno {

	private int id;
	private String nombre;
	private double calificacion;
	
	public Alumno (int id, String nombre, double calificacion) {
		this.id=id;
		this.nombre=nombre;
		this.calificacion=calificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
