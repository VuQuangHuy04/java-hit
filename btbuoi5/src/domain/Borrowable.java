package domain;

public interface Borrowable {
    public boolean borrow(int quantity);
    public int getAvailableQuality();
}
