package movingfeaturesbetweenobj.movemethod.before;

public class AccountInterest {
    private BankAccount bankAccount;

    public AccountInterest(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getInterestRate() {
        return bankAccount.calculateInterestRate();
    }

    public boolean isIntroductoryRate() {
        return bankAccount.calculateInterestRate() < 0.05;
    }
}

