package n1ejercicio1;

public class Strings extends Instrument {

	public Strings(String name, float price) {
		super(name, price);

	}

	public void playing() {

		System.out.println("A guitar gently weeps");
	}

	{
		System.out.println("Cargando bloque inicialoizador guitarra");
	}
	static {
		System.out.println("bloque estático clase Guitarra");
	}

	static void staticPlaying() {
		System.out.println("Guitarra método estático");
	}
}


