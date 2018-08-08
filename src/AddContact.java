import java.util.*;
public class AddContact {
    public List<Contact> addContact(List<Contact> contents){
        Scanner sc = new Scanner(System.in);
        boolean newnewName = true;
        boolean rightLength = true;
        String newName = "";
        while(newnewName) {
            System.out.println("What is the name for the new contact?");
            newName = sc.nextLine();
            for (Contact item : contents){
                if(newName.equals(item.getName())){
                    System.out.println("WARNING!!!");
                    System.out.println("That name is already a contact, Do you want to overwrite it? (Y/N)");
                    String overwrite = sc.nextLine();
                    if(overwrite.equals("N")){
                        newnewName = false;
                        rightLength = false;
                        break;
                    }else{
                        contents.remove(item);
                        newnewName = false;
                        break;
                    }
                }
                newnewName = false;
            }
        }
        String newNumber = "";
        while(rightLength) {
            System.out.println("What is the number for the new contact?");
            newNumber = sc.nextLine();
            if(newNumber.length() == 7 || newNumber.length() == 10 || newNumber.length() == 13){
                rightLength = false;
            }else{
                System.out.println("That is not a valid phone number. Try again!");
            }
        }
        contents.add(new Contact(newName, newNumber));
        return contents;
    }


}
