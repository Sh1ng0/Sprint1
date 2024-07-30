package n1ejercicio1;

public class N1ejercicio1Main {

	public static void main(String[] args) {
		
		
		NoGenericMethods objeto1 = new NoGenericMethods.Builder()
		.edad(33)
		.nombre("Jose")
		.sueldo(900.0).build();
		
		
		NoGenericMethods objeto2 = new NoGenericMethods.Builder()
		.nombre("Sonia")		
		.sueldo(250.0).build();
		
		System.out.println(objeto2.toString());
		
		
		

		
		
		
	
		
		
			

	}

}
