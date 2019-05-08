package organizingdata.replacedatawithobj.after;

public class Customer {
    private String name;
    private Customer customer;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
