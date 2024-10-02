public class Main {
    public static void main(String[] args) {
        InventoryOperation inventory = new Inventory();
        
        // case 1
        System.out.println("Case 1:");
        PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31"); 
        inventory.addProduct(apple);

        // case 2
        System.out.println("\nCase 2");
        NonPerishableProduct rice = new NonPerishableProduct("NP001", "Rice", 200, 1.0, 365);
        inventory.addProduct(rice);


        // case 3
        System.out.println("\nCase 3");
        apple.updateStock(30);

        // case 4
        System.out.println("\nCase 4");
        try {
            apple.updateStock(30);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // case 5
        System.out.println("\nCase 5");
        try {
            inventory.removeProduct("P001");
        } catch (InsufficientStockException e) {
            System.err.println(e.getMessage());
        }

        // case 6
        System.out.println("\nCase 6");
        try {
            apple.updateStock(-90);
        } catch (InsufficientStockException e) {
            System.err.println(e.getMessage());
        }

        // case 7
        System.out.println("\nCase 7");
        try {
            apple.setQuantity(-10);
        } catch (InvalidQuantityException e) {
            System.err.println(e.getMessage());
        }

        //inventory.displayInventory();

        System.out.println();
    }
}
