package n1ejercicio2;

public class Persona<T, S, U> extends GenericMethods<T, S, U> {

	public Persona(T tipo1, S tipo2, U tipo3) {
		super(tipo1, tipo2, tipo3);

	}

	public T getName() {
		return getTipo1();
	}

	public S getSurname() {
		return getTipo2();
	}

	public U getAge() {
		return getTipo3();
	}
}
