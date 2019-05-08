package movingfeaturesbetweenobj.removemiddleman.before;

import movingfeaturesbetweenobj.movefield.before.Account;

public class AccountManager {
    private AccountDataProvider dataProvider;

    public AccountManager(AccountDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public Account getAccount(int id) {
        return dataProvider.getAccount(id);
    }
}
