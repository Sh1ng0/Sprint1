package n1ejercicio2;

public class n1Ejercicio2Main {

	public static void main(String[] args) {
		
		Persona<String, String, Integer> persona1 = new Persona<>("Jose","Arbizu",32);
		
		System.out.println(persona1.getName());
		
		Persona<Integer, String, String> persona2 = new Persona<>(40,"Marta","García");
		

	}

}
