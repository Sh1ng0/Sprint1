package n1ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N1ejercicio3Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> points = new ArrayList<String>();

		try (BufferedReader read = new BufferedReader(
				new FileReader("\\Users\\Don José\\eclipse-workspace\\Tasca13\\src\\n1ejercicio3\\countries.txt"))) {

			HashMap<String, String> capitalCities = new HashMap<String, String>();

			String line;
			while ((line = read.readLine()) != null) {
				String[] parts = line.split(" ", 2);
				if (parts.length == 2) {
					capitalCities.put(parts[0].trim(), parts[1].trim());

				}

			}
			/*
			 * System.out.println("Contenido del archivo leído:");
			 * 
			 * System.out.println(capitalCities);
			 * System.out.println(capitalCities.keySet());
			 * System.out.println(capitalCities.entrySet());
			 */

			System.out.println("Introduzca su nombre: ");
			String nombre = teclado.nextLine();
			
			for (int i = 0; i <= 10; i++) {
      
			System.out.println("¿Cuál es la capital de este país?");
			String randomKey = getRandomKey(capitalCities);
            
			System.out.println(randomKey);
			String answer = teclado.nextLine();
			
				if (capitalCities.get(randomKey).equalsIgnoreCase(answer.trim().replace(" ", "_"))) {
					points.add("1");
					
					
				} else {
					System.out.println("Incorrecto, " + nombre + ". La capital de " + randomKey + " es "
							+ capitalCities.get(randomKey));
				}

			}
			
			System.out.println(points.size());
			
			PrintWriter writer = new PrintWriter("concurso.txt");
			writer.print(nombre+" ,su puntuación en el concurso ha sido de: "+points.size());
			writer.close();
			
			
		} catch (FileNotFoundException error) {

		} catch (IOException error) {

		}

	}

	public static String getRandomKey(HashMap<String, String> map) {
		List<String> keys = map.keySet().stream().collect(Collectors.toList());
		Random rand = new Random();
		return keys.get(rand.nextInt(keys.size()));
	}

}