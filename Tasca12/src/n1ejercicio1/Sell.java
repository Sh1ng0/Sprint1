package n1ejercicio1;

import java.util.ArrayList;

public class Sell {
	
	public ArrayList<Product> products = new ArrayList<Product>();

	public Sell(ArrayList<Product> products) {

		this.products = new ArrayList<Product>();

	}

	public void addProduct(Product p) {
		products.add(p);
	}

	public float calcularTotal() throws VendaBuidaException {
		if (products.isEmpty())
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		
		
		/*for (Product p : products) {

			suma += p.getPrice();*/
		float suma = 0;
		
		/*for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			suma += p.getPrice();*/
			
			
			
			
			
			
		try  {
		for (int i = products.size(); i >= -1; i--) {
			Product p = products.get(i);
			suma += p.getPrice();
		}
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println("Este índice es inválido");
			
			
		}
			
		

		
		return suma;

	}
}


