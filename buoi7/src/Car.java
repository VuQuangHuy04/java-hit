import java.util.Random;

public class Car implements Runnable {
    private String name;
    private double speed;
    private Random rand = new Random();

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        try {
            for (int km = 1; km <= 30; km++) {
                if (rand.nextInt(100) < 10) {
                    throw new BrokenCarException("Xe " + this.name + " đã bị nổ lốp!");
                }

                long sleepTime = 100 + rand.nextInt((int) this.speed);
                Thread.sleep(sleepTime);

                System.out.println( this.name + " đã chạy được " + km + " km");
            }
            System.out.println( this.name + " đã chạy về đích");
        }
        catch (BrokenCarException e) {
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e) {
            System.out.println("Xe " + this.name + " bị dừng đột ngột");
        }
    }
}
