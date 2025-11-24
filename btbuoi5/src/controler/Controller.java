package controler;
import service.IbookServiceImpl;
import domain.Book;
import domain.Borrowable;
import domain.Novel;
import domain.TextBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    IbookServiceImpl service = new IbookServiceImpl();
    Scanner sc = new Scanner(System.in);
    public void Themsach(){
        while(true) {
            System.out.print("Nhập ID sách: ");
            String id = sc.nextLine();
            System.out.print("Nhập tên sách: ");
            String name = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String author = sc.nextLine();
            System.out.print("Nhập giá sách: ");
            double price = sc.nextDouble();
            System.out.print("Nhập số lượng: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Chọn loại sách (1. Novel / 2. TextBook): ");
            int type = sc.nextInt();
            sc.nextLine();
            Book book;
            if (type == 1) {
                System.out.print("Nhập genre: ");
                String genre = sc.nextLine();
                book = new Novel(id, name, author, price, quantity, genre);
            } else {
                System.out.print("Nhập subject: ");
                String subject = sc.nextLine();
                book = new TextBook(id, name, author, price, quantity, subject);
            }
            service.addBook(book);
            String choice = sc.nextLine();
            System.out.println("Muốn nhập tiếp : Y/N");
            if(choice.equalsIgnoreCase("N")){
                break;
            }

        }
    }
    public void Getsachbyid(){
        System.out.print("Nhập ID sách cần lấy: ");
        String Id = sc.nextLine();
        service.getBookById(Id);
        System.out.println("thong tin sach can lay: " + service.getBookById(Id).displayInfor());
    }
    public void GetsachtheoTL() {
        System.out.println("Nhập thể loại cần lấy: Novel / Textbook");
        System.out.println("Nhập loại sách cần lấy: ");
        String category = sc.nextLine();
        if (category.equalsIgnoreCase("Novel")) {
           Novel n = new Novel();
            ArrayList<Book> novels =service.getAllBookByCategory(n);
            System.out.println("---Menu novels sach -----");
            for(Book i : novels){
                System.out.println(i.displayInfor());
            }

        } else if (category.equalsIgnoreCase("textbook")) {
            TextBook tb = new TextBook();
            ArrayList<Book> textbooks =service.getAllBookByCategory(tb);
            System.out.println("---Menu text book  -----");
            for(Book i : textbooks){
                System.out.println(i.displayInfor());
            }
        }
    }
    public void Getall(){
       service.getAllBooks();
    }
    public void Xoabyid(){
        System.out.println("Nhap id sach can xoa");
        String id  = sc.nextLine();
        service.deleteBookById(id);
    }
    public void TongGT(){
        System.out.println("Tổng giá trị của thư viện: "+ service.calculateTotalValue());;
    }
}
