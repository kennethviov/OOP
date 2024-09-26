import java.util.*;

public class Exception {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int choice;
      
      do {
         menu();
         choice = scan.nextInt();
         
         switch (choice) {
            case 1:
               Rectangle rect = new Rectangle(0.0, 0.0);
               int encapchoice;
               do {
                  encapmenu();
                  encapchoice = scan.nextInt();
                  
                  switch (encapchoice) {
                     case 1:
                        break;
                     case 2:
                        break;
                     case 3:
                        break;
                     case 4:
                        break;
                     case 0:
                        break;
                     default:
                        break;
                  }
               } while (encapchoice != 0);
               break;
            case 2:
               break;
            case 3:
               break;
            case 4:
               break;
            case 0:
               break;
            default:
               break;
         }
      } while (choice != 0);
   }
   
   static void menu() {
      System.out.println("\nMain Menu");
      System.out.println("[1] Encapsulation");
      System.out.println("[2] Inheritance");
      System.out.println("[3] Polymorphism");
      System.out.println("[4] Abstraction");
      System.out.println("[0] Exit");
   }
   
   static void encapmenu() {
      System.out.println("\nEncapsulation Menu: Rectangle Attributes");
      System.out.println("[1] Set Rectangle Attributes");
      System.out.println("[2] Display Attributes");
      System.out.println("[3] Calculate Area");
      System.out.println("[4] Calculate Perimeter");
      System.out.println("[0] Back to Main Menu");
   }
}
