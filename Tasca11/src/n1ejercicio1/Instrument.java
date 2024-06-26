package n1ejercicio1;

public abstract class Instrument {

	protected String name;
	protected float price;

	public Instrument(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	static {
		System.out.println("Bloque static iniz clase INstrument");
	}

	{
		System.out.println("Cargando bloque inizializaciador");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract void playing();

}
