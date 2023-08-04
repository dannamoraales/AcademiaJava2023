package Cafeteria;

public class Cliente implements ObservadorCafe {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirCafePreparado(String tipoCafe) {
        System.out.println(nombre + " recibió un café de tipo: " + tipoCafe);
    }
}
