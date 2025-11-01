import model.User;
import service.AuthService;
import service.UserService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> DS = new ArrayList<>();
        DS.add(new User("1", "admin", "123", "admin@gmail.com", "0123456789"));
        DS.add( new User("2", "alice", "111", "alice@gmail.com", "0909009009"));
        DS.add( new User("3", "bob", "222", "bob@gmail.com", "0988888888"));
        AuthService authService = new AuthService(DS);
        UserService uService = new UserService(DS);
        System.out.println("-----------Menu Auth---------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose){
            case 1:
                System.out.print("Nhap user name ");
                String username = sc.nextLine();
                System.out.println("Nhap password");
                String password = sc.nextLine();
                if(authService.Login(username,password)){
                        MenuUser(uService,authService);
                }
                break;
            case 2:
                System.out.print("Nhap user name ");
                String us = sc.nextLine();
                System.out.println("Nhap password");
                String pw = sc.nextLine();
                System.out.println("Nhap email");
                String em = sc.nextLine();
                System.out.println("Nhap sdt");
                String sdt = sc.nextLine();
                authService.Register(us,pw,em,sdt);
                break;
            case 3:
                System.out.println("exit menu");
                return;
        }
    }
    private static void MenuUser(UserService uService,AuthService authService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Menu User---------");
        System.out.println("1. Get user by id");
        System.out.println("2. Get all user");
        System.out.println("3. Change password");
        int choose = sc.nextInt();
        String id;
        switch (choose) {
            case 1:
                System.out.print("Nhap id ");
                id = sc.nextLine();
                uService.getUserById(id);
                break;
            case 2:
                uService.getAllUser();
                break;
            case 3:
                System.out.print("Nhap id ");
                id = sc.nextLine();
                System.out.print("Nhap new pass ");
                String newPass = sc.nextLine();
                System.out.print("Nhap confirm pass");
                String confirmPass = sc.nextLine();
                authService.ChangePass(id,newPass,confirmPass);
                break;
        }
    }
}