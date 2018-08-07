import java.util.*;
import java.nio.file.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        int userOption = sc.nextInt();
        String directory = "src";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        try {
            List<String> contents = Files.readAllLines(
                    dataFile);
            System.out.println(contents);
        } catch (Exception e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
        switch(userOption){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            default :

        }

    }
}
