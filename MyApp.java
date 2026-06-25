import mypackage.House;
import mypackage.Car;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("My App");

        House myHouse = new House();
        System.out.println(myHouse);

        Car.aboutCar();

        Car myCar = new Car();
        myCar.drive();
        myCar.startEngine();
    }
}
