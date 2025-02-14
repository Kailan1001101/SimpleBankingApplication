package SimpleBanking;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {
if(getBalance()-amount>=overdraftLimit){
    setBalance(getBalance()-amount);
}
else{
    System.out.print("You have reached your limit, withdrawal cannot be bad");
}
    }



    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public String toString() {
        return "Checking Account - " + super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }
}
