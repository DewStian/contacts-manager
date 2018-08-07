import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Option1 {
    void printList(List<Contact> list) {
        System.out.println("Name | Phone Number");
        System.out.println("-------------------");
        for (Contact item : list ) {
            System.out.println(item.getName() + " | " + item.getNumber());
        }
    }
}
