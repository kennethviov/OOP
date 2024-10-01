public class Main {
   public static void main(String[] args) {
      PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31"); 
      Inventory.addProduct(apple);
   }
}