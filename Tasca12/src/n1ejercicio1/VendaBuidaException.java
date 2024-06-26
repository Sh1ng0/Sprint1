package n1ejercicio1;

public class VendaBuidaException extends Exception {
	
	public String error;

	public VendaBuidaException(String error) {
		super(error);
		
		//this.error = error;
	}

	public String getError() {
		return error;
	}

}


