package n1ejercicio1;

public abstract class Trabajador {

	private String name;
	private String surname;
	protected float revenue;

	public Trabajador(String name, String surname, float revenue) {
		this.name = name;
		this.surname = surname;
		this.revenue = revenue;
	}

	public float calcualateRevenue(float hours) {

		return hours * 15;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getRevenue() {
		return revenue;
	}

	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
}
