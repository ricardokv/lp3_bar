package entities;

import java.util.Date;
import repositories.Repository;

public class Sell {
    
    private Integer id;
    private Repository<Product> sellProducts;
    private Client client;
    private Date date;
    private Float price;
    private Boolean done;

    public Sell(Integer id, Repository<Product> sellProducts, Client client, Date date, Float price) {
        this.id = id;
        this.sellProducts = sellProducts;
        this.client = client;
        this.date = date;
        this.price = price;
        this.done = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Repository<Product> getProduct() {
        return sellProducts;
    }

    public void setProduct(Repository<Product> sellProducts) {
        this.sellProducts = sellProducts;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
    public void commitSell() {
        if (!done) {
            client.getAccount().doWithdrawn(price);
            done = true;
        }
    }
    
    public void rollbackSell() {
        if (done) {
            client.getAccount().doDeposit(price);
            done = false;
        }
    }
    
}
