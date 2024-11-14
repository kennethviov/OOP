import java.util.*;

public class ContactMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactManagementSystem contacts = new ContactManagementSystem();

        int option = 0;
        do {
            menu();
            option = inputInt("Choose an option: ", scan);
            System.out.println(); // space between the menu and the function

            switch (option) {
                case 1:
                    System.out.println("======== Add a New Contact ==========");
                    if (contacts.addContact(inputString("Enter name: ", scan)))
                        System.out.println("Contact added successfully!");
                    else 
                        System.out.println("Contact addition unsucessful...");
                    System.out.println("=====================================");
                    break;
                case 2:
                    System.out.println("=========== View Contacts ===========");
                    contacts.viewContacts();
                    System.out.println("=====================================");
                    break;
                case 3:
                    if (contacts.isEmpty()) {
                        System.out.println("No contact to update. File is empty.");
                        break;
                    }
                    System.out.println("==== Update an Existing Contact =====");
                    if (contacts.updateContact(
                        inputString("Enter the name you want to update: ", scan), 
                        inputString("Enter the new name: ", scan)))
                        System.out.println("Contact updated successfully!");
                    else 
                        System.out.println("Contact update unsuccessful...");
                    
                    System.out.println("=====================================");
                    break;
                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("No contact to delete. File is empty.");
                        break;
                    }
                    System.out.println("========= Delete a Contact ==========");
                    if (contacts.deleteContact(inputString("Enter name: ", scan)))
                        System.out.println("Contact deleted successfully!");
                    else
                        System.out.println("Contact deletion unsuccessful...");
                    
                    System.out.println("=====================================");
                    break;
                case 5: 
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
            System.out.println(); 
        } while (option != 5);

        scan.close();
    }

    static void menu() {
        System.out.println("===== Contact Management System =====");
        System.out.println("[1] Add Contact");
        System.out.println("[2] View Contacts");
        System.out.println("[3] Update Contact");
        System.out.println("[4] Delete Contact");
        System.out.println("[5] Exit");
        System.out.println("=====================================");
    }

    static String inputString(String prompt, Scanner scan) {
        String str;
        do {
            System.out.print(prompt);
            str = scan.nextLine();
        } while (str.isEmpty());
        return str;
    }

    static int inputInt(String prompt, Scanner scan) {
        int num = 0;

        while (true) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                scan.nextLine(); // eats whitespace
                break;
            } else {
                System.err.println("Error! Input should be an integer");
                scan.nextLine(); // eats whitespace
            }
        }

        return num;
    }
}
