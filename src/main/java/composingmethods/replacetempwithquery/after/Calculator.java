package composingmethods.replacetempwithquery.after;

public class Calculator {
    int quantity;
    double itemPrice;
    double getPrice() {
        return basePrice() * discountFactor();
    }
    double basePrice() {
        return quantity * itemPrice;
    }
    private double discountFactor() {
        if (basePrice() > 1000) return 0.95;
        else return 0.98;
    }
}
