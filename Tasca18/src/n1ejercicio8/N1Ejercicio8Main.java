package n1ejercicio8;

public class N1Ejercicio8Main{

	public static void main(String[] args) {
        String input = "Me gustan las mandarinas";
        String reversed = reverse(s -> new StringBuilder(s).reverse().toString(), input);
        System.out.println(reversed); 
    }

    
    @FunctionalInterface
    interface FunctionalInterfaceEj8 {
        String reverse(String s);
    }

    
    public static String reverse(FunctionalInterfaceEj8 f, String s) {
        return f.reverse(s);
    }
}