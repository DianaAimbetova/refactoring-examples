package composingmethods.inlinemethod.after;

public class PizzaDelivery {
    private int numberOfLateDeliveries;

    public PizzaDelivery(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
