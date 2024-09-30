import java.util.*;

public class Exception {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int choice;
        
        do {
            Displays.menu();
            choice = validInt("Enter choice: ", scan);
            
            switch (choice) {
                case 0: break;
                case 1:
                    Rectangle rect = new Rectangle(0.0, 0.0);
                    
                    int encapchoice;
                    do {
                        Displays.encapmenu();
                        encapchoice = validInt("Enter choice: ", scan);
                        
                        switch (encapchoice) {
                            case 0: break;
                            case 1:
                                newLine();
                                rect.setDimensions(
                                    validDouble("Enter width: ", scan), 
                                    validDouble("Enter height: ", scan));
                                break;
                            case 2:
                                System.out.println("\nWidth: " + rect.getWidth());
                                System.out.println("Height: " + rect.getHeight());
                                break;
                            case 3:
                                System.out.println("\nRectangle Area: " + rect.calculateArea());
                                break;
                            case 4:
                                System.out.println("\nRectangle Perimeter: " + rect.calculatePerimeter());
                                break;
                            default:
                                System.out.println("\nInvalid choice. Please try again.");
                                break;
                        }
                    } while (encapchoice != 0);
                    break;
                case 2:
                    Shape c = new Circle(0.0);
                    Shape s = new Square(0.0);
                    
                    int inherchoice;
                    do {
                        Displays.inhermenu();
                        inherchoice = validInt("Enter choice: ", scan);
                        
                        switch (inherchoice) {
                            case 0: break;
                            case 1:
                                newLine();
                                c = new Circle(validDouble("Enter radius: ", scan));
                                break;
                            case 2:
                                newLine();
                                s = new Square(validDouble("Enter side length: ", scan));
                                break;
                            case 3:
                                System.out.println("\nCircle Area: "+c.area());
                                break;
                            case 4:
                                System.out.println("\nSquare Area: "+s.area());
                                break;
                            default:
                                System.out.println("\nInvalid choice. Please try again.");
                                break;
                        }
                    } while (inherchoice != 0);
                    break;
                case 3:
                    Payment crdt = new CreditCardPayment(00000, 000, "Gesim", "01-01-2021");
                    Payment ppl = new PayPalPayment("gesim123@gmail.com");
                    
                    int polychoice;
                    do {
                        Displays.polymenu();
                        polychoice = validInt("Enter choice: ", scan);
                        
                        switch (polychoice) {
                            case 0: break;
                            case 1:
                                newLine();
                                crdt = new CreditCardPayment(
                                    validInt("Enter card number: ", scan),
                                    validInt("Enter cvv: ", scan), 
                                    validString("Enter Name: ", scan), 
                                    validString("Enter expiration Date: ", scan));
                                newLine();
                                crdt.processPayment();
                                break;
                            case 2:
                                newLine();
                                ppl = new PayPalPayment(validString("Enter email address: ", scan));
                                newLine();
                                ppl.processPayment();
                                break;
                            default:
                                System.out.println("\nInvalid choice. Please try again.");
                                break;
                        }
                    } while (polychoice != 0);
                    break;
                case 4:
                    Appliance ref = new Refrigerator();
                    Appliance washing = new WashingMachine();
                    
                    int abschoice;
                    do {
                        Displays.abstmenu();
                        abschoice = validInt("Enter choice: ", scan);

                        switch (abschoice) {
                            case 0: break;
                            case 1: newLine(); ref.turnOn();      break;
                            case 2: newLine(); ref.turnOff();     break;
                            case 3: newLine(); washing.turnOn();  break;
                            case 4: newLine(); washing.turnOff(); break;
                            default:
                                System.out.println("\nInvalid choice. Please try again.");
                                break;
                        }
                    } while (abschoice != 0);
                    break;
                    default:
                    System.out.println("\nInvalid choice. Please try again.");
                break;
            }
        } while (choice != 0);

        scan.close();
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
        flush(scan);
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

    static void newLine() {
        System.out.println();
    }

    // eats whitespace
    static void flush(Scanner scan) {
        scan.next();
    }
}
