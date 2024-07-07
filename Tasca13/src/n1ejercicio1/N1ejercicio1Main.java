package n1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class N1ejercicio1Main {

	public static void main(String[] args) {
		
		ArrayList<Month> months = new ArrayList<Month>();
		
		Month month1 = new Month("Enero");
		Month month2 = new Month("Febrero");
		Month month3 = new Month("Marzo");
		Month month4 = new Month("Abril");
		Month month5 = new Month("Mayo");
		Month month6 = new Month("Junio");
		Month month7 = new Month("Julio");
		Month month9 = new Month("Septiembre");
		Month month10 = new Month("Octubre");
		Month month11 = new Month("Noviembre");
		Month month12 = new Month("Diciembre");
		
		months.add(month1);
		months.add(month2);
		months.add(month3);
		months.add(month4);
		months.add(month5);
		months.add(month6);
		months.add(month7);
		months.add(month9); /* para probar el HashSet */
		months.add(month9);
		months.add(month10);
		months.add(month11);
		months.add(month12);
		
		Month month8 = new Month("Agosto");
		
		
		
		System.out.println(months.toString());
		
		months.add(7,month8);
		
		System.out.println();
		
		System.out.println(months.toString());
		
		System.out.println();
		
		HashSet<Month> monthsSet = new HashSet<Month>(months);
		
		System.out.println(monthsSet);
		
		
		
		
		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));
		}
		
		System.out.println();
		
		ListIterator<Month> iterator = months.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
	}

}
