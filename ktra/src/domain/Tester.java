package domain;

public class Tester extends Employee implements IWorkable{
    private int bugsDetectedCount;
    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }
    @Override
    public double calculateSalary(){
        return this.getBASE_SLARY_RATE()*this.bugsDetectedCount + this.getBasicSalary();
    }
    @Override
    public void work(){
        System.out.println("Testingg...");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "bugsDetectedCount=" + bugsDetectedCount +
                '}';
    }
}
