import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ViewContacts {
    void printList(List<Contact> list) {
        System.out.println("\nName | Phone Number");
        System.out.println("-------------------");
        for (Contact item : list ) {
            System.out.println(item.getName() + " | " + item.getNumber());
        }
    }
}
