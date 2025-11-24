import service.IbookServiceImpl;
import domain.Book;
import domain.Borrowable;
import domain.Novel;
import domain.TextBook;
import controler.Controller;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Lấy sách theo ID");
            System.out.println("3. Lấy tất cả sách theo thể loại (TextBook/Novel)");
            System.out.println("4. Lấy tất cả sách");
            System.out.println("5. Xóa sách theo ID");
            System.out.println("6. Tổng giá trị thư viện");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            Controller run = new Controller();
            switch(choice){
                case 1:
                     run.Themsach();
                    break;
                case 2:
                     run.Getsachbyid();
                    break;
                case 3:
                    run.GetsachtheoTL();
                     break;
                case 4:
                    run.Getall();
                    break;
                case 5:
                    run.Xoabyid();
                    break;
                case 6:
                    run.TongGT();
                    break;
                default:
                    System.out.println("thoat");
                    break;
            }

        }while(true);

    }
}