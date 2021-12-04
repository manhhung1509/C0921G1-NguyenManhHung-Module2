package test_final_module_2.model;

public class SavingAccount extends BankAccount {
    private int SavingDepositAmount;
    private String savingDay;
    private double interestRate;
    private int period;

    public SavingAccount() {
    }

    public SavingAccount(int savingDepositAmount, String savingDay, double interestRate, int period) {
        SavingDepositAmount = savingDepositAmount;
        this.savingDay = savingDay;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SavingAccount(int accountID, String accountCode, String accountName, String dateCreateAccount,
                         int savingDepositAmount, String savingDay, double interestRate, int period) {
        super(accountID, accountCode, accountName, dateCreateAccount);
        SavingDepositAmount = savingDepositAmount;
        this.savingDay = savingDay;
        this.interestRate = interestRate;
        this.period = period;
    }

    public int getSavingDepositAmount() {
        return SavingDepositAmount;
    }

    public void setSavingDepositAmount(int savingDepositAmount) {
        SavingDepositAmount = savingDepositAmount;
    }

    public String getSavingDay() {
        return savingDay;
    }

    public void setSavingDay(String savingDay) {
        this.savingDay = savingDay;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return getAccountID() + "," + getAccountCode() + "," + getAccountName() + "," + getDateCreateAccount() +
                "," + SavingDepositAmount + "," + savingDay + "," + interestRate + "," + period;
    }
}
