import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ViewContacts {
    void printList(List<Contact> list) {
        Boolean intNumberExists = false;
        for (Contact item : list) {
            if (item.getNumber().length() == 13) {
                intNumberExists = true;
            }
        }
        if (intNumberExists) {
            System.out.println("\nName       |   Phone number   |");
            System.out.println("-------------------------------");
        } else {
            System.out.println("\nName       |  Phone number  |");
            System.out.println("-----------------------------");
        }
        for (Contact item : list) {
            String number = item.getNumber();
            String printNumber = formatNumber(number);
            if (intNumberExists) {
                System.out.printf("%-10s | %16s |%n", item.getName(), printNumber);
            } else {
                System.out.printf("%-10s | %14s |%n", item.getName(), printNumber);
            }
        }
    }

    String formatNumber(String number) {
        String firstDigits;
        String lastDigits;
        if (number.length() == 13) {
            firstDigits = number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 9);
            lastDigits = number.substring(9, 13);
        } else if (number.length() == 10) {
            firstDigits = "(" + number.substring(0, 3) + ") " + number.substring(3, 6);
            lastDigits = number.substring(6, 10);
        } else {
            firstDigits = number.substring(0, 3);
            lastDigits = number.substring(3, 7);
        }
        return firstDigits + "-" + lastDigits;
    }
}