package Deportes;

public class Principal {

	public static void main(String[] args) {
		Deporte pesas = new Pesas("Pesas", 10, "cuadricep");
		System.out.println(pesas.getCategoria());
		Deporte pilates = new Pilates("Pilates", 2, "abs");
		System.out.println(pilates.getCategoria());
		Deporte ballet = new Ballet("Ballet", 3, 6);
		System.out.println(ballet.getCategoria());
	}

}
