package movingfeaturesbetweenobj.movefield.after;

public class Account {
    private AccountType type;
    double interestForAmount_days (double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }

    private class  AccountType {
        private double interestRate;
        void setInterestRate (double arg) {
            interestRate = arg;
        }

        double getInterestRate () {
            return interestRate;
        }

    }
}
