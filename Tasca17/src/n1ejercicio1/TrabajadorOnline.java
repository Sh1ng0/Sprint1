package n1ejercicio1;

public class TrabajadorOnline extends Trabajador {
	
	private static final float INTERNET = 15.5f;

	public TrabajadorOnline(String name, String surname, float revenue) {
		super(name, surname, revenue);
		
		
	}

	@Override
	public float calcualateRevenue(float hours) {
		
		float baseRevenue = super.calcualateRevenue(hours+INTERNET);
		
		return baseRevenue;
	}
	
	@Deprecated
	/*This method is no longer useful due to variable inconsistencies*/
	public float bajaLaboral (float hours) {
		
		float putada = revenue - hours;
		
		return putada;
		
		
	}

}
