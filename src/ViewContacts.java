import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ViewContacts {
    void printList(List<Contact> list) {
        String firstDigits;
        String lastDigits;
        System.out.println("\nName | Phone Number");
        System.out.println("-------------------");
        for (Contact item : list) {
            String number = item.getNumber();
            if (number.length() == 10) {
                firstDigits = "(" + number.substring(0, 3) + ") " + number.substring(3, 6);
                lastDigits = number.substring(6, 10);
            } else {
                firstDigits = number.substring(0, 3);
                lastDigits = number.substring(3, 7);
            }
            String printNumber = firstDigits + "-" + lastDigits;
            System.out.println(item.getName() + " | " + printNumber);
        }
    }
}
