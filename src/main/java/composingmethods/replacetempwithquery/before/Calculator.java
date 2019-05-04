package composingmethods.replacetempwithquery.before;

public class Calculator {
    int quantity;
    double itemPrice;
    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        }
        else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
