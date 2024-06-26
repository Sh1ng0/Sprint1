package n2ejercicio1;

public class Smartphone extends Phone implements Camera, Clock {

	public Smartphone(String brand, String model) {
		super(brand, model);

	}

	public void takeAPicture() {

		System.out.println("Taking a pic");
	}

	public void alarm() {
		System.out.println("Rise and shine cupcake");
	}

}