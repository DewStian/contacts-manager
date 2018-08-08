import java.util.List;
import java.util.Scanner;

class DeleteContacts {
    static List<Contact> deleteContact (List<Contact> contacts) {
        SearchContacts search = new SearchContacts();
        Contact contact = search.searchThroughList(contacts);
        contacts.remove(contact);
        return contacts;
    }
}
