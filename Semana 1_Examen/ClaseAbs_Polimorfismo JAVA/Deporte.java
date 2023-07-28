package Deportes;

public abstract class Deporte {


	abstract String getCategoria();
	private String nombre;
	private int vol;
	
	public Deporte(String nombre, int vol) {
		this.nombre=nombre;
		this.vol=vol;
	}
	
	
}
