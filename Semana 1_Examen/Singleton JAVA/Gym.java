package Singleton;

public class Gym {
	private static Gym instance;
	String gymUser;
	static int contador;
	
	private Gym(String gymUser) {
		System.out.println("Face ID correcto");
		this.gymUser=gymUser;
		contador++;
	}
	public static Gym getInstance() {
		if(instance==null) {
			instance= new Gym("ACCESS");
		}
		return instance;
	}
	public static int getContador() {
		return contador;
	}
	
}
