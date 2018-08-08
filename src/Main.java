import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        ViewContacts viewContacts = new ViewContacts();
        AddContact addContact = new AddContact();
        SearchContacts searchContacts = new SearchContacts();
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        List<String> contents;
        Boolean exit = false;

        Path dataFile = Paths.get("src", "contacts.txt");
        try {
            contents = Files.readAllLines(
                    dataFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Error();
        }
        for (String item : contents) {
            contacts.add(new Contact(item.substring(0, item.indexOf("-")), item.substring(item.indexOf("-") + 1)));
        }
        do {

            System.out.print("\n1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5): ");
            int userOption = sc.nextInt();
            switch (userOption) {
                case 1:
                    viewContacts.printList(contacts);
                    break;
                case 2:
                    contacts = addContact.addContact(contacts);
                    viewContacts.printList(contacts);
                    break;
                case 3:
                    Contact contact = searchContacts.searchThroughList(contacts);
                    System.out.println(contact.getName() + ": " + viewContacts.formatNumber(contact.getNumber()));
                    break;
                case 4:
                    contacts = DeleteContacts.deleteContact(contacts);
                    viewContacts.printList(contacts);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("That isnt a valid entry, try again!");

            }
        } while (!exit);
        List<String> list = new ArrayList<>();
        for (Contact contact : contacts) {
            list.add(contact.getName() + "-" + contact.getNumber());
        }
        try {
            Files.write(dataFile, list);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
