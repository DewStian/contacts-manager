import java.util.List;

class DeleteContacts {
    static List<Contact> deleteContact (List<Contact> contacts) {
        SearchContacts search = new SearchContacts();
        Contact contact = search.searchThroughList(contacts);
        contacts.remove(contact);
        return contacts;
    }
}
