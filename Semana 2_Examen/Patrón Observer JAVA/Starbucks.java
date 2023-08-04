package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Starbucks {
	private List<ObservadorCafe> observadores = new ArrayList<>();

    public void suscribirse(ObservadorCafe observador) {
        observadores.add(observador);
    }

    public void desuscribirse(ObservadorCafe observador) {
        observadores.remove(observador);
    }

    public void prepararCafe(String tipoCafe) {
        System.out.println("Preparando café: " + tipoCafe);
        notificarObservadores(tipoCafe);
    }

    private void notificarObservadores(String tipoCafe) {
        for (ObservadorCafe observador : observadores) {
            observador.recibirCafePreparado(tipoCafe);
        }
    }
}