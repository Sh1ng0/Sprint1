package n1ejercicio2;



import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class listaAlfabeticaModificada {

    public void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("La ruta proporcionada no es un directorio.");
            return;
        }

        
        listDirectoryContentsRecursive(directory, 0);
    }

    private void listDirectoryContentsRecursive(File directory, int level) {
       
        File[] contents = directory.listFiles();
        if (contents == null) {
            System.out.println("No se pudo obtener el contenido del directorio.");
            return;
        }

        
        List<File> contentList = Arrays.asList(contents);
        Collections.sort(contentList);

       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        
        for (File item : contentList) {
            
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
          
            String type = item.isDirectory() ? "D" : "F";
            String lastModified = sdf.format(new Date(item.lastModified()));
            System.out.println(type + " " + item.getName() + " - " + lastModified);

           
            if (item.isDirectory()) {
                listDirectoryContentsRecursive(item, level + 1);
            }
        }
    }
}