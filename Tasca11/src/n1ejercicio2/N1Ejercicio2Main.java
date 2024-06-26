package n1ejercicio2;

import java.util.Iterator;
import java.util.List;

public class N1Ejercicio2Main {

	public static void main(String[] args) {

		List<ICar> icars = List.of(new Car(300), new Batmobil());

		for (ICar car : icars)
			car.accelerate();

	}

}