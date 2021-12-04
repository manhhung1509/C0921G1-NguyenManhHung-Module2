package test_final_module_2.model;

public class PaymentAccount extends BankAccount {
    private int cardNumber;
    private int moneyInAccount;

    public PaymentAccount() {
    }

    public PaymentAccount(int cardNumber, int moneyInAccount) {
        this.cardNumber = cardNumber;
        this.moneyInAccount = moneyInAccount;
    }

    public PaymentAccount(int accountID, String accountCode, String accountName, String dateCreateAccount, int cardNumber, int moneyInAccount) {
        super(accountID, accountCode, accountName, dateCreateAccount);
        this.cardNumber = cardNumber;
        this.moneyInAccount = moneyInAccount;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(int moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        return getAccountID() + "," + getAccountCode() + "," + getAccountName() + "," + getDateCreateAccount() +
                "," + cardNumber + "," + moneyInAccount;
    }
}
