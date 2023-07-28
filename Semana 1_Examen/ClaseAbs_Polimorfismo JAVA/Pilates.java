package Deportes;

public class Pilates extends Deporte{

	private String musculo;
	public Pilates(String nombre, int vol, String musculo) {
		super(nombre, vol);
		this.musculo=musculo;
	}
	
	public String getCategoria() {
		return "Pilates";
	}

}
