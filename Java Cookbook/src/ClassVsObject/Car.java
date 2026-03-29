package ClassVsObject;

public class Car {
    String brand;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println("this object address: " + this);
        System.out.println(brand + " is going at " + speed + " km/h");
    }
}
