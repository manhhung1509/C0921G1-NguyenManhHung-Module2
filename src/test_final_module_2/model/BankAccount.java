package test_final_module_2.model;

public abstract class BankAccount{
    private int accountID;
    private String accountCode;
    private String accountName;
    private String dateCreateAccount;

    public BankAccount() {
    }

    public BankAccount(int accountID, String accountCode, String accountName, String dateCreateAccount) {
        this.accountID = accountID;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.dateCreateAccount = dateCreateAccount;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDateCreateAccount() {
        return dateCreateAccount;
    }

    public void setDateCreateAccount(String dateCreateAccount) {
        this.dateCreateAccount = dateCreateAccount;
    }

    @Override
    public String toString() {
        return accountID + "," + accountCode + "," + accountName + "," + dateCreateAccount;
    }

}
