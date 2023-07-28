package Deportes;

public class Ballet extends Deporte{

	private int bailarinas;
	public Ballet(String nombre, int vol, int bailarinas) {
		super(nombre, vol);
		this.bailarinas=bailarinas;
	}
	
	public String getCategoria() {
		return "Ballet";
	}

}
