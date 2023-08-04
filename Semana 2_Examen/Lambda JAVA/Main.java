package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		//SUPPLIER
		//No toma argumentos y devuelve un resultado
		//En este ejemplo no toma argumentos 
		//y devolvera un numero aleatorio del 1 al 100
		System.out.println("SUPPLIER");
		Supplier<Integer> numeroAleatorioSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100) + 1;
        };
        int numeroAleatorio = numeroAleatorioSupplier.get();
        System.out.println("Número aleatorio: " + numeroAleatorio);
        
        System.out.println("*************************");
        //CONSUMER
        //Toma un argumento pero no devuelve ningún resultado
        //En este ejemplo toma un argumento que será la cadena de nombre
        //y con el forEach aplicara el consumer a cada elemento de la ista para imprimir
        System.out.println("CONSUMER");
        List<String> names = Arrays.asList("Danna", "Nicole", "Oscar", "Santiago");
        Consumer<String> imp = (nombre) -> System.out.println(nombre);
        names.forEach(imp);
        
        System.out.println("*************************");
        //BICONSUMER
        //Toma dos argumentos pero no devuelve ningún resultado
        //En este ejemplo toma dos argumentos, los suma y devuelve el resultado
        System.out.println("BICONSUMER");
        BiConsumer<Integer, Integer> suma = (a, b) -> {
            int resultado = a + b;
            System.out.println("Sumando " + a + " + " + b + " el resultado es: " + resultado);
        };
        suma.accept(100, 17);
        
        System.out.println("*************************");
        //PREDICATE
        //Toma un argumento y devuelve un valor booleano (true o false)
        //En este ejemplo toma un valor e identifica si es mayor a 100
        //si cumple con la condición se imprime true
        System.out.println("PREDICATE");
        Predicate<Integer> sup = (numero) -> numero > 100;
        int numero1 = 500;
        boolean resultado1 = sup.test(numero1);
        System.out.println(numero1 + " es superior a 100: " + resultado1);
        int numero2 = -2;
        boolean resultado2 = sup.test(numero2);
        System.out.println(numero2 + " es superior a 100: " + resultado2);
        
        System.out.println("*************************");
        //BIPREDICATE
        //Toma dos argumentos y devuelve un valor booleano (true o false)
        //En este ejemplo toma dos valores que son el alumno y su calificacion
        // si la calificacion es mayor a 6.0 significa que paso la materia
        //de ser asi se imprimira true
        System.out.println("BIPREDICATE");
        Alumno a = new Alumno(1,"Ana", 9.5);
        BiPredicate<Alumno, Double> bp1 = (x,y) -> y > 6.0;
        boolean res= bp1.test(a, 6.1);
        System.out.println("El alumno: "+a.getNombre()+" paso la materia: "+res);
        
        System.out.println("*************************");
        //FUNCTION
        //Toma un argumento y regresa un valor generico
        //En este ejemplo recibe el valor de tipo String y lo convierte a mayusculas
        System.out.println("FUNCTION");
        Function<String,String> may = x -> x.toUpperCase();
		String r = may.apply("Hello World");
		System.out.println(r);
		
		System.out.println("*************************");
	    //BIFUNCTION
	    //Toma dos argumentos y regresa un valor generico
		//En este ejemplo solicita dos valores y con estos realiza una suma y una resta
		//y regresa el resultado de las operaciones realizadas
		System.out.println("BIFUNCTION");
		BiFunction<Integer, Integer, String> bifu = (d, b) -> {
	            int sum = d + b;
	            int resta = d - b;
	            return "Suma: " + sum + ", Resta: " + resta;
	        };
	    String resultado = bifu.apply(10, 2);
	    System.out.println(resultado);
	    
	    System.out.println("*************************");
	    //UNARYOPERATOR
	    //Toma un argumento y regresa un valor del mismo tipo
	    //En este ejemplo pide un valor de tipo Integer y con este hace el cuadrado
	    // del numero y regresa el resultado
		System.out.println("UNARYOPERATOR");
		UnaryOperator<Integer> cuad = num -> num * num;
        int cuadrado = cuad.apply(2);
        System.out.println("El cuadrado es: " + cuadrado);
        
		System.out.println("*************************");
	    //BINARYOPERATOR
	    //Toma dos argumentos y regresa un valor del mismo tipo
		//En este ejemplo pide dos valores de tipo String y los concatena en el
		//resultado que se imprime en pantalla
		System.out.println("BINARYOPERATOR");
		BinaryOperator<String> juntar = (wor, wor2) -> wor + " " + wor2;
        String concat = juntar.apply("Hola", "mundo!");
        System.out.println("La oración completa es: " + concat);
    }
}