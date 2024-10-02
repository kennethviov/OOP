public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0)
            this.quantity = quantity;
        else 
            throw new InvalidQuantityException("Quantity cannot be negative.");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // other methods
    public void updateStock(int amount) throws Exception {
        if ((quantity + amount) >= 0) {
            quantity += amount;
            System.out.println("Stock updated: " + productName + "new quantity is " + quantity + ".");
        } else 
            throw new InvalidQuantityException("Insufficient stock for product " + productName + ".");
    }
}


class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String productId, String productName, int quantity, double price, String expirationDate) {
        super(productId, productName, quantity, price);
        this.expirationDate = expirationDate;
    }

    // getter
    public String getExpirationDate() {
        return expirationDate;
    }

    // setter
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void updateStock(int amount) {
        if ((getQuantity() + amount) < 0) {
            throw new InsufficientStockException("Insufficient stock for product " + getProductName());
        } else if ((getQuantity() + amount) > 100)
            throw new IllegalArgumentException("Cannot exceed maximum quantity of 100 for perishable products.");
        else {
            setQuantity(getQuantity() + amount);
            System.out.println("Stock updated: " + getProductName() + " new quantity is " + getQuantity());
        }
    }
}

class NonPerishableProduct extends Product {
    private int shelfLife;

    public NonPerishableProduct (String productId, String productName, int quantity, double prize, int shelfLife) {
        super(productId, productName, quantity, prize);
        this.shelfLife = shelfLife;
    }

    // getter
    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
