package n1ejercicio1;

import java.util.ArrayList;

public class N1ejercicio1Main {

	public static void main(String[] args) {
		Product producto1 = new Product("Samsunk", 500);
		Product producto2 = new Product("Motorola", 300);
		Product producto3 = new Product("Nokia", 25.50f);
		Product producto4 = new Product("Kriim", 20);

		Sell venda1 = new Sell(new ArrayList<Product>());
		
		venda1.addProduct(producto1);
			
		
		
		
		
		
		
		/*Cuando llame al método CalcularTotal he de hacer un try catch y muestre el mensaje*/

		

		
		try {
			float sumaProductos = venda1.calcularTotal();
			System.out.println(sumaProductos);
		} catch (VendaBuidaException error) {
			
		    System.out.println(error.getMessage());
		}
		
		

		

	}

}



