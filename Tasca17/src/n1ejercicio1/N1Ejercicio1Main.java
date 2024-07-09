package n1ejercicio1;

public class N1Ejercicio1Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	 	
		
     TrabajadorOnline trabajador1 = new TrabajadorOnline ("Jose","Arbizu",100.30f);
     
     System.out.println(trabajador1.calcualateRevenue(40));
     
     
     /*@SupressWarnings("deprecated")*/
     System.out.println(trabajador1.bajaLaboral(30));
		
		
	}

}
