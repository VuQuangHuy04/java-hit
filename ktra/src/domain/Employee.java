package domain;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private double basicSalary;
    private Device device;
    private static int enmployeeCount;
    private final double BASE_SLARY_RATE = 500000;
    public Employee(String id, String name, int age, double basicSalary, Device device) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.device = device;
    }
    public abstract double calculateSalary();
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device +
                ", BASE_SLARY_RATE=" + BASE_SLARY_RATE +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public static int getEnmployeeCount() {
        return enmployeeCount;
    }

    public static void setEnmployeeCount(int enmployeeCount) {
        Employee.enmployeeCount = enmployeeCount;
    }

    public double getBASE_SLARY_RATE() {
        return BASE_SLARY_RATE;
    }
}
