package organizingdata.replacedatawithobj.before;

public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String arg) {
        customer = arg;
    }
}
