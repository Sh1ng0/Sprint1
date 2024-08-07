package n1ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ListaAndReader {

    public void listDirectoryContents(String directoryPath, String outputPath) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("La ruta proporcionada no es un directorio.");
            
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            
            listDirectoryContentsRecursive(directory, 0, writer);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }

    private void listDirectoryContentsRecursive(File directory, int level, BufferedWriter writer) throws IOException {
       
        File[] contents = directory.listFiles();
        if (contents == null) {
            writer.write("No se pudo obtener el contenido del directorio.\n");
            
        }

      
        List<File> contentList = Arrays.asList(contents);
        Collections.sort(contentList);

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

     
        for (File item : contentList) {
           
            StringBuilder line = new StringBuilder();

      
            for (int i = 0; i < level; i++) {
                line.append("  ");
            }

        
            String type = item.isDirectory() ? "D" : "F";
            String lastModified = sdf.format(new Date(item.lastModified()));
            line.append(type).append(" ").append(item.getName()).append(" - ").append(lastModified).append("\n");

            
            writer.write(line.toString());

           
            if (item.isDirectory()) {
                listDirectoryContentsRecursive(item, level + 1, writer);
            }
        }
    }

    public void readTxtFile(String filePath) {
        File file = new File(filePath);

        if (!file.isFile() || !filePath.endsWith(".txt")) {
            System.out.println("La ruta proporcionada no es un archivo .txt.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}