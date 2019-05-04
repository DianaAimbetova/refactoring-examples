package organizingdata.changevaltoref.before;

public class Order {
    public Order (String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }
    private Customer customer;
}
