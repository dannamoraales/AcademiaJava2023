package Deportes;

public class Pesas extends Deporte{

	private String musculo;
	public Pesas(String nombre, int vol, String musculo) {
		super(nombre, vol);
		this.musculo=musculo;
	}
	
	public String getCategoria() {
		return "Pesas";
	}

}
