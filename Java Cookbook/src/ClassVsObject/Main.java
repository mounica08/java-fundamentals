package ClassVsObject;

public class Main {
    static void main(String[] args) throws InterruptedException {
        while(true) {
            Car c1 = new Car();
            c1.brand = "Toyota";

            Car c2 = new Car();
            c2.brand = "Toyota";

            c1.accelerate();
            c2.accelerate();

            System.out.println(c1.brand);
            //c1.brand = new String("Toyota");
            System.out.println(c2.brand);

            Thread.sleep(1000);  // pause 1 second between each loop
        }
    }
}
