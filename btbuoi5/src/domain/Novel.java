package domain;

public class Novel extends Book{
    private String genre;
    public Novel(){
    }
    public Novel(String id, String title, String author, double price, int quantity, String genre) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }
    @Override
    public String displayInfor(){
        return super.displayInfor() + ", genre: "+ this.genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
