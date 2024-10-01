public class Product {
   private String productId;
   private String productName;
   private int quantity;
   private double price;
   
   public Product (String productId, String productName, int quantity, double price) {
      this.productId = productId;
      this.productName = productName;
      this.quantity = quantity;
      this.price = price;
   }
   
   
   // getters
   public String getProdId(){
      return productId;
   }
   
   public String getProdName() {
      return productName;
   }
   
   public int getQuantity() {
      return quantity;
   }
   
   public double getPrice() {
      return price;
   }
   
   //setters
   public void setProdId(String productId) {
      this.productId = productId;
   }
   
   public void setProdName(String productName) {
      this.productName = productName;
   }
   
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   //other methods
   public void updateStock(int amount) {
      quantity = amount;
   }
}


class PerishableProduct extends Product {
   private String expirationDate;
   
   public PerishableProduct(String productId, String productName, int quantity, double price, String expirationDate){
      super(productId, productName, quantity, price);
      this.expirationDate = expirationDate;
   }
   
   // getter
   public String getExpDate() {
      return expirationDate;
   }
   
   // setter
   public void setExpDate(String expirationDate) {
      this.expirationDate = expirationDate;
   }
   
   // other methods
   @Override
   public void updateStock(int amount) {
      if (amount > 100)
         System.out.println("Cannot exceed the maximum quantity of 100");
      else
         setQuantity(amount);
   }
}


class NonPerishableProduct extends Product {
   private int shelfLife;
   
   public NonPerishableProduct(String productId, String productName, int quantity, double price, int shelfLife) {
      super(productId, productName, quantity, price);
      this.shelfLife = shelfLife;
   }
   
   // getter
   public int getShelfLife() {
      return shelfLife;
   }
   
   
   // setter
   public void setShelfLife(int shelfLife) {
      this.shelfLife = shelfLife;
   }
}