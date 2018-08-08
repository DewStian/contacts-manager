import java.util.List;
import java.util.*;

class SearchContacts {
    Contact searchThroughList(List<Contact> list) {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact("Contact", "does not exist");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        for (Contact item : list) {
            if (item.getName().equals(name)) {
                contact = item;
            }
        }
        return contact;
    }
}
