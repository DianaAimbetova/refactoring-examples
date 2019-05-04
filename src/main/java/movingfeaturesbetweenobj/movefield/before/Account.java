package movingfeaturesbetweenobj.movefield.before;

public class Account {
    private AccountType type;
    private double interestRate;
    double interestForAmount_days (double amount, int days) {
        return interestRate * amount * days / 365;
    }

    private class  AccountType {

    }
}
