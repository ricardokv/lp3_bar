package entities;

public class Client extends User {

    private Account account;

    public Client(Account account, Integer id, String login, String password, String name, String email) {
        super(id, login, password, name, email);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public String whoAmI()
    {
        return "Cliente";
    }
        
}
