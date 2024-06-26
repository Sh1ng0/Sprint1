package n2ejercicio1;

import java.util.Scanner;

public class N2ejercicio1Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			char character = Input.readChar();
			System.out.println("El caracter introducido es: " + character);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
