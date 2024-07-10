package n1ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class N1Ejercicio7Main {

	public static void main(String[] args) {
		
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("Asuka");
		list.add(2);
	    list.add("Kaworu");
	    list.add(10);
	    list.add("Gendo");
	    list.add(20);
	    list.add("Rei");
	    list.add("Misato");
	   
	    
	    
	    System.out.println(list);
	    
	    
	    /*Ejercicio 6*/
	    
	    List<String> ordenarPorLongitud = list.stream()
	            .filter(e -> e instanceof String)
	            .map(e -> (String) e)
	            .sorted(Comparator.comparingInt(String::length))
	            .toList();
	    
	    System.out.println(ordenarPorLongitud);
	    
	    /* Ejercicio 7 */
	    
	    List<String> ordenarPorLongitudInversa = list.stream()
	            .filter(e -> e instanceof String)
	            .map(e -> (String) e)
	            .sorted(Comparator.comparingInt(String::length).reversed())
	            .toList();
	    
	    System.out.println(ordenarPorLongitudInversa);
	    
	    
	    
	    
	    		
		
		
		
		

	}

}
