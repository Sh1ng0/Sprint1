package n1ejercicio1to4;

import java.util.ArrayList;
import java.util.Scanner;

public class N1Ejercicio1Main {

	public static void main(String[] args) {
		
		

		ArrayList<String> coches = new ArrayList<String>();

		coches.add("Opel");
		coches.add("Mazda");
		coches.add("Rover");
		coches.add("Subaru");
		coches.add("Mercedes");
		coches.add("oasdasdasdasd");

		System.out.println(coches);

		System.out.println(coches.stream().filter(s -> s.toLowerCase().contains("o")).toList());

		/* System.out.println(coches.stream().reduce("", (s1, s2) -> s1 + s2)); */

		/* Ejercicio 2 nivel 1 */

		System.out.println(coches.stream().filter(s -> s.toLowerCase().contains("o") && s.length() >= 5).toList());

		/* Ejercicio 3 nivel 1 */

		ArrayList<String> months = new ArrayList<String>();

		months.add("Enero");
		months.add("Febrero");
		months.add("Marzo");
		months.add("Abril");
		months.add("Mayo");
		months.add("Junio");
		months.add("Julio");
		months.add("Agosto");
		months.add("Septiembre");
		months.add("Octubre");
		months.add("Noviembre");
		months.add("Diciembre");

		months.stream().peek(s -> System.out.println(s)).toList();
		
		System.out.println("   ");
		
		/* Ejercicio 4 nivel 1 */

		months.stream().peek(System.out::println).toList();
		
		

	}

}
