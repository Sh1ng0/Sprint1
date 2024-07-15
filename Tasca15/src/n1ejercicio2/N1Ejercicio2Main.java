package n1ejercicio2;

public class N1Ejercicio2Main {

    public static void main(String[] args) {
       
        String directoryPath = args.length > 0 ? args[0] : "C:\\temp";

      
        listaAlfabeticaModificada lister = new listaAlfabeticaModificada();
        lister.listDirectoryContents(directoryPath);
    }
}