import java.util.*;

class UserMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        Inventory inventory = new Inventory();
        Product prod;
        
        
        int choice;
        
        do {
            menu();
            choice = validInt("Enter your choice: ", scan);
            
            switch(choice) {
               case 0: break;
               case 1:
                   System.out.println("\nInventory");
                   inventory.displayInventory();
                   break;
               case 2:
                   System.out.println("\nAdd Perishable Product");
                   inventory.addProduct(new PerishableProduct(
                       validString("Enter Product ID: ", scan),
                       validString("Enter Product Name: ", scan),
                       validInt("Enter Product Quantity: ", scan),
                       validDouble("Enter Product Price: ", scan),
                       validString("Enter Product Expiration Date: ", scan)
                       ));
                   break;
               case 3:
                   System.out.println("\nAdd Non-Perishable Product");
                   inventory.addProduct(new NonPerishableProduct(
                       validString("Enter Product ID: ", scan),
                       validString("Enter Product Name: ", scan),
                       validInt("Enter Product Quantity: ", scan),
                       validDouble("Enter Product Price: ", scan),
                       validInt("Enter Product Shelf Life: ", scan)
                       ));
                   break;
               case 4:
                   System.out.println("\nRemove Product From Inventory");
                   inventory.removeProduct(
                       validString("Enter Product ID: ", scan));
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
                   break;
            }
        
        } while (choice != 0);
        
    }
    
    static void menu() {
        System.out.println("\nMain Menu");
        System.out.println("[1] Inventory");
        System.out.println("[2] Add Perishable Product");
        System.out.println("[3] Add Non-Perishable Product");
        System.out.println("[4] Remove Product");
        System.out.println("[0] Exit");
    }
    
    static int validInt(String prompt, Scanner scan) {
        int num = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(prompt);
                num = scan.nextInt();
                isValid = true;
            } catch (InputMismatchException ime) {
                System.err.println("Error! Input should be an integer");
                flush(scan);
            }
        }

        return num;
    }

    static double validDouble(String prompt, Scanner scan) {
        double num = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(prompt);
                num = scan.nextDouble();
                isValid = true;
            } catch (InputMismatchException ime) {
                System.err.println("Error! Input should be an double");
                flush(scan);
            }
        }

        return num;
    }

    static String validString(String prompt, Scanner scan) {
        //flush(scan);
        String str = "";
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(prompt);
                str = scan.nextLine();
                isValid = true;
            } catch (InputMismatchException ime) {
                System.err.println("Error! Input should be a string");
                flush(scan);
            }
        }

        return str;
    }

    // displays new line
    static void newLine() {
        System.out.println();
    }

    // eats whitespace
    static void flush(Scanner scan) {
        scan.next();
    }
}
