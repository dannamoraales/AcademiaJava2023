package twr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Principal {

	public static void main(String[] args) {
		 try {
	            URL url = new URL("https://www.manualweb.net/java/conceptos-basicos-java/");
	            HttpURLConnection con = (HttpURLConnection) url.openConnection();

	            try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
	                String inputLine;
	                while ((inputLine = br.readLine()) != null) {
	                    System.out.println(inputLine);
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error al realizar la conexión: " + e.getMessage());
	        }
	    }
	}