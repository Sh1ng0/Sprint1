package n2ejercicio1;

public class N2Ejercicio1Main {

	public static void main(String[] args) {
		

			Smartphone smartphone = new Smartphone("Samsung", "GalaxyA6");

			smartphone.takeAPicture();

			smartphone.alarm();

			System.out.println(smartphone.call(654456654));

	}

}
