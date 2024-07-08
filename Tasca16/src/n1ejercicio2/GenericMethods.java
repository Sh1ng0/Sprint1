package n1ejercicio2;

public abstract class GenericMethods<T, S, U> {

	private T tipo1;
	private S tipo2;
	private U tipo3;

	public GenericMethods(T tipo1, S tipo2, U tipo3) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.tipo3 = tipo3;
	}

	public T getTipo1() {
		return tipo1;
	}

	public void setTipo1(T tipo1) {
		this.tipo1 = tipo1;
	}

	public S getTipo2() {
		return tipo2;
	}

	public void setTipo2(S tipo2) {
		this.tipo2 = tipo2;
	}

	public U getTipo3() {
		return tipo3;
	}

	public void setTipo3(U tipo3) {
		this.tipo3 = tipo3;
	}

}
