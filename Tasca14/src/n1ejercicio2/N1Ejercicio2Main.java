package n1ejercicio2;

import java.util.Scanner;

public class N1Ejercicio2Main {

	public static void main(String[] args) {
		
		
		CalculoDNI test1 = new CalculoDNI();
		
		
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su DNI: ");
        String dni = teclado.nextLine();
        
        String resultado = test1.validarDNI(dni);
        System.out.println(resultado);

	}

}
