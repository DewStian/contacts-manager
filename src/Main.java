import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Option1 option1 = new Option1();
        Option2 option2 = new Option2();
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
        Path dataFile = Paths.get(directory, filename);
        List<Contact> contacts = new ArrayList<>();
        List<String> contents = Files.readAllLines(
                dataFile);
        for (int i = 0; i < contents.size(); i++) {
            String name = contents.get(i).substring(0, contents.get(i).indexOf("-"));
            String number = contents.get(i).substring( contents.get(i).indexOf("-") + 1);
            contacts.add(new Contact(name, number));
        }
        switch (userOption) {
            case 1:
                option1.printList(contacts);
                break;
            case 2:
                contacts = option2.addContact(contacts);
                option1.printList(contacts);
                break;
            case 3:
            case 4:
            default:

        }

    }
}
