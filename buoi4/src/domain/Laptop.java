package domain;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop() {
        super();
    }
    public Laptop( String name, String description, double price, String ram, String cpu) {
        super( name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }
    @Override
    public String getInfor(){
        return super.getInfor() +" Type: Laptop " +
                " ram: '" + ram  +
                " cpu: " + cpu ;
    }

}
