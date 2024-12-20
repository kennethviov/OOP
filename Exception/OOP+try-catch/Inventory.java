import java.util.ArrayList;

interface InventoryOperation {
    public void addProduct(Product product);
    public void removeProduct(String productId);
    public void displayInventory();
}

class Inventory implements InventoryOperation {
    ArrayList<Product> list = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        list.add(product);
        System.out.println("Product added: " + list.get(list.size()-1).getProductName() + " with quantity " + list.get(list.size()-1).getQuantity());
    }

    @Override
    public void removeProduct(String productId) {
        boolean found = false;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProductId().equals(productId)) {
                list.remove(i);
                System.out.println("Product " + productId + " removed successfully.");
                found = true;
                break;
            }
        }
        
        if (found == false)
            throw new ProductNotFoundException("Product "+ productId +" not found.");
    }

    @Override
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        System.out.println("====================");
        for (Product product : list) {
            System.out.println(
                "\nProduct Name: " + product.getProductName() + 
                "\nPrice: "        + product.getPrice() +
                "\nProduct ID: "   + product.getProductId() + 
                "\nQuantity: "     + product.getQuantity());
        }
        System.out.println("====================");
    }
}
