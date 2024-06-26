package n1ejercicio2;

public class Car implements ICar{

	protected static final String brand = "Wolkswagen";

	@Override
	public String toString() {
		return "Car [potency=" + potency + "]";
	}

	protected static String model = "Escarabajo";
	protected final int potency;

	public Car(int potency) {
		super();
		this.potency = potency;

	}

	public static void brake() {
		System.out.println("The car is halting");
	}

	@Override
	public void accelerate() {
		System.out.println("The car goes whoooo");

	}

}
