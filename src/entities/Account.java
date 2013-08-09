package entities;

public class Account {
    
    private Float balance;

    public Account(Float balance) {
        this.balance = balance;
    }
    
    public void doDeposit(Float amount) {
        balance += amount;
    }
    
    public Boolean doWithdrawn(Float amount) 
    {
        if ((balance - amount) < 0) 
            return false;
        else {
            balance -= amount;
            return true;
        }
    }
    
    public void doTransfer(Float amount, Account account1,Account account2) {
        if(account2.doWithdrawn(amount)) account1.doDeposit(amount);
    }
    
    public Float showBalance(Account account)
    {
        return account.balance;
    }
    
}
