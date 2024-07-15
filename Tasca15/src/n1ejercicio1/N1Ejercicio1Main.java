package n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;





public class N1Ejercicio1Main {

	public static void main(String[] args) {
		
		 
        String directoryPath = args.length > 0 ? args[0] : "C:\\temp";

        
        listaAlfabetica lister = new listaAlfabetica();
        lister.listDirectoryContents(directoryPath);
    }
}
		


