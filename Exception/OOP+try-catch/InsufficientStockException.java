class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class ProductNotFoundException extends RuntimeException {
   public ProductNotFoundException(String message) {
       super(message);
   }
}
