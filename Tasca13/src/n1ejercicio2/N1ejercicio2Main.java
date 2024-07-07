package n1ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N1ejercicio2Main {

	public static void main(String[] args) {
		
		List<Integer> integers = List.of(10,20,30,40);
		
		List<Integer> integers2 = new ArrayList<>(List.of(1,2,3,4));
		
		ListIterator<Integer> iterator = integers.listIterator(integers.size());
		
		while(iterator.hasPrevious()) {

			integers2.add(iterator.previous());
		}
		
		
		
		System.out.println(integers2);
		
		
		
	}

}
