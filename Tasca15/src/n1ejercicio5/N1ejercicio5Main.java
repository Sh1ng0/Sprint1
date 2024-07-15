package n1ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class N1ejercicio5Main {

    
    public static void serializeObject(Person person, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Objeto serializado y guardado en " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    
    public static Person deserializeObject(String filename) {
        Person person = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Person) in.readObject();
            System.out.println("Objeto deserializado desde " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase Person no encontrada");
            c.printStackTrace();
        }
        return person;
    }

    public static void main(String[] args) {
        Person person = new Person("Perico de los Palotes", 30);

       
        String filename = "person.ser";
        serializeObject(person, filename);

        
        Person deserializedPerson = deserializeObject(filename);
        System.out.println("Objeto deserializado: " + deserializedPerson);
    }
}