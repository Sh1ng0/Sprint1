package n2ejercicio1;


	
	import java.util.InputMismatchException;
	import java.util.Scanner;

	/*poner el Scanner aquí (maybe)*/

	public class Input extends Exception {

		/* public String message; */

		public Input(String message) {
			super();
			/* this.message = message; */
		}

		public static byte readByte() {
			Scanner teclado = new Scanner(System.in);
			byte byteInput = 0;
			System.out.println("Introduzca un dato de tipo byte");
			try {

				byteInput = teclado.nextByte();

			} catch (InputMismatchException error) {
				System.err.println("El valor no es de tipo byte");
				teclado.next();

				byteInput = readByte();
			}
			return byteInput;

		}

		public static int readInt() {
			Scanner teclado = new Scanner(System.in);
			int intInput = 0;
			System.out.println("Introduzca un dato de tipo Int");
			try {

				intInput = teclado.nextInt();

			} catch (InputMismatchException error) {
				System.err.println("El valor no es de tipo int");
				teclado.next();

				intInput = readInt();
			}
			return intInput;

		}

		public static float readFloat() {
			Scanner teclado = new Scanner(System.in);
			float floatInput = 0f;

			System.out.println("Introduzca un valor de tipo float");
			try {

				floatInput = teclado.nextFloat();
			} catch (InputMismatchException error) {
				System.err.println("El valor no es de tipo float");
				teclado.next();

				floatInput = readFloat();
			}
			return floatInput;
		}

		public static double readDouble() {
			Scanner teclado = new Scanner(System.in);
			double doubleInput = 0;

			System.out.println("Introduzca un valor de tipo double");
			try {

				doubleInput = teclado.nextDouble();
			} catch (InputMismatchException error) {
				System.err.println("El valor no es de tipo double");
				teclado.next();

				doubleInput = readDouble();
			}
			return doubleInput;
		}

		public static char readChar() throws Exception {
			
			Scanner teclado = new Scanner (System.in);
			String charInput = " ";
			
			
			try {
				
				System.out.println("Introduzca un carácter");
				
				charInput = teclado.nextLine();
				
				if (charInput.length() != 1) {
					throw new Exception("No se trata de un carácter");
				
				}	
			}catch (Exception error) {
				System.err.println(error.getMessage());
				
				
				return readChar();
				
			}
			
				
			return charInput.charAt(0);
		
			}
		
	}


