package organizingdata.replacedatawithobj.before;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    private static int numberOfOrdersFor(Collection orders, String
            customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order order = (Order) iter.next();
            if (order.getCustomer().equals(customer)) result++;
        }
        return result;
    }
}
