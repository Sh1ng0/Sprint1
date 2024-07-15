package n1ejercicio3;

public class n1Ejercicio3Main {

    public static void main(String[] args) {
       
        String directoryPath = args.length > 0 ? args[0] : "C:\\temp";

      
        ListaAlfabeticaToTxt lister = new ListaAlfabeticaToTxt();
        lister.listDirectoryContents(directoryPath, "directorio_contenido.txt");
    }
}