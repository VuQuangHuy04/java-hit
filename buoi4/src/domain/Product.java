package domain;
import controller.ProductController;

import java.util.UUID;

public class Product {
    private int id;
    static int next = 0;
    private String name;
    private String description;
    private double price;
    public Product(){}
    public Product(String name, String description, double price) {
        this.id = next++;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Product getById(int id){
        for(Product p : ProductController.DS){
              return p;
        }
        return null;
    }

    public String getInfor(){
        return "Product " +
                "id: " + id +
                " name: " + name + '\'' +
                " description: '" + description + '\'' +
                " price: " + price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
