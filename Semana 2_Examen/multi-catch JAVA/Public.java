package MC;

public class Public {

	public static void main(String[] args) {
		try {
            Postre pastel = new Pastel();
            Postre helado = new Helado();
            
            //Postre generico 
            Postre pay = new Postre();
            
            pastel.disfrutar();
            helado.disfrutar();
            
            pay.disfrutar();
        } catch (PostreException e) {
        	e.printStackTrace();
            System.out.println("Se produjo una excepción");
        }
        System.out.println("Termina programa");

    }
}