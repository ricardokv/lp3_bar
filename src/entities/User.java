package entities;

abstract public class User {
    
    private Integer id;
    private String login;
    private String password;
    private String name;
    private String email;

    public User(Integer id, String login, String password, String name, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    
    abstract public String whoAmI();
    
    public Boolean isPasswordValid(String password) {
        return (password.equals(this.password));
    }
   
    public Boolean isLoginValid(String login) {
        return true;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public boolean makeLogin(String login, String password)
    {
        if(isLoginValid(login))
            if(isPasswordValid(password))
                return true;
            else
                return false;
        else
            return false;
    }
}
