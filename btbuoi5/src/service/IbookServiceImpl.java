package service;
import domain.Book;
import domain.Novel;
import domain.TextBook;
import constant.Constant;
import java.util.ArrayList;

public class IbookServiceImpl implements IBookService{
    static ArrayList<Book> listB= new ArrayList<>();
    public void addBook(Book book){
         listB.add(book);
         System.out.println(Constant.SUCESS_MES.Success_add);
    }

    public Book getBookById(String id){
         for(Book i : listB){
             if(i.getId().equalsIgnoreCase(id)){
                 System.out.println(Constant.SUCESS_MES.Success_getbook);
                 return i;
             }

         }
        System.out.println(Constant.ERROR_MES.Error_getbook);
         return null;
    }

    public ArrayList<Book> getAllBookByCategory(Object category){
        ArrayList<Book> list= new ArrayList<>();
        for(Book i : listB){
            if (category instanceof Novel && i instanceof Novel) {
                list.add(i);
            }else if(category instanceof TextBook && i instanceof TextBook){
                list.add(i);
            }
        }
        return list;
    }

    public void deleteBookById(String id){
        for (int j = 0; j < listB.size(); j++) {
            if(listB.get(j).getId().equalsIgnoreCase(id)) {
                listB.remove(j);
                System.out.println(Constant.SUCESS_MES.Success_remove);
            }
        }
    }

    public void getAllBooks(){
        for(Book i : listB){
            System.out.println(i.displayInfor());
        }
    }
    public double calculateTotalValue(){
          double priceoflibs = 0;
        for(Book i : listB){
           priceoflibs += i.getPrice()*i.getQuantity();
        }
        return priceoflibs;
    }
}
