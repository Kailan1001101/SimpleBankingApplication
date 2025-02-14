package SimpleBanking;

abstract class Account {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    @Override
    public String toString(){
        return "Account Number: "+ accountNumber+", Holder: "+accountHolder+", Balance: "+balance;
    }

}