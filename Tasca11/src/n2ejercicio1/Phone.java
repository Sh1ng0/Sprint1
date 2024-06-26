package n2ejercicio1;

public abstract class Phone {

	protected String brand;
	protected String model;

	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String call(int number) {

		String calling = "Calling " + number + "...";

		return calling;
	}

}