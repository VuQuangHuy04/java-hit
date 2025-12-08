public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mecxedes", 500);
        Car car2 = new Car("lambogini", 600);
        Car car3 = new Car("tai", 400);
        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);
        System.out.println("Start ! ");
        t1.start();
        t2.start();
        t3.start();
    }
}
