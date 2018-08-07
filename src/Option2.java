import java.util.*;
public class Option2 {
    public List<Contact> addContact(List<Contact> contents){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name for the new contact?");
        String newName = sc.nextLine();
        System.out.println("What is the number for the new contact?");
        String newNumber = sc.nextLine();
        contents.add(new Contact(newName, newNumber));
        return contents;
    }


}
