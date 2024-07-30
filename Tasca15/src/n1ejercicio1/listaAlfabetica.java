package n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class listaAlfabetica {
	
	public void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("La ruta proporcionada no es un directorio.");
           
        }

        
        String[] contents = directory.list();
        if (contents == null) {
            System.out.println("No se pudo obtener el contenido del directorio.");
           
        }

        
        List<String> contentList = Arrays.asList(contents);
        Collections.sort(contentList);

      
        for (String item : contentList) {
            System.out.println(item);
        }
    }
	
	/* Ejercicio 2*/
	
	
}

	
	
	

