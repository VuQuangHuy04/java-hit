package domain;

public class TextBook extends Book{
    private String subject;
    public TextBook(){}
    public TextBook(String id, String title, String author, double price, int quantity, String subject) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }
    @Override
    public String displayInfor(){
        return super.displayInfor() + ", subject: "+ this.subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
