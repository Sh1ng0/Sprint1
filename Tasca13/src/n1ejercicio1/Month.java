package n1ejercicio1;

public class Month {
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}

	public String name;

	public Month(String name) {
		super();
		this.name = name;
	}

}
