package Cafeteria;

public class Main {

	public static void main(String[] args) {
        Starbucks starbucks = new Starbucks();

        Cliente cliente1 = new Cliente("Cliente1");
        Cliente cliente2 = new Cliente("Cliente2");

        starbucks.suscribirse(cliente1);
        starbucks.suscribirse(cliente2);

        starbucks.prepararCafe("Capuccino");

        starbucks.desuscribirse(cliente2);

        starbucks.prepararCafe("Chocolate");
    }
}