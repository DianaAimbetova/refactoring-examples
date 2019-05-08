package makingmethodcallssimpler.addremoveparams.after;

import java.util.Date;
import java.util.Random;

public class Customer {
    private Contact contact;

    public Contact getContact() {
        if (contact.isValid()) {
            return contact;
        }
        return new Contact();
    }

    private class Contact {

        public boolean isValid() {
            if (contact.getDate().before(new Date())) {
                return true;
            }
            return false;
        }

        private Date getDate() {
            long ms = -946771200000L + (Math.abs(new Random().nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
            return new Date(ms);
        }
    }
}
