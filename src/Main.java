import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Option1 option1 = new Option1();
        Option2 option2 = new Option2();
        Option3 option3 = new Option3();

        Scanner sc = new Scanner(System.in);
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        int userOption = sc.nextInt();
        Path dataFile = Paths.get("src", "contacts.txt");
        List<Contact> contacts = new ArrayList<>();
        List<String> contents = null;
        try {
            contents = Files.readAllLines(
                    dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < contents.size(); i++) {
            contacts.add(new Contact(contents.get(i).substring(0, contents.get(i).indexOf("-")), contents.get(i).substring( contents.get(i).indexOf("-") + 1)));
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
                Contact contact = option3.searchThroughList(contacts);
                System.out.println(contact.getName() + " | " + contact.getNumber());

                break;
            case 4:
            default:

        }
        List<String> list = new ArrayList<>();
        for (Contact contact : contacts) {
            list.add(contact.getNumber() + "-" + contact.getName());
        }
        try {
            Files.write(dataFile, list);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
