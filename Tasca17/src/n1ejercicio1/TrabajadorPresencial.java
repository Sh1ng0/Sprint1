package n1ejercicio1;

public class TrabajadorPresencial extends Trabajador {
	
	private static float gas;

	public TrabajadorPresencial(String name, String surname, float revenue) {
		super(name, surname, revenue);
		this.gas = gas;

	}

	@Override
	public float calcualateRevenue(float hours) {
		
		float baseRevenue = super.calcualateRevenue(hours+gas);
		
		return baseRevenue + gas;
	}

	public float getGas() {
		return gas;
	}

	public void setGas(float gas) {
		this.gas = gas;
	}

}
