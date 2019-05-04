package organizingdata.replacedatawithobj.after;

public class Customer {
    private final String name;
    private Customer customer;

    public Customer(String name) {
        this.name = name;
    }

    public String getCustomerName() {
         return customer.getName();
    }

    public void setCustomer(String arg) {
        customer = new Customer(arg);
    }

    public String getName() {
        return name;
    }
}
