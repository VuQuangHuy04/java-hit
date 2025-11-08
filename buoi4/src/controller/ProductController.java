package controller;

import domain.Laptop;
import domain.Product;
import domain.SmartPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> DS = new ArrayList<>();

    public ProductController() {
    }
    public void addProduct(Product product){
        DS.add(product);
    }
    public void addProduct(String type,String name, String description, Double price){
        if(type.equalsIgnoreCase("smartphone")){
            System.out.println("Co 5G khong ? Nhap true/false ");
            boolean has5G = sc.nextBoolean();
            Product phone = new SmartPhone(name,description,price,has5G);
            DS.add(phone);
        }else if(type.equalsIgnoreCase("laptop")){
            System.out.print("nhap ram ");
            String ram = sc.nextLine();
            System.out.print("nhap cpu ");
            String cpu = sc.nextLine();
            Product laptop = new Laptop(name,description,price,ram,cpu);
            DS.add(laptop);
        }else{
            System.out.println("khong co type doi tuong them vao");
        }
    }
    public void removeByID(int id){
        for(Product item : DS){
            if(item.getId() == id){
                DS.remove(item);
                System.out.println("Da xoa product");
                break;
            }
        }
        System.out.println("khong tim thay product co id can tim");
    }
    public Product getByID(int id){
        for(Product item : DS){
            if(item.getId() == id){
               return item;
            }
        }
        return null;
    }
    public void getALlProducts(){
        for(Product item : DS) {
           System.out.println(item.getInfor());
        }
    }

}
