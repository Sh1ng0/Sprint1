package n1ejercicio5;



public class N1Ejercicio5Main{

	public static void main(String[] args) {
	
		 N1Ejercicio5Main mainInstance = new N1Ejercicio5Main();
		 
		 mainInstance.piPrint(() -> 3.1416);
	
	}
	
	

	
	private void piPrint(Pi pi) {
		
		System.out.println(pi.getPiValue());
		

	}
		

	
}

