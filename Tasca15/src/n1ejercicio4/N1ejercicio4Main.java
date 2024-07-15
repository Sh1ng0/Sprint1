package n1ejercicio4;

import java.util.Scanner;

public class N1ejercicio4Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Listar el contenido de un directorio");
        System.out.println("2. Leer un archivo .txt");

        int option = scanner.nextInt();
        scanner.nextLine();  

        if (option == 1) {
           
            System.out.print("Ingrese la ruta del directorio: ");
            String directoryPath = scanner.nextLine();

            ListaAndReader lister = new ListaAndReader();
            lister.listDirectoryContents(directoryPath, "directorio_contenido.txt");
        } else if (option == 2) {
          
            System.out.print("Ingrese la ruta del archivo .txt: ");
            String filePath = scanner.nextLine();

            ListaAndReader lister = new ListaAndReader();
            lister.readTxtFile(filePath);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}