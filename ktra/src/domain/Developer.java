package domain;

public class Developer extends Employee implements IDebuggable,IWorkable{
    private int overtimeHours;

    public Developer(String id, String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateSalary(){
        return this.getBASE_SLARY_RATE()*this.overtimeHours + this.getBasicSalary();
    }
    @Override
    public void work(){
        System.out.println("Coding...");
    }
    public void fixBug(){
        System.out.println("fix bugging ...");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "overtimeHours=" + overtimeHours +
                '}';
    }
}
