import service.IEmployeeServiceImpl;
import domain.Device;
import domain.Employee;
import domain.Developer;
import domain.Tester;
import java.util.ArrayList;
import java.util.List;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         IEmployeeServiceImpl ie = new IEmployeeServiceImpl();

         while(true){
             System.out.println("1. In ra danh sách tất cả các nhân viên");
             System.out.println("2. In ra thông tin nhiên viên theo ID");
             System.out.println("3. Lọc ra danh sách nhân viên theo Tên ");
             int choice = sc.nextInt();
             switch (choice){
                 case 1:
                     System.out.println("danh sach tat ca nhan vien");
                     for(Employee i : ie.getAllEmployees()){
                         i.toString();
                     }
                     break;
                 case 2:
                     System.out.println("nhap id");
                     String id = sc.nextLine();
                     System.out.println("thong tin nhan vien theo id");
                     ie.getEmployeeById(id).toString();
                     break;
                 case 3:
                     System.out.println("nhap name");
                     String name = sc.nextLine();
                     System.out.println("danh sach nhan vien theo name");
                     List<Employee> b = ie.getEmployeeByName(name);
                     for(Employee i: b){
                         i.toString();
                     }
                     break;
             }
         }

    }
}