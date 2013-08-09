package bar;

import entities.Account;
import entities.Client;
import entities.Employee;
import entities.Product;
import entities.Sell;
import entities.User;
import repositories.Repository;

public class Bar {
    
    private Repository<Sell> sells;
    private Repository<Product> products;
    private Repository<User> users;

    public static void main(String[] args) {
        new Bar().launch();
    }
    
    public void launch()
    {
        sells = new Repository<Sell>();
        products = new Repository<Product>();
        users = new Repository<User>();
        
        users.add(
                new Client(new Account(100.00F), 1, "alexandre", "123456", "Alexandre Lehmann Holzhey", "saleiro@gmail.com")
                );
        
        users.add(
                new Client(new Account(200.00F), 2, "ricardo", "654321", "Ricardo Krug Vilanova", "ricardokv@algumacoisa.com")
                );
        
        users.add(
                new Client(new Account(300.00F), 3, "juliana", "019283", "Juliana da Silva", "ju@algumacoisa.com")
                );
        
        users.add(
                new Employee(2, "vendedor", "000000", "Joao da Silva", "joao@bar.com.br")
                );
        
       
        while (users.hasNext()) {
            /*
            Object user = users.next();
            if (user instanceof Client) {
                System.out.println("Cliente:" + ((Client) user).getName());
            }
            if (user instanceof Employee) {
                System.out.println("Funcionário:" + ((Employee) user).getName());
            }
            */
            User user = users.next();
            System.out.println(user.whoAmI() + ": " + user.getName());
        }
        
        
    }
    
}
    