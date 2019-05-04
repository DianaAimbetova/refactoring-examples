package organizingdata.changevaltoref.before;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    private final String name;
    private static Dictionary instances = new Hashtable();

    static void loadCustomers() {
        new Customer ("Lemon Car Hire").store();
        new Customer ("Associated Coffee Machines").store();
        new Customer ("Bilston Gasworks").store();
    }
    private void store() {
        instances.put(this.getName(), this);
    }

    public static Customer getNamed (String name) {
        return (Customer) instances.get(name);
    }

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
