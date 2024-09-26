class Payment {
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void processPayment() {
        System.out.println("PayPal payment is processing from user " + email +  "...");
    }
}

class CreditCardPayment extends Payment {
    private int cardnumber;
    private String cardholdername;
    private String expirationdate;
    private int cvv;
    
    public CreditCardPayment(int cardnumber, String cardholdername, String expirationdate, int cvv) {
       this.cardnumber = cardnumber;
       this.cardholdername = cardholdername;
       this.expirationdate = expirationdate;
       this.cvv = cvv;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of user " + cardholdername + "...");
    }
}