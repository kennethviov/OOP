import java.util.ArrayList;

interface InventoryOperation {
   public void addProduct(Product product);
   public void removeProduct(String productId);
}

class Inventory implements InventoryOperation {
   ArrayList<Product> list = new ArrayList<>();

   @Override
   public void addProduct(Product product) {
      list.add(product);
   }
   
   @Override
   public void removeProduct(String productId) {
      for (int i = 0; i < list.size(); i++) {
         if (!list.get(i).getProdId().equals(productId)) {
            list.remove(i);
         }
      }
   }
}