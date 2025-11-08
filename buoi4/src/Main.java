import controller.ProductController;
import domain.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ProductController p = new ProductController();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      do{
          System.out.println("---------Menu-----------");
          System.out.println("1.them product");
          System.out.println("2.xoa product theo id");
          System.out.println("3.hien thi product theo id");
          System.out.println("4.xuat danh sach product");
          System.out.print("nhap lua chon: " ); int choice = sc.nextInt();
          switch(choice){
              case 1: Add(); break;
              case 2: RemoveByid(); break;
              case 3: GetByid(); break;
              case 4: OutList(); break;
          }
      }while(true);
    }
    static void Add(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("nhap Type ");
            String type = sc.nextLine();
            System.out.print("nhap name san pham ");
            String name = sc.nextLine();
            System.out.print("nhap mo ta ");
            String description = sc.nextLine();
            System.out.print("nhap gia sp ");
            Double price = sc.nextDouble();
            sc.nextLine();
            p.addProduct(type,name,description,price);
            System.out.print("nhap tiep Y/N ");
            if(sc.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
    static void RemoveByid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id muon xoa ");
        int id = sc.nextInt();
        p.removeByID(id);
    }
    static void GetByid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id muon tim ");
        int id = sc.nextInt();
        p.getByID(id).getInfor();
    }
    static void OutList(){
        p.getALlProducts();
    }

}