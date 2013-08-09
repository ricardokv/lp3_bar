package entities;

public class Employee extends User {

    public Employee(Integer id, String login, String password, String name, String email) {
        super(id, login, password, name, email);
    }
    
    public String whoAmI()
    {
        return "Funcionário";
    }

    public void createClient() {
    }

    public void insertProduct() {
    }

    public void makeStore() {
    }

    public void makeSell() {
    }

    public void checkSellMonth() {
    }
}
