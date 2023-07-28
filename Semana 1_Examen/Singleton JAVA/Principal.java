package Singleton;

public class Principal {

	public static void main(String[] args) {
		Gym id1= Gym.getInstance();
		Gym id2= Gym.getInstance();
		Gym id3= Gym.getInstance();
		Gym id4= Gym.getInstance();
		Gym id5= Gym.getInstance();
		Gym id6= Gym.getInstance();
		Gym id7= Gym.getInstance();
		Gym id8= Gym.getInstance();
		Gym id9= Gym.getInstance();
		Gym id10= Gym.getInstance();


		System.out.println(Gym.getContador());
	}

}
