package n1ejercicio2;

import java.util.Scanner;

public class CalculoDNI {

    
    public static String validarDNI(String dni) {
        if (dni == null || dni.length() != 9) {
            throw new IllegalArgumentException("El DNI debe tener exactamente 9 caracteres");
        }

        dni = dni.toLowerCase();

        String numeros = dni.substring(0, 8);
        String letra = dni.substring(8);

        int numerosInt = Integer.parseInt(numeros);
        String letraCalculada;

        int resto = numerosInt % 23;

        switch (resto) {
            case 0:
                letraCalculada = "t";
                break;
            case 1:
                letraCalculada = "r";
                break;
            case 2:
                letraCalculada = "w";
                break;
            case 3:
                letraCalculada = "a";
                break;
            case 4:
                letraCalculada = "g";
                break;
            case 5:
                letraCalculada = "m";
                break;
            case 6:
                letraCalculada = "y";
                break;
            case 7:
                letraCalculada = "f";
                break;
            case 8:
                letraCalculada = "p";
                break;
            case 9:
                letraCalculada = "d";
                break;
            case 10:
                letraCalculada = "x";
                break;
            case 11:
                letraCalculada = "b";
                break;
            case 12:
                letraCalculada = "n";
                break;
            case 13:
                letraCalculada = "j";
                break;
            case 14:
                letraCalculada = "z";
                break;
            case 15:
                letraCalculada = "s";
                break;
            case 16:
                letraCalculada = "q";
                break;
            case 17:
                letraCalculada = "v";
                break;
            case 18:
                letraCalculada = "h";
                break;
            case 19:
                letraCalculada = "l";
                break;
            case 20:
                letraCalculada = "c";
                break;
            case 21:
                letraCalculada = "k";
                break;
            case 22:
                letraCalculada = "e";
                break;
            default:
                throw new IllegalStateException("Valor inesperado para el resto: " + resto);
        }

        if (letraCalculada.equals(letra)) {
            return "Correcto";
        } else {
            return "Incorrecto, la letra correcta es " + letraCalculada.toUpperCase();
        }
    }

 
}
